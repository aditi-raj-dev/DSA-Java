package OOP.Abstraction;

public class mainc {
    public static void main(String[] args) {

        Animal animal;

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();
    }
}
