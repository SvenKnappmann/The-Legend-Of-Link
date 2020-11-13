import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenRupee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlueRupee extends Actor {
    Floor1 floor1;
    Floor2 floor2;
    Floor3 floor3;
    Floor4 floor4;
    Floor5 floor5;
    Floor6 floor6;

    /**
     * Act - do whatever the GreenRupee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BlueRupee() {

    }

    public void act() {
        if (Greenfoot.isKeyDown("Space")) {
            if (isTouching(Link.class)) {
                if (floor1.worldBoolean == true) {
                    floor1 = (Floor1) getWorld();
                    floor1.removeObject(this);
                    floor1.counter -= 5;
                } else if (Floor2.worldBoolean == true) {
                    floor2 = (Floor2) getWorld();
                    floor2.removeObject(this);
                    floor2.counter -= 5;
                } else if (Floor3.worldBoolean == true) {
                    floor3 = (Floor3) getWorld();
                    floor3.removeObject(this);
                    floor3.counter -= 5;
                } else if (Floor4.worldBoolean == true) {
                    floor4 = (Floor4) getWorld();
                    floor4.removeObject(this);
                    floor4.counter -= 5;
                } else if (Floor5.worldBoolean == true) {
                    floor5 = (Floor5) getWorld();
                    floor5.removeObject(this);
                    floor5.counter--;
                } else if (Floor6.worldBoolean == true) {
                    floor6 = (Floor6) getWorld();
                    floor6.removeObject(this);
                    floor6.counter--;
                }
            }
        }
    }
}