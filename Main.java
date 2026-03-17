package hospital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("HOSPITAL MANAGEMENT SYSTEM");

        try {
         
            System.out.print("Enter doctor name: ");
            String dName = input.nextLine();

            System.out.print("Enter doctor age: ");
            int dAge = input.nextInt();
            input.nextLine();

            System.out.print("Enter doctor specialty: ");
            String specialty = input.nextLine();

            Doctor doctor = new Doctor(dName, dAge, specialty);

    
            System.out.print(" Enter patient name: ");
            String pName = input.nextLine();

            System.out.print("Enter patient age: ");
            int pAge = input.nextInt();
            input.nextLine();

            Patient patient = new Patient(pName, pAge);

         
            System.out.print(" Enter nurse name: ");
            String nName = input.nextLine();

            System.out.print("Enter nurse age: ");
            int nAge = input.nextInt();
            input.nextLine();

            System.out.print("Enter nurse department: ");
            String dept = input.nextLine();

            Nurse nurse = new Nurse(nName, nAge, dept);

         
            System.out.print(" Enter surgery name: ");
            String sName = input.nextLine();

            System.out.print("Enter surgery cost: ");
            double cost = input.nextDouble();

            Surgery surgery = new Surgery(sName, cost);

          
            System.out.println(" DETAILS");
            doctor.showInfo();
            patient.showInfo();
            nurse.showInfo();

            System.out.println(" ACTIONS ");
            doctor.treat();
            nurse.treat();
            surgery.perform();

      
            patient.addToBill(surgery.getBill());
            System.out.println("Total bill: $" + patient.getBill());

        } catch (Exception e) {
            System.out.println("Error: wrong input type.");
        } finally {
            input.close();
            System.out.println("Program ended.");
        }
    }
}
