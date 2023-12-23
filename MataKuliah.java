package model;

public class MataKuliah {
    private String idMatkul;
    private String namaMatkul;
    private String dosenMatkul;
    private String jamMatkul;
    private String ruanganMatkul;
    private String hariMatkul;

    public MataKuliah setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
        return this;
    }
    public String getNamaMatkul() {
        return this.namaMatkul;
    }

    public MataKuliah setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
        return this;
    }
    public String getIdMatkul() {
        return this.idMatkul;
    }

    public MataKuliah setDosenMatkul(String dosenMatkul) {
        this.dosenMatkul = dosenMatkul;
        return this;
    }
    public String getDosenMatkul() {
        return this.dosenMatkul;
    }
    
    public MataKuliah setJamMatkul(String jamMatkul) {
        this.jamMatkul = jamMatkul;
        return this;
    }
    public String getJamMatkul() {
        return this.jamMatkul;
    }

    public MataKuliah setRuanganMatkul(String ruanganMatkul) {
        this.ruanganMatkul = ruanganMatkul;
        return this;
    }
    public String getRuanganMatkul() {
        return this.ruanganMatkul;
    }

    public MataKuliah setHariMatkul(String hariMatkul) {
        this.hariMatkul = hariMatkul;
        return this;
    }
    public String getHariMatkul() {
        return this.hariMatkul;
    }
}