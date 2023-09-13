package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "creatures")
public class Creature {

    @Id
    int id;
    @Column(name = "base_hp")
    int hitPoints;

    //int maxHitPoints = hitPoints;
    String name;

    int movement;
    int baseAttack;
    int range;


    //int level;

/*
    void changeHitPoints(int value){

        if(value > 0 ){

            hitPoints = Math.min(maxHitPoints, hitPoints+value);

        }
        if(value < 0){

            hitPoints = Math.max(0, hitPoints + value);
        }

    }
    */


}