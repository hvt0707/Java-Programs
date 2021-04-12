package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int strength,hitPoints;
    private String weapon;

    public Player(String name, int strength, int hitPoints) {
        this.name = name;
        this.strength = strength;
        this.hitPoints = hitPoints;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", hitPoints=" + hitPoints +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> save() {
        List<String> savingItems = new ArrayList<>();
        savingItems.add(0,this.name);
        savingItems.add(1,""+this.hitPoints);
        savingItems.add(2,""+this.strength);
        savingItems.add(3,weapon);
        return savingItems;
    }

    @Override
    public void read(List<String> savedItem) {
        if(savedItem != null && savedItem.size()>0){
            this.name = savedItem.get(0);
            this.hitPoints = Integer.parseInt(savedItem.get(1));
            this.strength = Integer.parseInt(savedItem.get(2));
            this.weapon = savedItem.get(3);
        }
    }
}
