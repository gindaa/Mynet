package com.example.mynet.model;

public class ListKaryawan {
    private String karyawan_id;
    private String nik;
    private String name;
    private String phone;
    private String email;
    Divisi DivisiObject;
    Jabatan JabatanObject;
    private String author;


    // Getter Methods

    public String getKaryawan_id() {
        return karyawan_id;
    }

    public String getNik() {
        return nik;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Divisi getDivisi() {
        return DivisiObject;
    }

    public Jabatan getJabatan() {
        return JabatanObject;
    }

    public String getAuthor() {
        return author;
    }

    // Setter Methods

    public void setKaryawan_id(String karyawan_id) {
        this.karyawan_id = karyawan_id;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDivisi(Divisi divisiObject) {
        this.DivisiObject = divisiObject;
    }

    public void setJabatan(Jabatan jabatanObject) {
        this.JabatanObject = jabatanObject;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
class Jabatan {
    private String id;
    private String name;


    // Getter Methods

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Divisi {
    private String id;
    private String name;


    // Getter Methods

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
