package TugasPraktikum;

public class XII extends Kelas{
    XII(int jumlahSiswa, String namaKelas){
        super(jumlahSiswa, namaKelas);
    }
    void pulang(){
        System.out.println("siswa kelas " + this.namaKelas + " silahkan pulang");
        this.siswaMasuk = 0;
    }
}
