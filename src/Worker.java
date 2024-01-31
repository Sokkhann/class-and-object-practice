import java.util.Scanner;

public class Worker {
    // data member
    int id;
    String name;
    String gender;
    String className;

    // create constructor
    // create method for input info for student
    void studentInput(Scanner scanner) {
        System.out.print("Enter Worker ID: ");
        id = scanner.nextInt();
        System.out.print("Enter Worker Name: ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Enter Worker Gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter Worker Class:");
        className = scanner.nextLine();
    }

    // create method for output the info of student
    void studentOutput() {
        System.out.println("-----------------<<Worker Information>>-----------------");
        System.out.println("Worker ID: " + id);
        System.out.println("Worker Name: " + name);
        System.out.println("Worker Gender: " + gender);
        System.out.println("Worker Class: " + className);
        System.out.println("-----------------------------------------");
    }
}
