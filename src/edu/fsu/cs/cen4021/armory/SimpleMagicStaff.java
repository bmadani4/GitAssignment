package edu.fsu.cs.cen4021.armory;

/**
 * Created by bmadani4 on 2/2/17.
 */
class SimpleMagicStaff extends BasicWeapon implements Weapon {


    SimpleMagicStaff() {super (80);}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        float temp = (float) (armor -(armor * 0.2));

        int damage = DAMAGE;
        damage = (int) (damage - temp);
        return damage;
    }
}
