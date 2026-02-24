public class Nurse extends Person implements Treatable {

    private String department;

    public Nurse(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void showInfo() {
        System.out.println("Nurse: " + this.getName() + ", Dept: " + department);
    }

    @Override
    public void treat() {
        System.out.println("Nurse " + this.getName() + " is helping patients");
    }
}
