import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      Product a1 = new Product(1,"Книжка",2.1);
      Product a2 = new Product(2,"Іграшка",3.55);
      Store jumbo = new Store();
      jumbo.addProduct(a1);
      jumbo.addProduct(a2);
      jumbo.ListProduct();
      jumbo.removeProduct(2);

      Customer yura = new Customer("Юра");
      yura.addToCart(a1);
      yura.addToCart(a2);
      yura.removeFromCart(2);
      yura.checkout();
    }
}
class Product {
    int id;
    String name;
    double price;
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
class Store {
    String name;
    ArrayList<Product> products;

   void addProduct (Product product){
       this.products.add(product);
   }
   Store(){
       this.products = new ArrayList<>();
   }
   void removeProduct(int productId) {
       for (int i = 0; i < this.products.size(); i++) {
           Product a = this.products.get(i);
           if (a.id == productId) {
               this.products.remove(i);
           }
       }
   }
   void ListProduct(){
       for (int i = 0; i < this.products.size(); i++){
           Product a = this.products.get(i);
           System.out.printf("Id: %d, Name: %s,Price: %.2f\n" , a.id,a.name,a.price);
       }
   }
}
class Customer {
  String name;
  ArrayList<Product> products;
  Customer(String name) {
      this.name = name;
      this.products = new ArrayList<>();
  }
    void addToCart(Product product){
      this.products.add(product);
    }

    void removeFromCart(int productId){
        for (int i = 0; i < this.products.size(); i++) {
            Product a = this.products.get(i);
            if (a.id == productId) {
                this.products.remove(i);
            }
        }
    }

    void checkout() {
      double sum = 0;
        for (int i = 0; i < this.products.size(); i++) {
            Product a = this.products.get(i);
            sum += a.price;
            System.out.printf("Id: %d, Name: %s,Price: %.2f\n" , a.id,a.name,a.price);
            System.out.printf("Total: %.2f\n" , sum);
        }
    }
}
