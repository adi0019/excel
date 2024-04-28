import java.util.Scanner;

public class JavaExample {
    public static void main(String args[]) {
        /* This program assumes that the student has 6 subjects,
         * that's why an array of size 6 is created. You can
         * change this as per the requirement.
         */
        int marks[] = new int[6];
        int i;
        float total = 0, avg = 0; // Initializing avg to 0
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 6; i++) {
            System.out.print("Enter Marks of Subject" + (i + 1) + ":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        // Calculating average here
        avg = total / 6;

        System.out.print("The student Grade is: ");
        if (avg >= 80) {
            System.out.print("A");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("B");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }
    }
}

// running code : javac JavaExample