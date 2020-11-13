import greenfoot.*;

public class DungeonStairsFloor5 extends Actor {
        public void act() {
        foundStairs();
    }
    protected void foundStairs() {
        Actor link;
        link = getOneObjectAtOffset(0, 16, Link.class);
        if (link != null && Floor4.counter <= 0) {
            Floor4.sound.stop();
            Greenfoot.setWorld(new Floor5());
            Floor4.worldBoolean = false;
            Floor5.worldBoolean = true;
        }
    }
}