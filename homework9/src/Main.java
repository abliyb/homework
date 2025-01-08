import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Кобзар", "Тарас Шевченко", 122);
        Book b2 = new Book("warrior cats:forest of secrets", "erin hunter", 334);
        Library idk = new Library();
        idk.addBook(b1);
        idk.addBook(b2);
        idk.showBooks();

        Product a1 = new Product("Ковбаса", 12.40);
        Product a2 = new Product("Морозиво", 3.10);
        Store jumbo = new Store();
        jumbo.addProduct(a1);
        jumbo.addProduct(a2);
        jumbo.showProducts();
    }
}

class Book {
    String name;
    String autor;
    int numberofpages;

    Book(String name, String autor, int numberofpages) {
        this.name = name;
        this.autor = autor;
        this.numberofpages = numberofpages;
    }
}

class Library {
    ArrayList<Book> listofbooks;

    void addBook(Book book) {
        this.listofbooks.add(book);
    }

    Library() {
        this.listofbooks = new ArrayList<>();
    }

    void showBooks() {
        for (int i = 0; i < this.listofbooks.size(); i++) {
            Book b = this.listofbooks.get(i);
            System.out.printf("Назва: %s, Автор: %s, Кількість сторінок: %d\n", b.name, b.autor, b.numberofpages);
        }
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Store {
    ArrayList<Product> products;

    void addProduct(Product product) {
        this.products.add(product);
    }

    Store() {
        this.products = new ArrayList<>();
    }

    void showProducts() {
        for (int i = 0; i < this.products.size(); i++) {
            Product p = this.products.get(i);
            System.out.printf("Назва: %s, Ціна: %.2f\n", p.name, p.price);
        }
    }
}
