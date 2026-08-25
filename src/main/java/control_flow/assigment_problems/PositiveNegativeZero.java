package main.java.control_flow.assigment_problems;

public class PositiveNegativeZero {
    void classifyNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        PositiveNegativeZero obj = new PositiveNegativeZero();
        obj.classifyNumber(15);
    }
}
