import java.util.Scanner;

public class Apple extends Food{
    private String bigApple,littleApple;
    private int quantity1,quantity2;


    public Apple(){
        this.littleApple="-";
        this.bigApple="-";
    }

    public void setBigApple(String size) {
        this.bigApple = size;
    }
    public void setLittleApple(String size) {
        this.littleApple = size;
    }


    @Override
    public void consume(int count1,int count2,int count3) {
        this.quantity1 = count1;
        this.quantity2 = count2;
    }

    @Override
    public int calculateCalories() {
        int appleCalories1 = 0,appleCalories2 = 0,appleCalories = 0;
        if (quantity2==0 && quantity1==0)
            System.out.println("There were no apples for breakfast");
        else{
            if (bigApple.equals("Big")){
                appleCalories1 = 62*this.quantity1;
                appleCalories+=appleCalories1;
                System.out.println("Calories "+this.quantity1+" big apple : "+appleCalories1);
            }else if(this.quantity1==0)
                System.out.println("There were no big apples for breakfast");

            if(littleApple.equals("Little")) {
                appleCalories2 = 52*this.quantity2;
                appleCalories+=appleCalories2;
                System.out.println("Calories "+this.quantity2+" little apple : "+appleCalories2);
            }else if(this.quantity2==0)
                System.out.println("There were no little apples for breakfast");
        }

        return appleCalories;
    }
}
