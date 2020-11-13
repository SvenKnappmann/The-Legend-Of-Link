import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverWorld extends World {
    public static boolean worldBoolean;
    public static GreenfootSound sound; 
    public OverWorld() {    
        super(816, 624, 1);
        this.worldBoolean = true;
        sound = new GreenfootSound("Overworld - The Legend of Zelda.mp3");
        sound.playLoop();
        addObject(new Link(), 408, 312);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(){
        GhostWall ghostWall = new GhostWall();
        addObject(ghostWall,31,167);
        GhostWall ghostWall2 = new GhostWall();
        addObject(ghostWall2,94,167);
        GhostWall ghostWall3 = new GhostWall();
        addObject(ghostWall3,156,167);
        GhostWall ghostWall4 = new GhostWall();
        addObject(ghostWall4,216,167);
        GhostWall ghostWall5 = new GhostWall();
        addObject(ghostWall5,276,167);
        GhostWall ghostWall6 = new GhostWall();
        addObject(ghostWall6,337,167);
        GhostWall ghostWall7 = new GhostWall();
        addObject(ghostWall7,397,167);
        GhostWall ghostWall8 = new GhostWall();
        addObject(ghostWall8,459,167);
        GhostWall ghostWall9 = new GhostWall();
        addObject(ghostWall9,522,167);
        GhostWall ghostWall10 = new GhostWall();
        addObject(ghostWall10,583,167);
        GhostWall ghostWall11 = new GhostWall();
        addObject(ghostWall11,644,167);
        GhostWall ghostWall12 = new GhostWall();
        addObject(ghostWall12,704,167);
        GhostWall ghostWall13 = new GhostWall();
        addObject(ghostWall13,764,167);
        GhostWall ghostWall14 = new GhostWall();
        addObject(ghostWall14,812,167);
    }
}
