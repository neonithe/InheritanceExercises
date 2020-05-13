package se.lexicon.enumPractise;

import java.util.Random;

public enum Dice {

    D6(6),
    D10(10),
    D20(20),
    D100(100);

    int max;
    int min =1;

    Dice(int size) {
        this.max = size;
    }

    public int roll(){
        Random random = new Random();
            int result = random.nextInt(max-min)+min;
            return result;
    }
}

