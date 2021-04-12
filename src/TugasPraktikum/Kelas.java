package TugasPraktikum;

public class Kelas {
    int siswaMasuk;
    protected int jumlahSiswa;
    String namaKelas;
    String inventaris[] = new String[100];
    Kelas(int jumlahSiswa, String namaKelas){
        this.jumlahSiswa = jumlahSiswa;
        this.namaKelas = namaKelas;
    }
}
