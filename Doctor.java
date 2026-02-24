package hospital;

public class Doctor extends Person implements Treatable {

    private String specialty;

    public Doctor(String name, int age, String specialty) {
        super(name, age); // using super
        this.specialty = specialty; // using this
    }

    @Override
    public void showInfo() {
        System.out.println("Doctor: " + this.getName() +
                ", Age: " + this.getAge() +
                ", Specialty: " + specialty);
    }

    @Override
    public void treat() {
        System.out.println("Dr. " + this.getName() + " is treating patients.");
    }
}
