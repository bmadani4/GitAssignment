package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        Weapon ancient = WeaponFactory.getWeapon("ancient");
        Weapon simplearrow = WeaponFactory.getWeapon("simplearrow");
        Weapon simpleaxe = WeaponFactory.getWeapon("simpleaxe");
        Weapon chosenone = WeaponFactory.getWeapon("chosenone");
        Weapon magic = WeaponFactory.getWeapon("magic");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");
        System.out.println("Ancient has " + ancient.hit() + " of damage.");
        System.out.println("Ancient was able to do " + ancient.hit(armor) + " of damage due to an armor with " + armor + " points.");
        System.out.println("simplearrow has " + simplearrow.hit() + " of damage.");
        System.out.println("simplearrow was able to do " + simplearrow.hit(armor) + " of damage due to an armor with " + armor + " points.");
        System.out.println("simpleaxe has " + simpleaxe.hit() + " of damage.");
        System.out.println("simpleaxe was able to do " + simpleaxe.hit(armor) + " of damage due to an armor with " + armor + " points.");
        System.out.println("chosenone has " + chosenone.hit() + " of damage.");
        System.out.println("chosenone was able to do " + chosenone.hit(armor) + " of damage due to an armor with " + armor + " points.");
        System.out.println("magic has " + magic.hit() + " of damage.");
        System.out.println("magic was able to do " + magic.hit(armor) + " of damage due to an armor with " + armor + " points.");


        //TODO: Add the remaining weapons here

    }
}
