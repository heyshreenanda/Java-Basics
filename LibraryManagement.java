import java.util.*;

class Book {
    String bName, author;

    Book(String bName, String author) {
        this.bName = bName;
        this.author = author;
    }

    void display() {
        System.out.println("Book name: " + bName + " Author: " + author);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book books[] = new Book[4];
        books[0] = new Book("Book1 ", "Aut01");
        books[1] = new Book("Book2 ", "Aut02");
        books[2] = new Book("Book3 ", "Aut03");
        books[3] = new Book("Book4 ", "Aut04");

        for (Book b : books) {
            b.display();
        }

        System.out.println(" enter title to search: ");
        String n1 = sc.nextLine();

        boolean isFound = false;

        for (Book b : books) {
            if (b.bName.equals(n1)) {
                System.out.println("book found");
                isFound = true;
                b.display();
                break;
            }

        }
        if (!isFound) {
            System.out.println("book not found");

        }
        sc.close();
    }
}
