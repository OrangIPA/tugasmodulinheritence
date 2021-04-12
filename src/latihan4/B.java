package latihan4;

class B extends A{
    private int b;
    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return this.b;
    }
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("nilai b = " + getB());
    }
}
