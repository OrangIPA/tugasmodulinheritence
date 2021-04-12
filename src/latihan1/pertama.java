package latihan1;

public class pertama {
    private int a = 10;
    protected void terprotek(){
        System.out.println("method ini hanya untuk anaknya");
    }
    public void info(){
        System.out.println("a = " + a);
        System.out.println("dipanggil pada = " + this.getClass().getName());
    }
}
