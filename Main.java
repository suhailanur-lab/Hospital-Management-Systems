public class Main {

    public static void main(String[] args) {

        System.out.println("=== SIMPLE HOSPITAL SYSTEM ===\n");

        Doctor doc = new Doctor("Dr. Smith", 40, "Heart");
        Patient patient = new Patient("John", 25);
        Nurse nurse = new Nurse("Mary", 30, "Emergency");
        Surgery surgery = new Surgery("Heart Surgery", 5000);

        System.out.println("--- PEOPLE ---");
        doc.showInfo();
        patient.showInfo();
        nurse.showInfo();

        System.out.println("\n--- TREATMENTS ---");
        doc.treat();
        nurse.treat();

        System.out.println("\n--- SERVICES ---");
        surgery.perform();

        System.out.println("\n--- BILLING ---");
        patient.addToBill(surgery.getBill());
        System.out.println("Patient's total bill: $" + patient.getBill());

        System.out.println("\nDone!");
    }
}
