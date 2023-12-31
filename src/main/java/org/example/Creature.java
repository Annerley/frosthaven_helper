package org.example;

import jakarta.persistence.*;
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

    @Transient
    int maxHp = hitPoints;


    @Transient
    public int getMaxHp(){
        return maxHp;
    }


}