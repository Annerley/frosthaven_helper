package org.example;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        LinkedList<Creature> currentPool = new LinkedList<Creature>();

        for(int i = 0; i < 3; i++){

            currentPool.add(new Creature("Wolf", 10));
        }

        for(int i = 0; i < 3; i++){

            currentPool.get(i).changeHitPoints(-5);
            System.out.println(currentPool.get(i).getName());
            System.out.println(currentPool.get(i).getHitPoints());
            System.out.println(currentPool.get(i).getUniqueID());
        }





    }
}