abstract class Demo{  
    abstract void display();  
}    
class MainClass extends Demo {   
    void display(){
        System.out.println("Abstract method called.");  
}
public static void main(String[] args){
    MainClass obj = new MainClass ();
    obj.display();  
}  
}  