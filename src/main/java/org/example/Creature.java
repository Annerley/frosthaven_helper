package org.example;

import java.util.UUID;

public class Creature {

    String uniqueID;
    int hitPoints;
    int maxHitPoints;
    String name;

    int level;

    public Creature(String name, int hitPoints) {
        this.hitPoints = hitPoints;
        this.name = name;
        this.maxHitPoints = hitPoints;
        uniqueID = UUID.randomUUID().toString();

    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void changeHitPoints(int value){

        if(value > 0 ){

            hitPoints = Math.min(maxHitPoints, hitPoints+value);

        }
        if(value < 0){

            hitPoints = Math.max(0, hitPoints + value);
        }

    }

}