package edu.fsu.cs.cen4021.armory;

/**
 * Created by bmadani4 on 2/2/17.
 */
class SimpleArrow extends BasicWeapon implements Weapon {

    SimpleArrow() {super(70);}


    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (armor - 5);
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
