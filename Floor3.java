import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Floor3 extends World {
    public static int counter;
    public static GreenfootSound sound;
    public static boolean worldBoolean;

    public Floor3() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 700, 1);
        this.counter = 51;
        this.worldBoolean = true;
        terraForming();
        sound = new GreenfootSound("Death Mountain - The Legend of Zelda.mp3");
        sound.playLoop();
        walls(712, 292, 5);
        walls(340, 292, 5);
        verticalWalls(1007, 339, 4);
        verticalWalls(293, 339, 4);
        walls(712, 103, 8);
        walls(154, 103, 8);
        verticalWalls(1193, 150, 7);
        verticalWalls(107, 150, 7);
        prepare();
    }

    protected void terraForming() {
        int tellerWall = 0;
        int tellerVWall = 0;

        addObject(new Link(), 650, 350);
        addObject(new Mr_Bones(), 650, 600);

        setPaintOrder(
                Mr_Bones_FinalForm.class,
                Link.class,
                Mr_Bones.class,
                RollingBomb.class,
                GreenWall.class,
                GreenVerticalWall.class,
                DungeonStairsFloor4.class,
                GreenRupee.class,
                Door.class
        );
    }

    protected void walls(int x, int y, int amount) {
        int teller = 0;
        for (int i = 0; i < amount; i++) {
            addObject(new GreenWall(), x + teller, y);
            teller += 62;
        }
    }

    protected void verticalWalls(int x, int y, int amount) {
        int teller = 0;
        for (int i = 0; i < amount; i++) {
            addObject(new GreenVerticalWall(), x, y + teller);
            teller += 62;
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        GreenWall greenWall = new GreenWall();
        addObject(greenWall, 650, 386);
        GreenVerticalWall greenVerticalWall = new GreenVerticalWall();
        addObject(greenVerticalWall, 697, 339);
        GreenVerticalWall greenVerticalWall2 = new GreenVerticalWall();
        addObject(greenVerticalWall2, 603, 339);
        GreenWall greenWall2 = new GreenWall();
        addObject(greenWall2, 650, 197);
        GreenVerticalWall greenVerticalWall3 = new GreenVerticalWall();
        addObject(greenVerticalWall3, 697, 150);
        GreenVerticalWall greenVerticalWall4 = new GreenVerticalWall();
        addObject(greenVerticalWall4, 603, 150);
        Door door = new Door();
        addObject(door, 650, 292);
        Door door2 = new Door();
        addObject(door2, 650, 103);
        BlueRupee blueRupee = new BlueRupee();
        addObject(blueRupee, 649, 150);
        BlueRupee blueRupee2 = new BlueRupee();
        addObject(blueRupee2, 1193, 100);
        BlueRupee blueRupee3 = new BlueRupee();
        addObject(blueRupee3, 106, 100);
        GreenRupee greenRupee = new GreenRupee();
        addObject(greenRupee, 650, 419);
        GreenRupee greenRupee2 = new GreenRupee();
        addObject(greenRupee2, 650, 238);
        GreenRupee greenRupee3 = new GreenRupee();
        addObject(greenRupee3, 292, 289);
        GreenRupee greenRupee4 = new GreenRupee();
        addObject(greenRupee4, 1007, 291);
        GreenRupee greenRupee5 = new GreenRupee();
        addObject(greenRupee5, 740, 340);
        GreenRupee greenRupee6 = new GreenRupee();
        addObject(greenRupee6, 560, 340);
        BlueRupee blueRupee4 = new BlueRupee();
        addObject(blueRupee4, 1192, 574);
        BlueRupee blueRupee5 = new BlueRupee();
        addObject(blueRupee5, 104, 576);
        BlueRupee blueRupee6 = new BlueRupee();
        addObject(blueRupee6, 972, 329);
        BlueRupee blueRupee7 = new BlueRupee();
        addObject(blueRupee7, 324, 327);
        DungeonStairsFloor4 dungeonStairsFloor4 = new DungeonStairsFloor4();
        addObject(dungeonStairsFloor4, 650, 667);
        BlueRupee blueRupee8 = new BlueRupee();
        addObject(blueRupee8, 698, 389);
        BlueRupee blueRupee9 = new BlueRupee();
        addObject(blueRupee9, 602, 388);
        StrafingBomb strafingBomb = new StrafingBomb();
        addObject(strafingBomb, 325, 469);
        StrafingBomb strafingBomb2 = new StrafingBomb();
        addObject(strafingBomb2, 138, 376);
        StrafingBomb strafingBomb3 = new StrafingBomb();
        addObject(strafingBomb3, 1040, 375);
        StrafingBomb strafingBomb4 = new StrafingBomb();
        addObject(strafingBomb4, 1224, 395);
        StrafingBomb strafingBomb5 = new StrafingBomb();
        addObject(strafingBomb5, 46, 396);
        StrafingBomb strafingBomb6 = new StrafingBomb();
        addObject(strafingBomb6, 19, 18);
        StrafingBomb strafingBomb7 = new StrafingBomb();
        addObject(strafingBomb7, 1283, 64);
        greenRupee2.setLocation(649, 243);
        StrafingBomb strafingBomb8 = new StrafingBomb();
        addObject(strafingBomb8, 735, 148);
        StrafingBomb strafingBomb9 = new StrafingBomb();
        addObject(strafingBomb9, 560, 148);
        StrafingBomb strafingBomb10 = new StrafingBomb();
        addObject(strafingBomb10, 688, 239);
        StrafingBomb strafingBomb11 = new StrafingBomb();
        addObject(strafingBomb11, 604, 238);
        StrafingBomb strafingBomb12 = new StrafingBomb();
        addObject(strafingBomb12, 968, 466);
        StrafingBomb strafingBomb13 = new StrafingBomb();
        addObject(strafingBomb13, 572, 609);
        StrafingBomb strafingBomb14 = new StrafingBomb();
        addObject(strafingBomb14, 724, 608);
    }
}
