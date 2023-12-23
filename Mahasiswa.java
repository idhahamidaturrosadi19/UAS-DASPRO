package model;

public class Mahasiswa extends Akun {
    private String idMahasiswa;

    public Mahasiswa setIdMahasiswa(String idMahasiswa){
        this.idMahasiswa = idMahasiswa;
        return this;
    }
    public String getIdMahasiswa(){
        return this.idMahasiswa;
    }
    
}
