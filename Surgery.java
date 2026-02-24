package hospital;

public class Surgery extends Service implements Billable {

    public Surgery(String name, double cost) {
        super(name, cost);
    }

    @Override
    public void perform() {
        System.out.println("Performing " + this.getName() + ".");
    }

    @Override
    public double getBill() {
        return this.getCost();
    }
}
