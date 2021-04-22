package com.example.mynet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class AddKaryawanActivity extends AppCompatActivity {

    Button takePhoto,takeFile,Submit;
    String photobase64,imagebase64;
    ImageView viewphoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_karyawan);
        takePhoto = findViewById(R.id.takephoto);
        takeFile = findViewById(R.id.takefile);
        Submit = findViewById(R.id.submit);
        viewphoto = findViewById(R.id.photoview);


        takeFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(AddKaryawanActivity.this,Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(AddKaryawanActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 100);
                }
                else{
                    selectImage();
                    }
                }
        });

        takePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(AddKaryawanActivity.this,Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(AddKaryawanActivity.this, new String[]{Manifest.permission.CAMERA}, 101);
                }
                else{
                    openCamera();
                }
            }
        });
    }

    private void openCamera() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,101);
    }



    private void selectImage() {
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setType("image/*");
        startActivityForResult(Intent.createChooser(intent,"Select Image"),100);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode==100 && grantResults[0] ==PackageManager.PERMISSION_GRANTED){
            selectImage();

        }if (requestCode==101 && grantResults[0] ==PackageManager.PERMISSION_GRANTED){
            openCamera();
        }
            else Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 101){
            Bitmap image = (Bitmap) data.getExtras().get("data");
            viewphoto.setImageBitmap(image);

        }

        if (requestCode == 100 && resultCode==RESULT_OK && data != null){
            Uri uri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),uri);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG,100,stream);
                byte[] bytes = stream.toByteArray();
                imagebase64 = Base64.encodeToString(bytes,Base64.DEFAULT);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}