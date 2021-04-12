package TugasPraktikum;

public class XI extends Kelas{
    XI(int jumlahSiswa, String namaKelas) {
        super(jumlahSiswa, namaKelas);
    }
    void pulang(){
        System.out.println("siswa kelas " + namaKelas + " silahkan pulang");
        this.siswaMasuk = 0;
    }
}
