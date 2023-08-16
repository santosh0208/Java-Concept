package Collections.Classes.Array;

public class Array {
    int rollno;
    String name;
    int marks;
}

class Demo{
    public static void main(String args[]){
        Array a1 = new Array();
        a1.marks=35;
        a1.name="Sameer";
        a1.rollno=12;

        Array a2 = new Array();
        a2.marks=50;
        a2.name="Shilpa";
        a2.rollno=20;

        Array a3 = new Array();
        a3.marks=14;
        a3.name="Priya";
        a3.rollno=15;

        Array students[] = new Array[3];
        students[0] = a1;
        students[1] = a2;
        students[2] = a3;

        for(int i=0;i<students.length;i++){
            System.out.println("Student name : "+ students[i].name +" | Marks : "+ students[i].marks +" | Roll no : "+ students[i].rollno );
        }

    }
}
