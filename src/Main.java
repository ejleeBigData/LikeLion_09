class Animal {
    String name;
}

class Dog extends Animal {
    String bread;
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println("동물 : " + dog.name);
    }
}