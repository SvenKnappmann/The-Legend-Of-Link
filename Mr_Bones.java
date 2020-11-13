import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mr_Bones here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mr_Bones extends Actor {
    GifImage Sans = new GifImage("Sans_Pixel (2).gif");
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
            move(-10);
            setRotation(getRotation() + bounce);
        }
        lookForLink();
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
    protected void lookForLink() {
        Actor link;
        link = getOneObjectAtOffset(1, 1, Link.class);
        if (link != null) {
            if (Floor1.worldBoolean == true) {
                floor1 = (Floor1) getWorld();
                floor1.sound.stop();
            } else if (Floor2.worldBoolean == true) {
                floor2 = (Floor2) getWorld();
                floor2.sound.stop();
            } else if (Floor3.worldBoolean == true) {
                floor3 = (Floor3) getWorld();
                floor3.sound.stop();
            } else if (Floor4.worldBoolean == true) {
                floor4 = (Floor4) getWorld();
                floor4.sound.stop();
            } else if (Floor5.worldBoolean == true) {
                floor5 = (Floor5) getWorld();
                floor5.sound.stop();
            } else if (Floor6.worldBoolean == true) {
                floor6 = (Floor6) getWorld();
                floor6.sound.stop();
            }
            Greenfoot.playSound("DeathSound.mp3");
            getWorld().removeObject(link);
            Greenfoot.stop();
        }
    }
}
