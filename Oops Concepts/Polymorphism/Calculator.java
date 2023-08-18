class Add {
    int add(int A, int B) {
        return (A + B);
    }
}

class Calculator extends Add {
    int sub(int A, int B) {
        return (A - B);
    }
}

class Main {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        int addition = calc.add(5, 10);
        int subtraction = calc.sub(5, 10);
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
    }
}
