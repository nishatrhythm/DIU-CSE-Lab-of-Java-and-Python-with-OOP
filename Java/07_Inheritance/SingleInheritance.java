class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating food.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    String breed;

    void bark() {
        System.out.println(name + " is barking: Woof Woof!");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Rocky";
        myDog.breed = "German Shepherd";

        myDog.displayInfo();
        myDog.eat();
        myDog.bark();
        myDog.sleep();
    }
}
