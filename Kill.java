import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kill extends Actor {

    private GreenfootImage[] images;
    private int action, increment;
    private boolean geluid;

    public Kill() {
        GreenfootImage baseImage;
        int baseSize, verschil, size, teller;

        images = new GreenfootImage[8];
        baseImage = new GreenfootImage("EasterEgg.png");

        baseSize = baseImage.getWidth();
        verschil = baseSize / 8;
        size = 0;
        for (teller = 0; teller < 8; teller++) {
            size += verschil;
            images[teller] = new GreenfootImage(baseImage);
            images[teller].scale(size, size);
        }
        action = 0;
        geluid = true;
        increment = 1;
    }

    protected boolean space() {
        if (Greenfoot.isKeyDown("space")) {
            return true;
        }
        return false;
    }

    public void act() {
        setImage(images[action]);
        action += increment;
        if (geluid) {
            Greenfoot.playSound("Minecraft Damage (Oof) - Sound Effect (HD).mp3");
            if (!space())
                Greenfoot.playSound("DeathSound.mp3");
            geluid = false;
        }
        if (action > 7) {
            increment = -1;
            action += increment;
        }
        if (action < 0) {
            getWorld().removeObject(this);
            if (!space())
                Greenfoot.stop();
        }
    }
}
