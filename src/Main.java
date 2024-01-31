import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);

        // create object
        Worker student1 = new Worker();
        student1.studentInput(input);
        student1.studentOutput();
    }
}
