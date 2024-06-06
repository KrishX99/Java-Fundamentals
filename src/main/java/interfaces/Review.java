package interfaces;

public interface Review {

    void rating(Integer rating);
    void reviewerName(String name);

    default void defaultTest(){
        System.out.println("Testing default method");
    }

    static void testingStatic(){
        System.out.println("Testing Static method");
    }

}
