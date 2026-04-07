package hospital;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Nurse> nurses = new ArrayList<>();

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
            doctors.add(doctor); // ✅ added to list

            System.out.print("Enter patient name: ");
            String pName = input.nextLine();

            System.out.print("Enter patient age: ");
            int pAge = input.nextInt();
            input.nextLine();

            Patient patient = new Patient(pName, pAge);
            patients.add(patient); // ✅ added to list


            System.out.print("Enter nurse name: ");
            String nName = input.nextLine();

            System.out.print("Enter nurse age: ");
            int nAge = input.nextInt();
            input.nextLine();

            System.out.print("Enter nurse department: ");
            String dept = input.nextLine();

            Nurse nurse = new Nurse(nName, nAge, dept);
            nurses.add(nurse); // ✅ added to list


            System.out.print("Enter surgery name: ");
            String sName = input.nextLine();

            System.out.print("Enter surgery cost: ");
            double cost = input.nextDouble();

            Surgery surgery = new Surgery(sName, cost);


      
            System.out.println("DETAILS");

            for (Doctor d : doctors) {
                d.showInfo();
            }

            for (Patient p : patients) {
                p.showInfo();
            }

            for (Nurse n : nurses) {
                n.showInfo();
            }



            System.out.println("ACTIONS");

            doctor.treat();
            nurse.treat();
            surgery.perform();


       
            patient.addToBill(surgery.getBill());
            System.out.println("Total bill: $" + patient.getBill());


     
            savePatients(patients);

        } catch (Exception e) {
            System.out.println("Error: wrong input type.");
        } finally {
            input.close();
            System.out.println("Program ended.");
        }
    }


   
    public static void savePatients(ArrayList<Patient> patients) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("patients.txt"));

            for (Patient p : patients) {
                writer.write(p.getName() + "," + p.getAge() + "," + p.getBill());
                writer.newLine();
            }

            writer.close();
            System.out.println("Saved to file");

        } catch (Exception e) {
            System.out.println("Error saving file");
        }
    }
}
