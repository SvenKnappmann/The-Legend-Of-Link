import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DungeonStairsFloor1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DungeonStairsFloor1 extends Actor {
    /**
     * Act - do whatever the DungeonStairsFloor1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        foundStairs();
    }

    protected void foundStairs() {
        Actor link;
        link = getOneObjectAtOffset(0, 16, Link.class);
        if (link != null) {
            Greenfoot.setWorld(new Floor1());
        }
    }
}
