import java.util.*;

class Book {
    int id;
    String name;
    boolean issued;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.issued = false;
    }

    void display() {
        System.out.println(id + " " + name + " " + (issued ? "Issued" : "Available"));
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(int id, String name) {
        books.add(new Book(id, name));
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id && !b.issued) {
                b.issued = true;
                System.out.println("Book Issued");
                return;
            }
        }
        System.out.println("Book not available");
    }

    void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id && b.issued) {
                b.issued = false;
                System.out.println("Book Returned");
                return;
            }
        }
        System.out.println("Invalid Book ID");
    }
}

class LMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("1.Add Book 2.Display 3.Issue 4.Return 5.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    int id = sc.nextInt();
                    sc.nextLine();
                    String name = sc.nextLine();
                    lib.addBook(id, name);
                    break;

                case 2:
                    lib.displayBooks();
                    break;

                case 3:
                    lib.issueBook(sc.nextInt());
                    break;

                case 4:
                    lib.returnBook(sc.nextInt());
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}