package selsup;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }

    public void makeSound() {
        this.sound(); // вызов метода sound() текущего объекта
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
