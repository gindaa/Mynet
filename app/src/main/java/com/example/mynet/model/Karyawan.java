package com.example.mynet.model;

class Karyawan {
        private String nik;
        private String password;
        private String name;
        private String email;
        private String phone;
        private String role_id;
        private String tgl_lahir;
        private String no_ktp;
        private String no_npwp;
        private String no_rekening;
        private String status_pernikahan;
        private String pendidikan;
        private String mulai_bergabung;
        private String alamat;
        private String emergency_contact;
        private String no_bpjs_kesehatan;
        private String no_bpjs_ketenagakerjaan;
        private String divisi_id;
        private String jabatan_id;
        private String status_karyawan;
        private String pas_foto;
        private String file_kk;
        private String file_ktp;
        private String file_npwp;
        private String file_cv;
        private String file_psikotest;
        private String author;

    public Karyawan(String nik, String password, String name, String email, String phone, String role_id, String tgl_lahir, String no_ktp, String no_npwp, String no_rekening, String status_pernikahan, String pendidikan, String mulai_bergabung, String alamat, String emergency_contact, String no_bpjs_kesehatan, String no_bpjs_ketenagakerjaan, String divisi_id, String jabatan_id, String status_karyawan, String pas_foto, String file_kk, String file_ktp, String file_npwp, String file_cv, String file_psikotest, String author) {
        this.nik = nik;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.role_id = role_id;
        this.tgl_lahir = tgl_lahir;
        this.no_ktp = no_ktp;
        this.no_npwp = no_npwp;
        this.no_rekening = no_rekening;
        this.status_pernikahan = status_pernikahan;
        this.pendidikan = pendidikan;
        this.mulai_bergabung = mulai_bergabung;
        this.alamat = alamat;
        this.emergency_contact = emergency_contact;
        this.no_bpjs_kesehatan = no_bpjs_kesehatan;
        this.no_bpjs_ketenagakerjaan = no_bpjs_ketenagakerjaan;
        this.divisi_id = divisi_id;
        this.jabatan_id = jabatan_id;
        this.status_karyawan = status_karyawan;
        this.pas_foto = pas_foto;
        this.file_kk = file_kk;
        this.file_ktp = file_ktp;
        this.file_npwp = file_npwp;
        this.file_cv = file_cv;
        this.file_psikotest = file_psikotest;
        this.author = author;
    }

    // Getter Methods

        public String getNik() {
            return nik;
        }

        public String getPassword() {
            return password;
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

        public String getRole_id() {
            return role_id;
        }

        public String getTgl_lahir() {
            return tgl_lahir;
        }

        public String getNo_ktp() {
            return no_ktp;
        }

        public String getNo_npwp() {
            return no_npwp;
        }

        public String getNo_rekening() {
            return no_rekening;
        }

        public String getStatus_pernikahan() {
            return status_pernikahan;
        }

        public String getPendidikan() {
            return pendidikan;
        }

        public String getMulai_bergabung() {
            return mulai_bergabung;
        }

        public String getAlamat() {
            return alamat;
        }

        public String getEmergency_contact() {
            return emergency_contact;
        }

        public String getNo_bpjs_kesehatan() {
            return no_bpjs_kesehatan;
        }

        public String getNo_bpjs_ketenagakerjaan() {
            return no_bpjs_ketenagakerjaan;
        }

        public String getDivisi_id() {
            return divisi_id;
        }

        public String getJabatan_id() {
            return jabatan_id;
        }

        public String getStatus_karyawan() {
            return status_karyawan;
        }

        public String getPas_foto() {
            return pas_foto;
        }

        public String getFile_kk() {
            return file_kk;
        }

        public String getFile_ktp() {
            return file_ktp;
        }

        public String getFile_npwp() {
            return file_npwp;
        }

        public String getFile_cv() {
            return file_cv;
        }

        public String getFile_psikotest() {
            return file_psikotest;
        }

        public String getAuthor() {
            return author;
        }

        // Setter Methods

        public void setNik(String nik) {
            this.nik = nik;
        }

        public void setPassword(String password) {
            this.password = password;
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

        public void setRole_id(String role_id) {
            this.role_id = role_id;
        }

        public void setTgl_lahir(String tgl_lahir) {
            this.tgl_lahir = tgl_lahir;
        }

        public void setNo_ktp(String no_ktp) {
            this.no_ktp = no_ktp;
        }

        public void setNo_npwp(String no_npwp) {
            this.no_npwp = no_npwp;
        }

        public void setNo_rekening(String no_rekening) {
            this.no_rekening = no_rekening;
        }

        public void setStatus_pernikahan(String status_pernikahan) {
            this.status_pernikahan = status_pernikahan;
        }

        public void setPendidikan(String pendidikan) {
            this.pendidikan = pendidikan;
        }

        public void setMulai_bergabung(String mulai_bergabung) {
            this.mulai_bergabung = mulai_bergabung;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public void setEmergency_contact(String emergency_contact) {
            this.emergency_contact = emergency_contact;
        }

        public void setNo_bpjs_kesehatan(String no_bpjs_kesehatan) {
            this.no_bpjs_kesehatan = no_bpjs_kesehatan;
        }

        public void setNo_bpjs_ketenagakerjaan(String no_bpjs_ketenagakerjaan) {
            this.no_bpjs_ketenagakerjaan = no_bpjs_ketenagakerjaan;
        }

        public void setDivisi_id(String divisi_id) {
            this.divisi_id = divisi_id;
        }

        public void setJabatan_id(String jabatan_id) {
            this.jabatan_id = jabatan_id;
        }

        public void setStatus_karyawan(String status_karyawan) {
            this.status_karyawan = status_karyawan;
        }

        public void setPas_foto(String pas_foto) {
            this.pas_foto = pas_foto;
        }

        public void setFile_kk(String file_kk) {
            this.file_kk = file_kk;
        }

        public void setFile_ktp(String file_ktp) {
            this.file_ktp = file_ktp;
        }

        public void setFile_npwp(String file_npwp) {
            this.file_npwp = file_npwp;
        }

        public void setFile_cv(String file_cv) {
            this.file_cv = file_cv;
        }

        public void setFile_psikotest(String file_psikotest) {
            this.file_psikotest = file_psikotest;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }
