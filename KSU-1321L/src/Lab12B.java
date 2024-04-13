import java.util.Scanner;


class Dog {
    public int age;
    public double weight;
    public String name;
    public String furColor;
    public String breed;

    public Dog(int age, double weight, String name, String furColor, String breed) {

        this.age = age;
        this.weight = weight;
        this.name = name;
        this.furColor = furColor;
        this.breed = breed;
    }


    public void bark() {

        System.out.println("Woof! Woof!");
    }


    public void rename(String newName) {

        this.name = newName;
    }


    public void eat(double foodWeight) {

        this.weight += foodWeight;
    }
}


public class Lab12B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("You are about to create a dog");


        System.out.print("How old is the dog: ");
        int age = scanner.nextInt();

        System.out.print("How much does the dog weigh: ");
        double weight = scanner.nextDouble();

        System.out.print("What is the dog’s name: ");
        String name = scanner.next();

        System.out.print("What color is the dog: ");
        String furColor = scanner.next();

        System.out.print("What breed is the dog: ");
        String breed = scanner.next();


        Dog myDog = new Dog(age, weight, name, furColor, breed);


        System.out.println(myDog.name + " is a " + myDog.age + " year old " +
                myDog.furColor + " " + myDog.breed +
                " that weighs " + myDog.weight + " lbs.");


        myDog.bark();

        System.out.print(myDog.name + " is hungry, how much should he eat: ");

        double foodWeight = scanner.nextDouble();
        myDog.eat(foodWeight);

        System.out.print(myDog.name + " isn’t a very good name. What should they be renamed to: ");

        String newName = scanner.next();
        myDog.rename(newName);


        System.out.println(myDog.name + " is a " + myDog.age + " year old " +
                myDog.furColor + " " + myDog.breed +
                " that weighs " + myDog.weight + " lbs.");
    }
}
