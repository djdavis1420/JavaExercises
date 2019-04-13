// this exercise completed before course section on lists and arrays

package ClassExercises;

public class DeluxeBurger extends StandardBurger {

    public DeluxeBurger() {
        super("deluxe burger", "brioche bun", "wagyu beef", 12.99);
        super.setTopping1("fries", 1.99);
        super.setTopping2("soda", 1.49);
    }

    @Override
    public void setTopping1(String name, double price) {
        System.out.println("Cannot Add Additional Items to a Deluxe Burger");
    }

    @Override
    public void setTopping2(String name, double price) {
        System.out.println("Cannot Add Additional Items to a Deluxe Burger");
    }

    @Override
    public void setTopping3(String name, double price) {
        System.out.println("Cannot Add Additional Items to a Deluxe Burger");
    }

    @Override
    public void setTopping4(String name, double price) {
        System.out.println("Cannot Add Additional Items to a Deluxe Burger");
    }
}
