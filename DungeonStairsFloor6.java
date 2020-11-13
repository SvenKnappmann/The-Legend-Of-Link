import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class DungeonStairsFloor6 extends Actor {
        public void act() {
        foundStairs();
    }
    protected void foundStairs() {
        Actor link;
        link = getOneObjectAtOffset(0, 16, Link.class);
        if (link != null && Floor5.counter <= 0) {
            Floor5.sound.stop();
            Greenfoot.setWorld(new Floor6());
            Floor5.worldBoolean = false;
            Floor6.worldBoolean = true;
        }
    }
}