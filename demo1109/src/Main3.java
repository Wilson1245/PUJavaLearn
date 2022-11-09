import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book(101, "Let us C",8);
        Book b2 = new Book(102, "Operating System", 6);
        Book b3 = new Book(103, "Java Programming", 10);

        // Adding Books to list
        books.add(b1);
        books.add(b2);
        books.add(b3);

        // Traversing list
        for (Book b : books) {
//            System.out.println(b.id + " " + b.name + " " + b.quantity);
            System.out.println(b.toString());
        }
    }
}

class Book {
    int id;
    String name;
    int quantity;

    public Book(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
