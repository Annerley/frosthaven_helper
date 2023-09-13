package org.example;
import com.dl.entity.UserHelper;

import java.util.ArrayList;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {




        ArrayList a = new ArrayList<Creature>();

        int id = new CreatureHelper().getIdByName("Living Bones");

        a.add(new CreatureHelper().getCreature(id));

        new CreatureHelper().changeHp((Creature) a.get(0), 2);

        new CreatureHelper().changeHp((Creature) a.get(0), 2);

        System.out.println(a);



        //roadmap
        //1 - change hp, db architecture, storing, cache (?)
        // web
        // changing through web



    }
}