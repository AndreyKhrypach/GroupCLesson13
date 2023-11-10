import Models.*;
import Service.Device;
import Service.Printable;
import Service.Square;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lesson13Program {
    public static void main(String[] args) {

        String[] names = new String[]{
                "Greek", "Google", "g1", "QA", "Ground2"};

        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> predicate = (str) -> str.startsWith("G");

        System.out.println("____________________");
        // Iterate through the list
        for (String st : names) {
            // call the test method
            if (predicate.test(st))
                System.out.println(st);
        }
        System.out.println("____________________");
        Stream.of(names).forEach(s -> System.out.println(s));
        Stream.of(names).forEach(System.out::println);

//        int a = 5;
//
//        // lambda expression to define the calculate method
//        Square s = (int x) -> x * x;
//
//        Square square = new Square() {
//            @Override
//            public int calculate(int x) {
//                return x * x;
//            }
//        };
//
//        System.out.println(square.calculate(a));
//        // parameter passed and return type must be
//        // same as defined in the prototype
//        int ans = s.calculate(a);
//        System.out.println(ans);

//        Figure defaultFigure = new Figure();
//        defaultFigure.paint();

//        Printable printable = createPrintable("Foreign Affairs",false);
//        printable.print();

//        read(new Book("Java for impatients", "Cay Horstmann"));
//        read(new Journal("Java Dayly News"));
//        Book book = new Book("Java for impatients", "Cay Horstmann");
//        Journal journal = new Journal("Java Dayly News");
//        read(book);
//        read(journal);
//        read(printable);

//        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
//        printable.print();      //  Java. Complete Reference (H. Shildt)
//        printable = new Journal("Foreign Policy");
//        printable.print();      // Foreign Policy
//        Journal journal = (Journal) printable;
//        System.out.println(journal.getName());
//        System.out.println(((Journal) printable).getName());

        // Printable.read();

//        WaterPipe pipe = new WaterPipe();
//        pipe.printState(-1);

//        Device.Printable p =new Magazine("Foreign Affairs");
//        p.print();

//        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
//        b1.print();
    }

    private static void read(Printable printable){

        printable.print();
    }

    private static Printable createPrintable(String name, boolean option){

        if(option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }
}
