import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Олег", 1, 20000, "продажі");
        Engineer engineer = new Engineer("Ксенія", 2, 30000, "програмування");
        Company company  = new Company();
        company.addEmployee(manager);
        company.addEmployee(engineer);
        company.listEmployees();
        company.deleteEmployee(1);
        company.listEmployees();

        Cat cat = new Cat("Мурчик", 12, "чорний");
        Dog dog = new Dog("Гавчик", 5, "пудель");
        PetStore store = new PetStore();
        store.addAnimal(cat);
        store.addAnimal(dog);
        store.customizeAnimalInfo("Мурчик", "ловить мишей");
        store.customizeAnimalInfo("Гавчик", "гризе тапки");
        store.listAnimals();
        store.removeAnimal("Мурчик");
        store.listAnimals();

    }
}

abstract class Employee {
    String name;
    int id;
    double salary;
    abstract void getDetais();
}

class Manager extends Employee {
    String department;
    Manager (String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }
    void getDetais() {
        System.out.println("Менеджер " + this.name + " працює у відділі " + this.department);
    }
}

class Engineer extends Employee {
    String speciality;
    Engineer (String name, int id, double salary, String speciality) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.speciality = speciality;
    }
    void getDetais() {
        System.out.println("Інженер " + this.name + ", спеціалізація " + this.speciality);
    }
}

class Company {
    ArrayList<Employee> employees;
    Company() {
        this.employees = new ArrayList<>();
    }
    void addEmployee(Employee e) {
        this.employees.add(e);
    }
    void deleteEmployee(int id) {
        for (int i = 0; i < this.employees.size(); i++) {
            Employee e = this.employees.get(i);
            if (e.id == id) {
                this.employees.remove(i);
            }
        }
    }
    void listEmployees() {
        for (int i = 0; i < this.employees.size(); i++) {
            this.employees.get(i).getDetais();
        }
    }
}

abstract class Animal {
    String name;
    int age;
    String customInfo = "";
    abstract void getInfo();
    void customizeInfo(String customInfo) {
        this.customInfo = customInfo;
    }
}

class Dog extends Animal {
    String breed;
    Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    void getInfo() {
        System.out.printf("Собака %s, %d років, порода: %s, інформація: %s\n", this.name, this.age, this.breed, this.customInfo);
    }
}

class Cat extends Animal {
    String color;
    Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void getInfo() {
        System.out.printf("Кіт %s, %d років, колір: %s, інформація: %s\n", this.name, this.age, this.color, this.customInfo);
    }
}

class PetStore {
    ArrayList<Animal> animals;
    PetStore() {
        this.animals = new ArrayList<>();
    }
    void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    void removeAnimal(String name) {
        for (int i = 0; i < this.animals.size(); i++) {
            Animal a = this.animals.get(i);
            if (a.name.equals(name)) {
                this.animals.remove(i);
            }
        }
    }
    void listAnimals() {
        for (int i = 0; i < this.animals.size(); i++) {
            this.animals.get(i).getInfo();
        }
    }
    void customizeAnimalInfo(String name, String customInfo) {
        for (int i = 0; i < this.animals.size(); i++) {
            Animal a = this.animals.get(i);
            if (a.name.equals(name)) {
                a.customizeInfo(customInfo);
            }
        }
    }
}