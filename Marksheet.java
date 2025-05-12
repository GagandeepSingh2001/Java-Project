import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Marksheet {

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        /*Getting Input from the user*/

        System.out.println("( To generate your Marksheet you need to provide some personal info first )");
        System.out.println("Enter your name: ");
        String name = buff.readLine();
        System.out.println("Enter your Roll number: ");
        int rollNo = Integer.parseInt(buff.readLine());
        System.out.println("Enter your Date of Birth (dd/mm/yyyy): ");
        String dob = buff.readLine();
        System.out.println("Enter your Father's name: ");
        String fName = buff.readLine();
        System.out.println("Enter your Mother's name: ");
        String mName = buff.readLine();
        System.out.println("Enter the 1st subject name: ");
        String sub1 = buff.readLine();
        System.out.println("Enter the 1st subject marks: ");
        int m1 = Integer.parseInt(buff.readLine());
        System.out.println("Enter the 2nd subject name: ");
        String sub2 = buff.readLine();
        System.out.println("Enter the 2nd subject marks: ");
        int m2 = Integer.parseInt(buff.readLine());
        System.out.println("Enter the 3rd subject name: ");
        String sub3 = buff.readLine();
        System.out.println("Enter the 3rd subject marks: ");
        int m3 = Integer.parseInt(buff.readLine());
        System.out.println("Enter the 4th subject name: ");
        String sub4 = buff.readLine();
        System.out.println("Enter the 4th subject marks: ");
        int m4 = Integer.parseInt(buff.readLine());
        System.out.println("Enter the 5th subject name: ");
        String sub5 = buff.readLine();
        System.out.println("Enter the 5th subject marks: ");
        int m5 = Integer.parseInt(buff.readLine());
        double total = m1+m2+m3+m4+m5;
        double percent = (total/500) * 100;

        // Setting grades for each subject.
        char grade1;
        char grade2;
        char grade3;
        char grade4;
        char grade5;
        if(m1 >= 90 ) grade1 = 'A';
        else if(m1 >= 80 ) grade1 = 'B';
        else if(m1 >= 70 ) grade1 = 'C';
        else if(m1 >= 60 ) grade1 = 'D';
        else grade1 = 'F';

        if(m2 >= 90 ) grade2 = 'A';
        else if(m2 >= 80 ) grade2 = 'B';
        else if(m2 >= 70 ) grade2 = 'C';
        else if(m2 >= 60 ) grade2 = 'D';
        else grade2 = 'F';

        if(m3 >= 90 ) grade3 = 'A';
        else if(m3 >= 80 ) grade3 = 'B';
        else if(m3 >= 70 ) grade3 = 'C';
        else if(m3 >= 60 ) grade3 = 'D';
        else grade3 = 'F';

        if(m4 >= 90 ) grade4 = 'A';
        else if(m4 >= 80 ) grade4 = 'B';
        else if(m4 >= 70 ) grade4 = 'C';
        else if(m4 >= 60 ) grade4 = 'D';
        else grade4 = 'F';

        if(m5 >= 90 ) grade5 = 'A';
        else if(m5 >= 80 ) grade5 = 'B';
        else if(m5 >= 70 ) grade5 = 'C';
        else if(m5 >= 60 ) grade5 = 'D';
        else grade5 = 'F';

        /*Printing the Output*/
        System.out.println("-------------------------------Personal Information--------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Father's Name: " + fName);
        System.out.println("Mother's Name: " + mName);
        System.out.println("--------------------------------Generated Marksheet--------------------------------");
        System.out.printf("     %-15s | %15s %-15s | %15s%n", "Subjects", "Marks","", "Grade"); //  Used for fixed Spacing format "%-15s | %15s%n"
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("     %-15s | %15s %-15s | %15s%n", sub1, m1,"", grade1);
        System.out.printf("     %-15s | %15s %-15s | %15s%n", sub2, m2,"", grade2);
        System.out.printf("     %-15s | %15s %-15s | %15s%n", sub3, m3,"", grade3);
        System.out.printf("     %-15s | %15s %-15s | %15s%n", sub4, m4,"", grade4);
        System.out.printf("     %-15s | %15s %-15s | %15s%n", sub5, m5,"", grade5);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("     %-15s | %15s%n", "Total", total);
        System.out.printf("     %-15s | %15s%n", "Percentage", percent+" %");
        System.out.println("-----------------------------------------------------------------------------------");

        buff.close();

    }
}