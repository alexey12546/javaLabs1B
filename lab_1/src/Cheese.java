import java.util.Scanner;

public class Cheese extends Food {

    private int quantity;

    public Cheese() {
        setName("Sir");
    }

    @Override
    public void consume(int count1, int count2, int count3) {
        this.quantity = count1;
    }

    @Override
    public int calculateCalories() {
        int cheeseCalories = 402 * this.quantity;
        if (this.quantity != 0)
            System.out.println("Calories " + this.quantity + " cheese: " + cheeseCalories);
        else
            System.out.println("There was no cheese for breakfast");
        return cheeseCalories;
    }
}
