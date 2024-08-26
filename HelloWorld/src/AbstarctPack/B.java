package AbstarctPack;

abstract class B {

    final static  int k;
    final int l;
    int i;
    static int j;
    {
        i=90;
        l =12;
        //j=900;

    }
    static {
        j=600;
        k=50;
    }
    abstract public void m1();
    public abstract void m2();


    public B(){
       System.out.println("constructor calling");
    }

    public void add(){
        System.out.println("non static method");

    }
    public final void adds(){
        System.out.println("final method in abstract claas");
    }
    public static void show(){
        System.out.println("Static method in abstract class");
    }
    private void display(){
        System.out.println("private method");
    }
    public void displayInmpl(){
        display();
    }
}
