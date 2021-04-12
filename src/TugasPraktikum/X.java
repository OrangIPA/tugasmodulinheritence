package TugasPraktikum;

public class X extends Kelas{
    X(int jumlahSiswa, String namaKelas) {
        super(jumlahSiswa, namaKelas);
    }
    void pulang(){
        System.out.println("siswa kelas " + this.namaKelas + " silahkan pulang");
        this.jumlahSiswa = 0;
    }
}
