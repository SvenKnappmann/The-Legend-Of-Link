import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DungeonStairs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DungeonStairsFloor3 extends Actor {
    public void act() {
        foundStairs();
    }

    protected void foundStairs() {
        Actor link;
        link = getOneObjectAtOffset(0, 16, Link.class);
        if (link != null && Floor2.counter <= 0) {
            Floor2.sound.stop();
            Greenfoot.setWorld(new Floor3());
            Floor2.worldBoolean = false;
            Floor3.worldBoolean = true;
        }
    }
}