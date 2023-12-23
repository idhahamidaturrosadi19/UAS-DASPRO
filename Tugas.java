package model;

public class Tugas {
    private Akun mahasiswa;
    private MataKuliah matkul;
    private String deadline;
    private String kodeTugas;
    private String judulTugas;

    public Tugas setMahasiswa(Akun mahasiswa) {
        this.mahasiswa = mahasiswa;
        return this;
    }
    public Akun getMahasiswa() {
        return this.mahasiswa;
    }

    public Tugas setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
        return this;
    }
    public MataKuliah getMatkul() {
        return this.matkul;
    }

    public Tugas setDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }
    public String getDeadline() {
        return this.deadline;
    }

    public Tugas setKodeTugas(String kodeTugas) {
        this.kodeTugas = kodeTugas;
        return this;
    }
    public String getKodeTugas() {
        return this.kodeTugas;
    }

    public Tugas setJudulTugas(String judulTugas) {
        this.judulTugas = judulTugas;
        return this;
    }
    public String getJudulTugas() {
        return this.judulTugas;
    }
    
}