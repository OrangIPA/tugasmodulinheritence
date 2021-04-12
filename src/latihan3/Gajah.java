package latihan3;

public class Gajah extends Hewan {
    public static void testClassMethod(){
        System.out.println("The Class Method in Gajah");
    }
    public void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah");
    }
    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = new Gajah();
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
