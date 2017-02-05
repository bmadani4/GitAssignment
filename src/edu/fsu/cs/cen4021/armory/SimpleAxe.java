package edu.fsu.cs.cen4021.armory;

/**
 * Created by bmadani4 on 2/2/17.
 */
class SimpleAxe extends BasicWeapon implements Weapon {

    SimpleAxe(){super(60);}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE;
        if (armor < 0 && armor < 20) {
            return damage;
        }
        return (damage - armor);
    }
}
