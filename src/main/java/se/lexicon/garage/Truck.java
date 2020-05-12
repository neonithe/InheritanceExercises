package se.lexicon.garage;
/**
 * SuperClass: Colour, make, hp
 * Truck: open or closed, 2 or 4 wheel drive
 */
public class Truck extends Vehicle {

    private String flatbed;
    private int drive;


    public Truck(String color, String make, int hp, int year, String flatbed, int drive) {
        super(color,make,hp,year);
        this.flatbed = flatbed;
        this.drive = drive;
    }

    public String getFlatbed() {
        return flatbed;
    }

    public void setFlatbed(String flatbed) {
        this.flatbed = flatbed;
    }

    public int getDrive() {
        return drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    @Override
    public void drive(){
        System.out.println("Your new Truck");
    }

    @Override
    public String toString() {
        return super.toString() + "\nTruck: | Flatbed: " + flatbed + " | Drive: " + drive;
    }
}
