package se.lexicon.garage;
/**
 * SuperClass: Colour, make, hp
 * Motorcycle: long or short, kubic
 */
public class Motorcycle extends Vehicle {

    private String size;
    private int kubic;

    public Motorcycle(String color, String make, int hp, int year,String size, int kubic) {
        super(color,make,hp,year);
        this.size = size;
        this.kubic = kubic;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getKubic() {
        return kubic;
    }

    public void setKubic(int kubic) {
        this.kubic = kubic;
    }

    @Override
    public void drive(){
        System.out.println("Your new Motorcycle");
    }

    @Override
    public String toString() {
        return super.toString() + "\nMotorcycle: | Size: " + size +" | Kubic: " + kubic;
    }
}
