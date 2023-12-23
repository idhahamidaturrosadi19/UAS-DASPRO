package model;

public class Akun {
    private String username;
    private String NIM;
    private String kelas;

    public Akun setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public Akun setNIM(String NIM) {
        this.NIM = NIM;
        return this;
    }
    public String getNIM() {
        return this.NIM;
    }

    public Akun setKelas(String kelas) {
        this.kelas = kelas;
        return this;
    }
    public String getKelas() {
        return this.kelas;
    }
}