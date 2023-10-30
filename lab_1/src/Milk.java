import java.util.Scanner;

public class Milk extends Food{
    private int quantity1,quantity2,quantity3;

    private double fat1,fat2,fat3;
    public Milk(){
        this.fat1=0;
        this.fat2=0;
        this.fat3=0;
    }

    public void setInfo1(double fat){
        this.fat1=fat;
    }

    public void setInfo2(double fat){
        this.fat2=fat;
    }

    public void setInfo3(double fat){
        this.fat3=fat;
    }
//    public void getInfo(){
//        System.out.println(this.fat+"%");
//    }
    @Override
    public void consume(int count1,int count2,int count3) {
        this.quantity1 = count1;
        this.quantity2 = count2;
        this.quantity3 = count3;
    }

    @Override
    public int calculateCalories() {
        int milkCalories1=0,milkCalories2=0,milkCalories3=0,milkCalories=0;
        if(this.quantity1==0 && this.quantity2==0 && this.quantity3==0){
            System.out.println("there was no milk in the breakfast");
        }
        else {
            if(fat1==1.5){
                milkCalories1 = 45*this.quantity1;
                milkCalories+=milkCalories1;
                System.out.println("Calories 0."+this.quantity1+"l 1.5% milk: "+milkCalories1);
            }
            if(fat2==2.5) {
                milkCalories2 = 54*this.quantity2;
                milkCalories+=milkCalories2;
                System.out.println("Calories 0."+this.quantity2+"l 2.5% milk: "+milkCalories2);
            }
            if(fat3==5) {
                milkCalories3 = 75*this.quantity3;
                milkCalories+=milkCalories3;
                System.out.println("Calories 0."+this.quantity3+"l 5% milk: "+milkCalories3);
            }
        }
        return milkCalories;
    }

}
