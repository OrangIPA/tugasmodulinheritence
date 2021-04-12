package latihan2;

public class Person {
    private int usia;
    private String nama;

    Person(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }
    public void info(){
        System.out.println("nama : " + this.nama);
        System.out.println("usia : " + this.usia);
    }
}
