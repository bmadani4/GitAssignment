/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen4021.armory;

import java.util.IllegalFormatCodePointException;

/**
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "sword":
                return new Sword();
            case "ancient":
                return new AncientMagicStuff();
            case "simpleaxe":
                return new SimpleAxe();
            case "simplearrow":
                return new SimpleArrow();
            case "chosenone":
                return new TheChosenOneAxe();
            case "magic":
                return new SimpleMagicStaff();

            default:
                throw new IllegalArgumentException("Invalid type");







        }
    }

}
