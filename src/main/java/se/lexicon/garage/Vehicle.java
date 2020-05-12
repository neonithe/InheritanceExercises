package se.lexicon.garage;
/**
 * SuperClass: Colour, make, hp
 */
public abstract class Vehicle {

    private String color;
    private String make;
    private int hp;
    private int year;

    public Vehicle(String color, String make, int hp, int year) {
        this.color = color;
        this.make = make;
        this.hp = hp;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return "Vehicle: " + "Color: " + color + " | Make: " + make + " | hp: " + hp + " | Year: " + year;
    }
}
