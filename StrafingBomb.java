import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StrafingBomb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StrafingBomb extends Actor {
    public void act() {
        move(5);
        if (atWorldEdge()) {
            move(-10);
            setRotation(getRotation() + 180);
        }
        lookForActor();
    }

    protected boolean atWorldEdge() {
        int x, y, wx, wy, imagepx;

        imagepx = getImage().getWidth() / 2;

        x = getX();
        y = getY();
        wx = getWorld().getWidth() - imagepx;
        wy = getWorld().getHeight() - imagepx;

        if (x <= imagepx) {
            return true;
        } else if (y <= imagepx) {
            return true;
        } else if (x >= wx) {
            return true;
        } else if (y >= wy) {
            return true;
        }
        return false;
    }

    protected void lookForActor() {
        Actor actor;
        actor = getOneObjectAtOffset(0, 0, Actor.class);
        if ((actor != null)) {
            setRotation(getRotation() + 180);
        }
    }
}
