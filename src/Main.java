class Animal {
    String name;

    //생성자
    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("댕댕이", "푸들");

        System.out.println("동물 : " + dog.name + "품종 : " + dog.breed);
    }
}