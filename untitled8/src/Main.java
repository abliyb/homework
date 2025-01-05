import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Картошка фрі", 10.5, "Гарнір");
        dish1.displayInfo();
        Restaurant.addDish(dish1);
        Dish dish2 = new Dish("Сосиска", 5, "М'ясні страви");
        dish2.displayInfo();
        Restaurant.addDish(dish2);
        Dish dish3 = new Dish("Кока-кола", 3.25, "Напої");
        dish3.displayInfo();
        Restaurant.addDish(dish3);
        System.out.println("Загальна кількість страв: " + Restaurant.getTotalDishes());
        Car car1 = new Car("Megan", 2014, "Renault");
        car1.displayInfo();
        Car car2 = new Car("C3", 2023, "Citroen");
        car2.displayInfo();
        System.out.println("Загальна кількість машин: " + Car.total());
    }
}

class Dish {
    String name;
    double price;
    String category;
    public Dish(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public void displayInfo() {
        System.out.printf("Назва: %s, Ціна: %s, Категорія: %s\n", this.name, this.price, this.category);
    }
}

class Restaurant {
    public static ArrayList<Dish> dishes = new ArrayList<>();
    public static void addDish(Dish dish) {
        dishes.add(dish);
    }
    public static long getTotalDishes() {
        return dishes.size();
    }
}

class Car {
    String model;
    int year;
    String manufacturer;
    static int totalCarsProduced;
    public Car(String model, int year, String manufacturer) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        totalCarsProduced = totalCarsProduced + 1;
    }
    public void displayInfo() {
        System.out.printf("Модель: %s, Рік: %s, Виробник: %s\n", this.model, this.year, this.manufacturer);
    }
    public static int total() {
        return totalCarsProduced;

    }
}
