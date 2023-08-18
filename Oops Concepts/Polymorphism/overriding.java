
public class overriding {
    public void DisplayInfo(){
        System.out.println("I am a human");
    }

    public void Info() {
        System.out.println("I am Superman");
    }
}
class Dog extends overriding {
    public void Info(){
        System.out.println("I am an animal");
    }
    super.DisplayInfo();
    }

class main {
    public static void main(String[] args){
        overriding dog = new Dog();
        dog.Info();
        overriding human = new overriding();
        human.DisplayInfo();
        human.Info();
        dog.DisplayInfo();
    }
}
