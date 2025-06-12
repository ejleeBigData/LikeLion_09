class Animal {
    String name;

    //생성자
    public Animal(String name) {
        this.name = name;
    }

    public void printName(String name) {
        System.out.println("동물 이름 : " + name + this.name);
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

        dog.printName("멍냥이");

    }
}