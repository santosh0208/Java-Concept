

import java.util.Scanner;

interface Client{
    void input();
    void output();
}
class santosh implements Client{
    String name;
    double salary;
    public void input(){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Username :");
        name = r.nextLine();

        System.out.println("Enter Salary :");
        salary = r.nextDouble();
    }
    public void output(){
        System.out.println(name + " ");
        System.out.println(salary +" ");
    }
    public static void main(String[] args){
        Client c = new santosh();
        c.input();
        c.output();
    }
}

