public class Comparator {

    public Comparator() {
    }

    public void sort(String[] breakfastList) {
        int index = 0;
        String[] breakfastList2 = new String[6];
        for (int i = 0; i < 6; i++) {
            breakfastList2[i] = breakfastList[i];
        }
        String max = breakfastList2[index];
        for (int i = 0; i < breakfastList2.length; i++) {
            max = breakfastList2[i];
            for (int j = i; j < breakfastList2.length; j++) {
                if (breakfastList2[j].length() > max.length()) {
                    max = breakfastList2[j];
                    index = j;
                }
            }
            breakfastList2[index] = breakfastList2[i];
            breakfastList2[i] = max;
        }
        for (int i = 0; i < breakfastList2.length; i++) {
            if (breakfastList2[i] != "0")
                System.out.println(breakfastList2[i] + "-eaten");
        }
    }

}
