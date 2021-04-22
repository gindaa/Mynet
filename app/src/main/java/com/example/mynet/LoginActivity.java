package com.example.mynet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mynet.Remote.RetrofitClient;
import com.example.mynet.Service.APIServiceLogin;
import com.example.mynet.model.Login;
import com.example.mynet.model.LoginResponse;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {

            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl("https://apimynet.hulwa.co.id")
                    .addConverterFactory(GsonConverterFactory.create());

            Retrofit retrofit = builder.build();
            APIServiceLogin apiServiceLogin = retrofit.create(APIServiceLogin.class);

    SharedPreferences sharedPreferences;
    private EditText usernames;
    private EditText passwords;
    String token;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText usernameEt = (EditText)findViewById(R.id.username);
        EditText passwordEt = (EditText)findViewById(R.id.password);
        Button login = (Button)findViewById(R.id.loginbutton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(usernameEt.getText().toString()) || TextUtils.isEmpty(passwordEt.getText().toString())){
                    Toast.makeText(LoginActivity.this, "NIK/Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
                else{
                    usernames = usernameEt;
                    passwords = passwordEt;
                    login();
                }
            }
        });
    }

    public void login(){
        Login loginData = new Login(usernames.getText().toString(),passwords.getText().toString());
        Log.i("username",usernames.getText().toString());
        Call<LoginResponse> call = apiServiceLogin.login(loginData);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()){
                    Toast.makeText(LoginActivity.this,"Selamat datang "+ response.body().getName(), Toast.LENGTH_SHORT).show();
                    token = response.body().getToken();
                    Log.i("tokens",token);
                    sharedPreferences = getApplicationContext().getSharedPreferences("MyPrefs", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("nama",response.body().getName());
                    editor.putString("token",token);
                    editor.putString("Role", String.valueOf(response.body().getRole()));
                    editor.apply();
                    Intent intent = new Intent(LoginActivity.this,MainMenuActivity.class);
                    startActivity(intent);
                }
                else Toast.makeText(LoginActivity.this, "Username / Password Salah", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "Terjadi Error", Toast.LENGTH_SHORT).show();

            }
        });
    }
}