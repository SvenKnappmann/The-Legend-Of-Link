import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DungeonStairs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DungeonStairsFloor4 extends Actor {
    public void act() {
        foundStairs();
    }

    protected void foundStairs() {
        Actor link;
        link = getOneObjectAtOffset(0, 16, Link.class);
        if (link != null && Floor3.counter <= 0) {
            Floor3.sound.stop();
            Greenfoot.setWorld(new Floor4());
            Floor3.worldBoolean = false;
            Floor4.worldBoolean = true;
        }
    }
}