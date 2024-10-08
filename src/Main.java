import javax.swing.table.TableCellEditor;

public class Main {
    public static void main(String[] args) {

    }
}

// Задача 1
interface Animal{
    void eat();
    void sleep();
}

abstract class Mammal implements Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public abstract void walk();
}

class Lion extends Mammal {
    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Lion is sleeping");
    }

    public void walk(){
        System.out.println("Lion is walking");
    }
}

class Elephant extends Mammal {
    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Elephant is sleeping");
    }

    public void walk(){
        System.out.println("Elephant is walking");
    }
}

//Задача 2

interface Shape{
    double area();
    double perimetr();
}

abstract class Polygon implements Shape{

    public abstract double area();
    public abstract double perimetr();

    abstract int numberOfSides();
}

class Triangle extends Polygon {
    private double x;
    private double y;
    private double z;

    public Triangle(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double area(){
        double p = (x+y+z)/2;
        return Math.sqrt((p*(p-x)*(p-y)*(p-z)));
    }

    public double perimetr(){
        return x+y+z;
    }

    public int numberOfSides(){
        return 3;
    }
}

class Rectangle extends Polygon {
    private double x;
    private double y;

    public Rectangle(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double area(){
        return x*y;
    }

    public double perimetr(){
        return x*2+y*2;
    }

    public int numberOfSides(){
        return 4;
    }
}

class Circle implements Shape {
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double area(){
        return 3.14*r*r;
    }

    public double perimetr(){
        return 2*3.14*r;
    }
}

//Задача 3
interface Device{
    void turnOn();
    void turnOff();
}

abstract class ElectronicDevice implements Device{

    public abstract void turnOn();
    public abstract void turnOff();

    public abstract int getPowerConsumption(int power);
}

class TV extends ElectronicDevice{
    @Override
    public void turnOn(){
        System.out.println("TV is on");
    }
    @Override
    public void turnOff(){
        System.out.println("TV is off");
    }
    @Override
    public int getPowerConsumption(int power) {
        return power;
    }
}

//Задача 4

interface Product{
    double getPrice();
    String getName();
}

abstract class PhysicalProduct implements Product{
    double weight;
    public abstract double getPrice();
    public abstract String getName();
    public abstract double getWeight();
}

class Book extends PhysicalProduct{
    private double weight;
    private double price;
    private String name;

    public Book(double weight, double price, String name){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public double getWeight(){
        return weight;
    }

    public String getName(){
        return name;
    }
}

class Software implements Product{
    double price;
    String name;

    public Software(double price, String name){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}

//Задача 5

interface Athlete{
    void train();
    void compete();
}

abstract class Runner implements Athlete{
    public abstract void train();
    public abstract void compete();

    public abstract double getBestTime();
}

class Sprinter extends Runner{
    private double bestTime;

    public Sprinter(double bestTime){
        this.bestTime = bestTime;
    }

    public void train(){
        System.out.println("Sprinter is training");
    }

    public void compete(){
        System.out.println("Sprinter is competing");
    }

    public double getBestTime(){
        return bestTime;
    }
}

class MarathonRunner extends Runner{
    private double bestTime;

    public MarathonRunner(double bestTime){
        this.bestTime = bestTime;
    }

    public void train(){
        System.out.println("Marathon runner is training");
    }

    public void compete(){
        System.out.println("Marathon runner is competing");
    }

    public double getBestTime(){
        return bestTime;
    }
}