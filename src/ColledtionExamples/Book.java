package ColledtionExamples;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        int x = this.price - o.price;
        if(x!=0)
            return x;
        x = this.author.compareTo(o.author);
        return x;
    }



}
