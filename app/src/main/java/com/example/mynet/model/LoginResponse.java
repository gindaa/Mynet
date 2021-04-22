package com.example.mynet.model;

public class LoginResponse {
        private String msg;
        private String nik;
        private String name;
        private String email;
        private String phone;
        private String karyawan_id;
        Role RoleObject;

    public void setToken(String token) {
        this.token = token;
    }

    private String token;

    public String getToken() {
        return token;
    }
// Getter Methods

        public String getMsg() {
            return msg;
        }

        public String getNik() {
            return nik;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        public String getKaryawan_id() {
            return karyawan_id;
        }

        public Role getRole() {
            return RoleObject;
        }

        // Setter Methods

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public void setNik(String nik) {
            this.nik = nik;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setKaryawan_id(String karyawan_id) {
            this.karyawan_id = karyawan_id;
        }

        public void setRole(Role roleObject) {
            this.RoleObject = roleObject;
        }
    }
    class Role {
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