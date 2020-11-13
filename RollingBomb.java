import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RollingBomb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RollingBomb extends Actor {
    public void act() {
        int bounce;
        move(5);
        bounce = (int) (Math.round(Math.random() * 359 + (1 - 1)));
        if (atWorldEdge()) {
            move(-10);
            setRotation(getRotation() + bounce);
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
        int bounce;
        Actor actor;
        actor = getOneObjectAtOffset(0, 0, Actor.class);
        bounce = (int) (Math.round(Math.random() * 359 + (1 - 1)));
        if ((actor != null))
            turn(bounce);
    }
}