package Service;

public interface Painting {

    default void paint() {
        System.out.println("Undefined painting");
    }
}
