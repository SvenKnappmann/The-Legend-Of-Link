import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DungeonStairs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DungeonStairsFloor2 extends Actor {
    public void act() {
        foundStairs();
    }

    protected void foundStairs() {
        Actor link;
        link = getOneObjectAtOffset(0, 16, Link.class);
        if (link != null && Floor1.counter <= 0) {
            Floor1.sound.stop();
            Greenfoot.setWorld(new Floor2());
            Floor1.worldBoolean = false;
            Floor2.worldBoolean = true;
        }
    }
}