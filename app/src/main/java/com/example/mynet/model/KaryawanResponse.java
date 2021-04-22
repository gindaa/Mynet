package com.example.mynet.model;

public class KaryawanResponse {
    private String msg;
    private String email;
    private String name;
    private String karyawan_id;
    private String mobile_phone;
    private String nik = null;


    // Getter Methods

    public String getMsg() {
        return msg;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getKaryawan_id() {
        return karyawan_id;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public String getNik() {
        return nik;
    }

    // Setter Methods

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKaryawan_id(String karyawan_id) {
        this.karyawan_id = karyawan_id;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
}
