import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mr_Bones_FinalForm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mr_Bones_FinalForm extends Actor {
    GifImage Sans = new GifImage("Sans_Pixel.gif");
    Floor1 floor1;
    Floor2 floor2;
    Floor3 floor3;
    Floor4 floor4;
    Floor5 floor5;
    Floor6 floor6;
    public void act() {
        setImage(Sans.getCurrentImage());
        int bounce;
        move(5);
        bounce = (int) (Math.round(Math.random() * 359 + (1 - 1)));
        if (atWorldEdge()) {
            move(-5);
            setRotation(getRotation() + bounce);
        }
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