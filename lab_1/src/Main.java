
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String[] breakfastList = new String[20];
        String[] breakfastList2 = new String[6];
        int count1 = 0, count12 = 0, count21 = 0, count22 = 0, count23 = 0, count3 = 0, summaCalories = 0;
        Apple bigApple = new Apple();
        Cheese cheese = new Cheese();
        Milk milk = new Milk();
        System.out.println("Enter your breakfast foods(Milk(1.5/2.5/5),Cheese,Apple(Little/Big)), if you want to finish the list, enter \"-stop\".");
        for (int i = 0; i < 20; i++) {
            String product = scan.nextLine();
            breakfastList[i] = product;
            if (product.equals("Apple/Big")) {
                count1++;
                bigApple.setBigApple("Big");
            } else if (product.equals("Apple/Little")) {
                count12++;
                bigApple.setLittleApple("Little");
            } else if (product.equals("Milk/1.5")) {
                count21++;
                milk.setInfo1(1.5);
            } else if (product.equals("Milk/2.5")) {
                count22++;
                milk.setInfo2(2.5);
            } else if (product.equals("Milk/5")) {
                count23++;
                milk.setInfo3(5);
            } else if (product.equals("Cheese")) {
                count3++;
            } else if (product.equals("-stop")) {
                break;
            } else
                System.out.println("this product is not in the refrigerator!!!");
        }
        if (count1 >= 1) {
            breakfastList2[0] = "Apple/Big";
        } else
            breakfastList2[0] = "0";
        if (count12 >= 1) {
            breakfastList2[1] = "Apple/Little";
        } else
            breakfastList2[1] = "0";
        if (count21 >= 1) {
            breakfastList2[2] = "Milk/1.5";
        } else
            breakfastList2[2] = "0";
        if (count22 >= 1) {
            breakfastList2[3] = "Milk/2.5";
        } else
            breakfastList2[3] = "0";
        if (count23 >= 1) {
            breakfastList2[4] = "Milk/5";
        } else
            breakfastList2[4] = "0";
        if (count3 >= 1) {
            breakfastList2[5] = "Cheese";
        } else
            breakfastList2[5] = "0";
        bigApple.consume(count1, count12, 0);
        milk.consume(count21, count22, count23);
        cheese.consume(count3, 0, 0);
        summaCalories = milk.calculateCalories() + bigApple.calculateCalories() + cheese.calculateCalories();
        System.out.println("if you want to know the total calories of your breakfast enter \"-calories\" otherwise press any key.");
        String calories = scan2.nextLine();
        if (calories.equals("-calories"))
            System.out.println("total breakfast calories : " + summaCalories + "Kkal");
        System.out.println("if you want to sort breakfast, type \"-sort\".");
        calories = scan2.nextLine();
        if (calories.equals("-sort")) {
            Comparator sortBreakfastList = new Comparator();
            sortBreakfastList.sort(breakfastList2);
        }


    }
}
