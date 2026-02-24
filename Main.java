package hospital;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===\n");

        
        Doctor doctor = new Doctor("Dr. Smith", 45, "Cardiology");
        Patient patient = new Patient("John Doe", 28);
        Nurse nurse = new Nurse("Mary Jane", 32, "Emergency");
        Surgery surgery = new Surgery("Heart Surgery", 5000);

        
        System.out.println("---- PEOPLE ----");
        doctor.showInfo();
        patient.showInfo();
        nurse.showInfo();

        
        System.out.println("\n---- TREATMENT ----");
        doctor.treat();
        nurse.treat();

        
        System.out.println("\n---- SERVICE ----");
        surgery.perform();

        
        System.out.println("\n---- BILLING ----");
        patient.addToBill(surgery.getBill());
        System.out.println("Updated Patient Bill: $" + patient.getBill());

        System.out.println("\nProgram Finished Successfully.");
    }
}
