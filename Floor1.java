import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Floor1 extends World {

    public static int counter;
    public static boolean worldBoolean;
    public static GreenfootSound sound;

    /**
     * Constructor for objects of class MyWorld.
     */

    public Floor1() {
        super(1300, 700, 1);
        this.counter = 13;
        this.worldBoolean = true;
        terraForming();
        walls(30, 70, 10);
        verticalWalls(612, 85, 4);
        walls(800, 70, 9);
        verticalWalls(785, 85, 4);
        verticalWalls(530, 85, 3);
        walls(94, 320, 9);
        verticalWalls(440, 174, 3);
        walls(362, 224, 2);
        walls(894, 317, 7);
        verticalWalls(611, 418, 5);
        verticalWalls(455, 363, 3);
        sound = new GreenfootSound("Title Theme - The Legend of Zelda.mp3");
        prepare();
    }

    protected void terraForming() {
        int tellerWall = 0;
        int tellerVWall = 0;

        addObject(new Link(), 20, 20);
        addObject(new Mr_Bones(), 1200, 600);

        //Rupees
        addObject(new GreenRupee(), 1280, 680);
        addObject(new GreenRupee(), 1200, 450);
        addObject(new GreenRupee(), 20, 680);
        addObject(new GreenRupee(), 570, 120);
        setPaintOrder(
                Mr_Bones_FinalForm.class,
                Link.class,
                Mr_Bones.class,
                RollingBomb.class,
                Wall.class,
                VerticalWall.class,
                DungeonStairsFloor1.class,
                DungeonStairsFloor2.class,
                GreenRupee.class,
                Door.class
        );
    }

    protected void walls(int x, int y, int amount) {
        int teller = 0;
        for (int i = 0; i < amount; i++) {
            addObject(new Wall(), x + teller, y);
            teller += 63;
        }
    }

    protected void verticalWalls(int x, int y, int amount) {
        int teller = 0;
        for (int i = 0; i < amount; i++) {
            addObject(new VerticalWall(), x, y + teller);
            teller += 63;
        }
    }

    public void started() {
        sound.playLoop();
    }

    public void stopped() {
        sound.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        VerticalWall verticalWall = new VerticalWall();
        addObject(verticalWall, 296, 116);
        VerticalWall verticalWall2 = new VerticalWall();
        addObject(verticalWall2, 785, 301);
        Wall wall = new Wall();
        addObject(wall, 910, 317);
        Door door = new Door();
        addObject(door, 832, 315);
        RollingBomb rollingBomb = new RollingBomb();
        addObject(rollingBomb, 1014, 256);
        RollingBomb rollingBomb2 = new RollingBomb();
        addObject(rollingBomb2, 1013, 176);
        RollingBomb rollingBomb3 = new RollingBomb();
        addObject(rollingBomb3, 1065, 216);
        GreenRupee greenRupee = new GreenRupee();
        addObject(greenRupee, 1274, 112);
        VerticalWall verticalWall3 = new VerticalWall();
        addObject(verticalWall3, 785, 363);
        VerticalWall verticalWall4 = new VerticalWall();
        addObject(verticalWall4, 785, 425);
        VerticalWall verticalWall5 = new VerticalWall();
        addObject(verticalWall5, 785, 486);
        Wall wall2 = new Wall();
        addObject(wall2, 830, 410);
        Wall wall3 = new Wall();
        addObject(wall3, 891, 410);
        Wall wall4 = new Wall();
        addObject(wall4, 953, 410);
        VerticalWall verticalWall6 = new VerticalWall();
        addObject(verticalWall6, 968, 427);
        VerticalWall verticalWall7 = new VerticalWall();
        addObject(verticalWall7, 1040, 426);
        Wall wall5 = new Wall();
        addObject(wall5, 1055, 411);
        Wall wall6 = new Wall();
        addObject(wall6, 1118, 411);
        Wall wall7 = new Wall();
        addObject(wall7, 1176, 411);
        Wall wall8 = new Wall();
        addObject(wall8, 1235, 411);
        Wall wall9 = new Wall();
        addObject(wall9, 1289, 411);
        VerticalWall verticalWall8 = new VerticalWall();
        addObject(verticalWall8, 785, 680);
        VerticalWall verticalWall9 = new VerticalWall();
        addObject(verticalWall9, 785, 647);
        VerticalWall verticalWall10 = new VerticalWall();
        addObject(verticalWall10, 455, 363);
        Wall wall10 = new Wall();
        addObject(wall10, 487, 520);
        Wall wall11 = new Wall();
        addObject(wall11, 588, 522);
        VerticalWall verticalWall11 = new VerticalWall();
        addObject(verticalWall11, 453, 598);
        VerticalWall verticalWall12 = new VerticalWall();
        addObject(verticalWall12, 452, 660);
        VerticalWall verticalWall13 = new VerticalWall();
        addObject(verticalWall13, 452, 696);
        Door door2 = new Door();
        addObject(door2, 31, 318);
        VerticalWall verticalWall14 = new VerticalWall();
        addObject(verticalWall14, 73, 680);
        Wall wall12 = new Wall();
        addObject(wall12, 25, 592);
        VerticalWall verticalWall15 = new VerticalWall();
        addObject(verticalWall15, 72, 577);
        VerticalWall verticalWall16 = new VerticalWall();
        addObject(verticalWall16, 152, 676);
        Wall wall13 = new Wall();
        addObject(wall13, 168, 633);
        Wall wall14 = new Wall();
        addObject(wall14, 168, 562);
        Wall wall15 = new Wall();
        addObject(wall15, 228, 562);
        VerticalWall verticalWall17 = new VerticalWall();
        addObject(verticalWall17, 275, 577);
        VerticalWall verticalWall18 = new VerticalWall();
        addObject(verticalWall18, 276, 637);
        VerticalWall verticalWall19 = new VerticalWall();
        addObject(verticalWall19, 276, 697);
        VerticalWall verticalWall20 = new VerticalWall();
        addObject(verticalWall20, 154, 545);
        Wall wall16 = new Wall();
        addObject(wall16, 110, 497);
        Wall wall17 = new Wall();
        addObject(wall17, 110, 497);
        Door door3 = new Door();
        addObject(door3, 32, 463);
        VerticalWall verticalWall21 = new VerticalWall();
        addObject(verticalWall21, 79, 479);
        VerticalWall verticalWall22 = new VerticalWall();
        addObject(verticalWall22, 155, 512);
        GreenRupee greenRupee2 = new GreenRupee();
        addObject(greenRupee2, 187, 676);
        GreenRupee greenRupee3 = new GreenRupee();
        addObject(greenRupee3, 396, 274);
        GreenRupee greenRupee4 = new GreenRupee();
        addObject(greenRupee4, 112, 676);
        GreenRupee greenRupee5 = new GreenRupee();
        addObject(greenRupee5, 577, 676);
        GreenRupee greenRupee6 = new GreenRupee();
        addObject(greenRupee6, 817, 680);
        GreenRupee greenRupee7 = new GreenRupee();
        addObject(greenRupee7, 19, 110);
        GreenRupee greenRupee8 = new GreenRupee();
        addObject(greenRupee8, 1274, 28);
        GreenRupee greenRupee9 = new GreenRupee();
        addObject(greenRupee9, 753, 679);
        VerticalWall verticalWall23 = new VerticalWall();
        addObject(verticalWall23, 1200, 116);
        VerticalWall verticalWall24 = new VerticalWall();
        addObject(verticalWall24, 1200, 177);
        VerticalWall verticalWall25 = new VerticalWall();
        addObject(verticalWall25, 1200, 238);
        DungeonStairsFloor2 dungeonStairsFloor2 = new DungeonStairsFloor2();
        addObject(dungeonStairsFloor2, 1202, 668);
    }
}
