package se.lexicon;

import se.lexicon.enumPractise.Dice;
import se.lexicon.garage.Car;
import se.lexicon.garage.Motorcycle;
import se.lexicon.garage.Truck;
import se.lexicon.garage.Vehicle;

import java.util.Random;

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
        //randomEnumDiceRoll();

    }

    public static void randomEnumDiceRoll(){
        System.out.println("Roll D6:   " + Dice.D6.roll());
        System.out.println("Roll D10:  " + Dice.D10.roll());
        System.out.println("Roll D20:  " + Dice.D20.roll());
        System.out.println("Roll D100: " + Dice.D100.roll());
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
