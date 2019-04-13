// this exercise completed before course section on lists and arrays

package ClassExercises;

public class StandardBurger {
    private String name;
    private String rollType;
    private String meatType;
    private double price;

    private String topping1Name;
    private double topping1Price;
    private String topping2Name;
    private double topping2Price;
    private String topping3Name;
    private double topping3Price;
    private String topping4Name;
    private double topping4Price;

    public StandardBurger(String name, String rollType, String meatType, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meatType = meatType;
        this.price = price;
    }

    public void setTopping1(String name, double price) {
        this.topping1Name = name;
        this.topping1Price = price;
    }

    public void setTopping2(String name, double price) {
        this.topping2Name = name;
        this.topping2Price = price;
    }

    public void setTopping3(String name, double price) {
        this.topping3Name = name;
        this.topping3Price = price;
    }

    public void setTopping4(String name, double price) {
        this.topping4Name = name;
        this.topping4Price = price;
    }

    public double itemizeBurger() {
        double burgerPrice = this.price;
        System.out.println("$" + this.price + " => price for a " + this.name + " made with " + this.meatType + " on a " + this.rollType);

        if(this.topping1Name != null) {
            burgerPrice += topping1Price;
            System.out.println("$" + burgerPrice + " => added " + this.topping1Name + " for an additional " + this.topping1Price);
        }

        if(this.topping2Name != null) {
            burgerPrice += topping2Price;
            System.out.println("$" + burgerPrice + " => added " + this.topping2Name + " for an additional " + this.topping2Price);
        }

        if(this.topping3Name != null) {
            burgerPrice += topping3Price;
            System.out.println("$" + burgerPrice + " => added " + this.topping3Name + " for an additional " + this.topping3Price);
        }

        if(this.topping4Name != null) {
            burgerPrice += topping4Price;
            System.out.println("$" + burgerPrice + " => added " + this.topping4Name + " for an additional " + this.topping4Price);
        }

        return burgerPrice;
    }

    public String getName() {
        return this.name;
    }

}
