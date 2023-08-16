package Polymorphism;

public class overriding {
    public void DisplayInfo(){
        System.out.println("I am a human");
    }
}

class Dog extends overriding{
    public void DisplayInfo(){
        System.out.println("I am Animal");
    }
}

class main {
    public static void main(String[] args){
        overriding dog = new Dog();
        dog.DisplayInfo();
        overriding human = new overriding();
        human.DisplayInfo();
    }
}
