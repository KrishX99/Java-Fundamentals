package abstract_classes;

public abstract class Review {

    private String name;

    public Review(String name){
        this.name = name;
    }

    public abstract void rating(Integer rating);
    public abstract void reviewerName(String name);

    public static void good(){
        System.out.println("Good");
    }

    public static void poor(){
        System.out.println("Poor");
    }

    public String getName(){
        return name;
    }

}
