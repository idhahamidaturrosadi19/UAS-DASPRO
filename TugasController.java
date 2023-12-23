package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Mahasiswa;
import model.Akun;
import model.MataKuliah;
import model.Tugas;

public class TugasController {
    HashMap<String, MataKuliah> mataKuliahs = new HashMap();
    ArrayList<Tugas> tugass = new ArrayList<>();
    ArrayList<Akun> daftarMahasiswa = new ArrayList<>();
    ArrayList<Tugas> tugas = new ArrayList<>();
    int noIdMahasiswa = 0;
    int noTugas = 0;

    public void setUp() {
        MataKuliah mataKuliah1 = new MataKuliah();
        MataKuliah mataKuliah2 = new MataKuliah();
        MataKuliah mataKuliah3 = new MataKuliah();
        MataKuliah mataKuliah4 = new MataKuliah();
        MataKuliah mataKuliah5 = new MataKuliah();
        MataKuliah mataKuliah6 = new MataKuliah();
        MataKuliah mataKuliah7 = new MataKuliah();
        MataKuliah mataKuliah8 = new MataKuliah();
        MataKuliah mataKuliah9 = new MataKuliah();
        MataKuliah mataKuliah10 = new MataKuliah();
        MataKuliah mataKuliah11 = new MataKuliah();
        mataKuliah1.setIdMatkul("01").setHariMatkul("Senin").setNamaMatkul("Dasar Pemrograman").setDosenMatkul("Ichsan Budiman MT").setJamMatkul("12.40").setRuanganMatkul("4.10");
        mataKuliah2.setIdMatkul("02").setHariMatkul("Senin").setNamaMatkul("Kewarganegaraan").setDosenMatkul("Dr. H. Buhori M. M.Ag").setJamMatkul("14.20").setRuanganMatkul("4.12");
        mataKuliah3.setIdMatkul("03").setHariMatkul("Selasa").setNamaMatkul("Fisika Dasar").setDosenMatkul("Khoerun Nisa Syajaah M.Si").setJamMatkul("07.00").setRuanganMatkul("4.11");
        mataKuliah4.setIdMatkul("04").setHariMatkul("Selasa").setNamaMatkul("Kalkulus I").setDosenMatkul("Dr. Esih Sukaesih").setJamMatkul("9.30").setRuanganMatkul("4.01");
        mataKuliah5.setIdMatkul("05").setHariMatkul("Selasa").setNamaMatkul("Bahasa Arab").setDosenMatkul("Dede Sutisna M.Pd.I").setJamMatkul("14.20").setRuanganMatkul("4.11");
        mataKuliah6.setIdMatkul("06").setHariMatkul("Rabu").setNamaMatkul("Ilmu Fiqih").setDosenMatkul("Dr. Mohammad Jaenudin M.Ag., M.Pd").setJamMatkul("07.00").setRuanganMatkul("4.11");
        mataKuliah7.setIdMatkul("07").setHariMatkul("Rabu").setNamaMatkul("Pengenalan Informatika").setDosenMatkul("Muhammad Insan Al Amin MT").setJamMatkul("10.20").setRuanganMatkul("4.10");
        mataKuliah8.setIdMatkul("08").setHariMatkul("Kamis").setNamaMatkul("Praktikum Fisika Dasar").setDosenMatkul("Abdi Wadud Syafii, S.Si., M.Si").setJamMatkul("08.00").setRuanganMatkul("Lab");
        mataKuliah9.setIdMatkul("09").setHariMatkul("Kamis").setNamaMatkul("Praktikum Dasar Pemrograman").setDosenMatkul("Popon Dauni ST.M.Kom").setJamMatkul("10.20").setRuanganMatkul("Lab");
        mataKuliah10.setIdMatkul("10").setHariMatkul("Kamis").setNamaMatkul("Olahraga").setDosenMatkul("Alvin Yanuar Rahman M.Or").setJamMatkul("14.30").setRuanganMatkul("Kampus 2");
        mataKuliah11.setIdMatkul("11").setHariMatkul("Jumat").setNamaMatkul("Bahasa Inggris").setDosenMatkul("Nopianti Sa'adah S.Pd., M.Pd").setJamMatkul("12.40").setRuanganMatkul("4.10");
        
        mataKuliahs.put(mataKuliah1.getIdMatkul(), mataKuliah1);
        mataKuliahs.put(mataKuliah2.getIdMatkul(), mataKuliah2);
        mataKuliahs.put(mataKuliah3.getIdMatkul(), mataKuliah3);
        mataKuliahs.put(mataKuliah4.getIdMatkul(), mataKuliah4);
        mataKuliahs.put(mataKuliah5.getIdMatkul(), mataKuliah5);
        mataKuliahs.put(mataKuliah6.getIdMatkul(), mataKuliah6);
        mataKuliahs.put(mataKuliah7.getIdMatkul(), mataKuliah7);
        mataKuliahs.put(mataKuliah8.getIdMatkul(), mataKuliah8);
        mataKuliahs.put(mataKuliah9.getIdMatkul(), mataKuliah9);
        mataKuliahs.put(mataKuliah10.getIdMatkul(), mataKuliah10);
        mataKuliahs.put(mataKuliah11.getIdMatkul(), mataKuliah11);
    }

    public void menuTugasku() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|           Silahkan Masukkan Informasi Mahasiswa        |");
        System.out.println("+--------------------------------------------------------+");
        System.out.print("| Masukkan Nama \t\t : ");
        String username = input.nextLine();
        System.out.print("| Masukkan NIM \t\t\t : ");
        String NIM = input.nextLine();
        System.out.print("| Masukkan Kelas (Jurusan-Kelas) : ");
        String kelas = input.nextLine();
        System.out.println("+--------------------------------------------------------+");
        System.out.println();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setUsername(username).setNIM(NIM).setKelas(kelas);
        daftarMahasiswa.add(mahasiswa);

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("+----------------------+");
            System.out.println("|         MENU         |");
            System.out.println("+----------------------+");
            System.out.println("| 1. List Mata Kuliah  |");
            System.out.println("| 2. Tambah Tugas      |");
            System.out.println("| 3. List Tugas        |");
            System.out.println("| 4. Info Akun         |");
            System.out.println("| 5. Keluar            |");
            System.out.println("+----------------------+");
            System.out.print("Pilih Menu (1/2/3/4/5) : ");
            int pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        lihatDaftarMatkul();
                        break;
                    case 2:
                        tambahTugas();
                        break;
                    case 3:
                        lihatRiwayatTugas();
                        break;
                    case 4:
                        infoAkun(mahasiswa);
                        break;
                    case 5:
                        lanjut = false;
                        break;
                    default:
                        break;
                }
        }
    }

    public void lihatDaftarMatkul() {
        System.out.println();
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                   LIST MATA KULIAH                     |");
        for (Map.Entry<String, MataKuliah> mataKuliah : mataKuliahs.entrySet()) {
            String key = mataKuliah.getKey();
            MataKuliah tMataKuliah = mataKuliah.getValue();
            System.out.println("+--------------------------------------------------------+");
                System.out.println("| Kode Mata Kuliah \t :" + key);
                System.out.println("| Hari \t\t\t :" + tMataKuliah.getHariMatkul());
                System.out.println("| Nama \t\t\t :" + tMataKuliah.getNamaMatkul());
                System.out.println("| Dosen \t\t :" + tMataKuliah.getDosenMatkul());
                System.out.println("| Jam \t\t\t :" + tMataKuliah.getJamMatkul());
                System.out.println("| Ruangan \t\t :" + tMataKuliah.getRuanganMatkul());
                System.out.println("+--------------------------------------------------------+");
                System.out.println();
        }
    }

    public MataKuliah getmataKuliah(String idMatkul) {
        return mataKuliahs.get(idMatkul);
    }

    public void tambahTugas() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                      TAMBAH TUGAS                      |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                    Kode Mata Kuliah                    |");
        System.out.println("+--------------------------------------------------------+");
        for (Map.Entry<String, MataKuliah> mataKuliah : mataKuliahs.entrySet()) {
            String key = mataKuliah.getKey();
            MataKuliah tMataKuliah = mataKuliah.getValue();
        System.out.println("| " + "(" +key + ") " + tMataKuliah.getNamaMatkul());
        }
        System.out.println("+--------------------------------------------------------+");
        System.out.print("| Silahkan Masukkan Kode Mata Kuliah   : ");
        String kodeMatkul = input.nextLine();
        System.out.print("| Silahkan Masukkan Judul Tugas        : ");
        String judulTugas = input.nextLine();
        System.out.print("| Deadline Tugas (DD/MM/YYYY)          : ");
        String deadlineTugas = input.nextLine();
        System.out.println("+--------------------------------------------------------+");

        MataKuliah matkulPilihan = mataKuliahs.get(kodeMatkul);
        Tugas tugas = new Tugas();
        noTugas++;
        String kodeTugas = "t" + noTugas;

        tugas.setKodeTugas(kodeTugas).setMatkul(matkulPilihan).setJudulTugas(judulTugas).setDeadline(deadlineTugas);
        tugass.add(tugas);

        System.out.println();
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                  TAMBAH TUGAS BERHASIL                 |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("| Kode Tugas\t\t : " + tugas.getKodeTugas());
        System.out.println("| Mata Kuliah\t\t : " + tugas.getMatkul().getNamaMatkul());
        System.out.println("| Judul Tugas\t\t : " + tugas.getJudulTugas());
        System.out.println("| Deadline\t\t : " + tugas.getDeadline());
        System.out.println("+--------------------------------------------------------+");
    }

    public void hapusTugas(String kodeMatkul, String judulTugas) {
        for (Tugas t : tugass) {
            if (t.getMatkul().getIdMatkul().equals(kodeMatkul) && t.getJudulTugas().equals(judulTugas)) {
                tugass.remove(t);
                System.out.println("Tugas berhasil dihapus!");
                System.out.println();
                return;
            }
        }
        System.out.println("Tugas tidak ditemukan.");
    }
    

    
    public void lihatRiwayatTugas() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                    LIST SEMUA TUGAS                    |");
        if (!tugass.isEmpty()) {
            for (Tugas tugas : tugass) {
                    System.out.println("+--------------------------------------------------------+");
                    System.out.println("| Kode Tugas\t\t : " + tugas.getKodeTugas());
                    System.out.println("| Mata Kuliah\t\t : " + tugas.getMatkul().getNamaMatkul());
                    System.out.println("| Judul Tugas\t\t : " + tugas.getJudulTugas());
                    System.out.println("| Deadline\t\t : " + tugas.getDeadline());
                    System.out.println("+--------------------------------------------------------+");
                    System.out.println();
                }
                System.out.print("Apakah ingin menghapus tugas (Y/N)?");
                String hapusT = input.nextLine();
                if (hapusT.equalsIgnoreCase("Y")) {
                    System.out.println("+--------------------------------------------------------+");
                    System.out.println("|                    PENGHAPUSAN TUGAS                   |");
                    System.out.println("+--------------------------------------------------------+");
                    System.out.print("Masukkan Kode Mata Kuliah Tugas yang Ingin Dihapus: ");
                    String kodeMatkul = input.nextLine();
                    System.out.print("Masukkan Judul Tugas yang Ingin Dihapus: ");
                    String judulTugas = input.nextLine();
                    hapusTugas(kodeMatkul, judulTugas);
                } else {
                    System.out.println("Penghapusan tugas dibatalkan.");
                    System.out.println();
                }
        } else {
            System.out.println("+--------------------------------------------------------+");
            System.out.println("|                    Tidak ada tugas!                    |");
            System.out.println("+--------------------------------------------------------+");
            System.out.println();
        }
    }

    public void infoAkun(Akun student) {
        Tugas infoakun = new Tugas();
        infoakun.setMahasiswa(student);
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                        INFO AKUN                       |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("| Nama\t\t : " + student.getUsername());
        System.out.println("| NIM\t\t : " + student.getNIM());
        System.out.println("| Kelas\t\t : " + student.getKelas());
        System.out.println("+--------------------------------------------------------+");
        System.out.println();
    }
}
