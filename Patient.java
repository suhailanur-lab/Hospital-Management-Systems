package hospital;

public class Patient extends Person implements Billable {

    private double totalBill;

    public Patient(String name, int age) {
        super(name, age);
        this.totalBill = 0;
    }

    @Override
    public void showInfo() {
        System.out.println("Patient: " + this.getName() +
                ", Age: " + this.getAge() +
                ", Total Bill: $" + totalBill);
    }

    @Override
    public double getBill() {
        return this.totalBill;
    }

    public void addToBill(double amount) {
        this.totalBill += amount;
    }
}
