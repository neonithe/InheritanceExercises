package se.lexicon.garage;

/**
 * SuperClass: Colour, make, hp
 * Car: 2 / 4 wheel drive, seats, size
 */
public class Car extends Vehicle {

    private int drive;
    private int seats;
    private String size;

    public Car(String color, String make, int hp, int year, int drive, int seats, String size) {
        super(color,make,hp,year);
        this.drive = drive;
        this.seats = seats;
        this.size = size;
    }

    public int getDrive() {
        return drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void drive(){
        System.out.println("Your new car");
    }

    @Override
    public String toString() {
        return  super.toString() + "\nCar: Drive: " + drive + " | Seats: " + seats + " | Size: " + size;
    }
}
