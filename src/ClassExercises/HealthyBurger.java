// this exercise completed before course section on lists and arrays

package ClassExercises;

public class HealthyBurger extends StandardBurger {

    private String healthyTopping1Name;
    private double healthyTopping1Price;

    private String healthyTopping2Name;
    private double healthyTopping2Price;

    public HealthyBurger(String meatType, double price) {
        super("healthy burger", "brown rye bun", meatType, price);
    }

    public void setHealthyTopping1(String name, double price) {
        this.healthyTopping1Name = name;
        this.healthyTopping1Price = price;
    }

    public void setHealthyTopping2(String name, double price) {
        this.healthyTopping2Name = name;
        this.healthyTopping2Price = price;
    }

    @Override
    public double itemizeBurger() {
        double burgerPrice = super.itemizeBurger();

        if (this.healthyTopping1Name != null) {
            burgerPrice += healthyTopping1Price;
            System.out.println("$" + burgerPrice + " => added " + this.healthyTopping1Name + " for an additional " + this.healthyTopping1Price);
        }

        if (this.healthyTopping2Name != null) {
            burgerPrice += healthyTopping2Price;
            System.out.println("$" + burgerPrice + " => added " + this.healthyTopping2Name + " for an additional " + this.healthyTopping2Price);
        }

        return burgerPrice;
    }
}
