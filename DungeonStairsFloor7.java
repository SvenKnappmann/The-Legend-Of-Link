import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class DungeonStairsFloor7 extends Actor {
        public void act() {
        foundStairs();
    }
    protected void foundStairs() {
        Actor link;
        link = getOneObjectAtOffset(0, 16, Link.class);
        if (link != null && Floor6.counter <= 0) {
            Floor6.sound.stop();
            Greenfoot.setWorld(new Floor7());
            Floor6.worldBoolean = false;
            Floor7.worldBoolean = true;
        }
    }
}
