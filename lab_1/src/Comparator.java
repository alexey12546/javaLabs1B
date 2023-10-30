public class Comparator{

    public Comparator(){
    }

    public void sort(String[] breakfastList) {
        int index=0;
        String[] breakfastList2=new String[6];
        for (int i = 0; i<6;i++){
            breakfastList2[i]=breakfastList[i];
        }
        String max=breakfastList2[index];
        for (int i = 0; i < breakfastList2.length ; i++){
            for(int j = 0; j < breakfastList2.length ; j++){
                max=breakfastList2[i];
                if(breakfastList2[j].length()>max.length()){
                    max=breakfastList2[j];
                    index=j;
                }
            }
            breakfastList2[index]=breakfastList2[i];
            breakfastList2[i]=max;
        }
        for (int i = 0; i < breakfastList2.length ; i++){
            System.out.println(breakfastList2[i]+"-eaten");
        }
    }

}
