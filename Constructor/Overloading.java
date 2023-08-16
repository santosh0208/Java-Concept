class Overloading{
    public Overloading(){
        System.out.println("This is default constructor");
    }
    public Overloading(int x ,int y ){
        System.out.println(x+y);
    }
}
public static void main(String[] args) {
    Overloading Myover = new Overloading();
    Overloading Myload = new Overloading(5 , 10);
    System.out.println(Myload);
    System.out.println(Myover);
}