import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Link here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Link extends Actor {
    private GreenfootImage imageLeft;
    private GreenfootImage imageRight;
    private GreenfootImage imageSwordL;
    private GreenfootImage imageSwordR;
    private GreenfootImage imageFront;
    private GreenfootImage imageBack;
    private GreenfootImage imageSwordF;
    private GreenfootImage imageSwordB;
    private GreenfootImage imageSans;
    Floor1 world = (Floor1) getWorld();
    int speed;
    public int hp = 40;
    boolean collect = false;

    public Link() {
        imageLeft = new GreenfootImage("LinkLeft.png");
        imageRight = new GreenfootImage("LinkRight.png");
        imageSwordL = new GreenfootImage("SwordLinkL.png");
        imageSwordR = new GreenfootImage("SwordLinkR.png");
        imageFront = new GreenfootImage("LinkFront.png");
        imageBack = new GreenfootImage("LinkBack.png");
        imageSwordF = new GreenfootImage("SwordLinkF.png");
        imageSwordB = new GreenfootImage("SwordLinkB.png");
        imageSans = new GreenfootImage("Sans_Pixel.gif");
    }
    public void act() {
        movement();
        collectingRupees();
        foundBomb();
    }
    protected void movement() {
        speed = 4;
        if (Greenfoot.isKeyDown("shift")) {
            speed = 8;
        }
        if (Greenfoot.isKeyDown("space")) {
            speed = 2;
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            setImage(imageRight);
            setRotation(0);
            move(speed);
            if (foundWall() || foundVerticalWall())
                move(-speed);
        }
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            setImage(imageLeft);
            setRotation(0);
            move(-speed);
            if (foundWall() || foundVerticalWall())
                move(speed);
        }
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) {
            setImage(imageBack);
            setRotation(90);
            move(-speed);
            if (foundWall() || foundVerticalWall())
                move(speed);
        }
        if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")) {
            setImage(imageFront);
            setRotation(-90);
            move(-speed);
            if (foundWall() || foundVerticalWall())
                move(speed);
        }
        if (Greenfoot.isKeyDown("space")) {
            if (getImage() == imageRight)
                setImage(imageSwordR);
            if (getImage() == imageLeft)
                setImage(imageSwordL);
            if (getImage() == imageFront)
                setImage(imageSwordF);
            if (getImage() == imageBack)
                setImage(imageSwordB);
        }
        if (Greenfoot.isKeyDown("g")) {
            if (getImage() == imageRight)
                setImage("PLinkRight.png");
            if (getImage() == imageSwordR)
                setImage("PSwordLinkR.png");
            if (getImage() == imageLeft)
                setImage("PLinkLeft.png");
            if (getImage() == imageSwordL)
                setImage("PSwordLinkL.png");
            if (getImage() == imageFront)
                setImage("PLinkFront.png");
            if (getImage() == imageSwordF)
                setImage("PSwordLinkF.png");
            if (getImage() == imageBack)
                setImage("PLinkBack.png");
            if (getImage() == imageSwordB)
                setImage("PSwordLinkB.png");
        }
    }
    public boolean collect() {
        if (Greenfoot.isKeyDown("space"))
            return true;

        return false;
    }
    protected void collectingRupees() {
        Actor greenRupee;

        greenRupee = getOneObjectAtOffset(0, 0, GreenRupee.class);
    }
    public void foundBomb() {
        Actor rollingBomb;
        Actor strafingBomb;
        Actor mr_Bones_FinalForm;

        rollingBomb = getOneObjectAtOffset(0, 0, RollingBomb.class);
        strafingBomb = getOneObjectAtOffset(0, 0, StrafingBomb.class);
        mr_Bones_FinalForm = getOneObjectAtOffset(0, 0, Mr_Bones_FinalForm.class);
        if (rollingBomb != null) {
            getWorld().removeObject(rollingBomb);
            getWorld().addObject(new Explosion(), getX(), getY());
            if (!collect())
                getWorld().removeObject(this);
        }
        if (strafingBomb != null) {
            getWorld().removeObject(strafingBomb);
            getWorld().addObject(new Explosion(), getX(), getY());
            if (!collect())
                getWorld().removeObject(this);
        }
        if (mr_Bones_FinalForm != null) {
            getWorld().removeObject(mr_Bones_FinalForm);
            getWorld().addObject(new Kill(), getX(), getY());
            hp--;
            getWorld().addObject(new Mr_Bones_FinalForm(), 650, 350);
            if (hp <= 0) {
                Floor7.sound.stop();
                Greenfoot.setWorld(new OverWorld());
                Floor7.worldBoolean = false;
                OverWorld.worldBoolean = true;
            }
            if (!collect())
                getWorld().removeObject(this);
        }
    }
    protected boolean foundWall() {
        Actor wall;
        Actor redWall;
        Actor greenWall;
        Actor ghostWall;
        Actor blackWall;
        Actor whiteWall;
        Actor yellowWall;
        wall = getOneObjectAtOffset(0, 0, Wall.class);
        redWall = getOneObjectAtOffset(0, 0, RedWall.class);
        greenWall = getOneObjectAtOffset(0, 0, GreenWall.class);
        ghostWall = getOneObjectAtOffset(0, 0, GhostWall.class);
        blackWall = getOneObjectAtOffset(0, 0, BlackWall.class);
        whiteWall = getOneObjectAtOffset(0, 0, WhiteWall.class);
        yellowWall = getOneObjectAtOffset(0, 0, YellowWall.class);
        if (wall != null || redWall != null || greenWall != null || ghostWall != null || yellowWall != null || blackWall != null || whiteWall != null) {
            return true;
        }
        return false;
    }
    protected boolean foundVerticalWall() {
        Actor verticalWall;
        Actor redVerticalWall;
        Actor greenVerticalWall;
        Actor ghostVerticalWall;
        Actor blackVerticalWall;
        Actor whiteVerticalWall;
        Actor yellowVerticalWall;
        verticalWall = getOneObjectAtOffset(0, 0, VerticalWall.class);
        redVerticalWall = getOneObjectAtOffset(0, 0, RedVerticalWall.class);
        greenVerticalWall = getOneObjectAtOffset(0, 0, GreenVerticalWall.class);
        ghostVerticalWall = getOneObjectAtOffset(0, 0, GhostVerticalWall.class);
        blackVerticalWall = getOneObjectAtOffset(0, 0, BlackVerticalWall.class);
        whiteVerticalWall = getOneObjectAtOffset(0, 0, WhiteVerticalWall.class);
        yellowVerticalWall = getOneObjectAtOffset(0, 0, YellowVerticalWall.class);
        if (verticalWall != null || redVerticalWall != null || greenVerticalWall != null || ghostVerticalWall != null || yellowVerticalWall != null || blackVerticalWall != null || whiteVerticalWall != null) {
            return true;
        }
        return false;
    }
}