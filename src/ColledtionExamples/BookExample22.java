package ColledtionExamples;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookExample22 {
    public static void main(String[] args) {
        Set<Book> bookSet = new TreeSet<>();
        Book b1 = new Book("Mastering in java", "Venugopal", 575);
        Book b2 = new Book("C in Depth", "Deepali", 650);
        Book b3 = new Book("Spring Boot", "Matt", 615);
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        System.out.println("Toatal Books Added:"+ bookSet.size());
        Iterator<Book> it = bookSet.iterator();//we must have to mention on what baises it have to iterate for that we need to override compareTo() in Book class
        while(it.hasNext()){
            Book b = it.next();
            System.out.println(b);
        }

    }
}
