package OOP.Interfaces;

interface Animal {

    void makeSound();
}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
