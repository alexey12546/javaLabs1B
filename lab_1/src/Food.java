public abstract class Food implements Consumble,Nutritious{
    private String name;
    public Food(){
    }

    public Food(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }




}
