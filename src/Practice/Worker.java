package Practice;

import java.util.Scanner;

public class Worker {
    private final static int FEMALETAX = 30;
    private final static int MALETAX = 50;

    String number = "^[0-9]+$";
    String text = "[a-zA-Z]+";

    int id;
    String name;
    String gender;
    String position;
    float hours;
    float rate;

    // create method for validation
    private String inputValidation(Scanner input, String message, String regex) {
        while (true) {
            System.out.print(message);
            String userInput = input.nextLine();

            // check if user input is correct with the matches pattern
            if (userInput.matches(regex)) {
                return userInput;
            } else {
                System.out.println("Invalid input! Please try again.");
            }
        }
    }

    // create method for input worker info
    public void inputWorker(Scanner input) {
        // Enter ID
        id = Integer.parseInt(inputValidation(input, "Enter ID: ", number));
        // Enter Name
        name = inputValidation(input, "Enter Name: ", text);
        // Enter Gender
        gender = inputValidation(input, "Enter Gender: ", text);
        // Enter Position
        position = inputValidation(input, "Enter Position: ", text);
        // Enter Hours
        hours = Float.parseFloat(inputValidation(input, "Enter Hours: ", number));
        // Enter Rate
        rate = Float.parseFloat(inputValidation(input, "Enter Rate: ", number));

    }

    // create method for output worker info
    public void outputWorker() {
        float deduction = 0;
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Position: " + position);
        System.out.println("Hours: " + hours);
        System.out.println("Rate: " + rate);
        System.out.println("Before Tax: " + salary());
        if(salary() >= 1000) {
            deduction = findTaxDeduction();
            System.out.println("Final Salary: " + (salary() - deduction) + "$");
        }
    }

    // find salary before tax
    public float salary() {
        return hours * rate;
    }

    // create method for find money after tax
    private float findTaxDeduction() {
        float rate = 0;
        // checking gender for worker
        if (gender.equalsIgnoreCase("female")) {
            rate = FEMALETAX;
        }  else {
            rate = MALETAX;
        }
        float deduction = salary() * (rate / 100);
        System.out.println("Tax: " + rate + "%");
        System.out.println("Tax Salary Deduction: " + deduction + "$");
        return deduction;
    }
}
