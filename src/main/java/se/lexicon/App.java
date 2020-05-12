package se.lexicon;

import se.lexicon.garage.Car;
import se.lexicon.garage.Motorcycle;
import se.lexicon.garage.Truck;
import se.lexicon.garage.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Run Vehicle
        //vehicle();




    }

    public static void vehicle(){
        Car mercedes = new Car("red","mercedes",150,2001,2,5,"cupe");
        Motorcycle indian = new Motorcycle("black","indian",70,1999,"short",700);
        Truck gm = new Truck("white","GM",200,1987,"flatbed",4);

        mercedes.drive();
        indian.drive();
        gm.drive();

        System.out.println(mercedes.toString()+"\n");
        System.out.println(indian.toString()+"\n");
        System.out.println(gm.toString());
    }
}
