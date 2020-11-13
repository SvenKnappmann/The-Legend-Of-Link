import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Floor2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Floor2 extends World {
    public static int counter;
    public static GreenfootSound sound;
    public static boolean worldBoolean;

    /**
     * Constructor for objects of class Floor2.
     */
    public Floor2() {
        super(1300, 700, 1);
        this.counter = 19;
        this.worldBoolean = true;
        terraForming();
        sound = new GreenfootSound("The Legend of Zelda Music - Dungeon Theme.mp3");
        sound.playLoop();
        prepare();
    }

    protected void terraForming() {
        int tellerWall = 0;
        int tellerVWall = 0;

        addObject(new Link(), 20, 600);
        addObject(new Mr_Bones(), 1200, 600);

        setPaintOrder(
                Mr_Bones_FinalForm.class,
                Link.class,
                Mr_Bones.class,
                RollingBomb.class,
                RedWall.class,
                RedVerticalWall.class,
                DungeonStairsFloor1.class,
                DungeonStairsFloor2.class,
                GreenRupee.class,
                Door.class
        );
    }

    public void stopped() {
        sound.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        RedVerticalWall redVerticalWall = new RedVerticalWall();
        addObject(redVerticalWall, 107, 674);
        RedWall redWall = new RedWall();
        addObject(redWall, 82, 638);
        RedVerticalWall redVerticalWall2 = new RedVerticalWall();
        addObject(redVerticalWall2, 67, 592);
        RedWall redWall2 = new RedWall();
        addObject(redWall2, 99, 560);
        RedWall redWall3 = new RedWall();
        addObject(redWall3, 100, 471);
        RedVerticalWall redVerticalWall3 = new RedVerticalWall();
        addObject(redVerticalWall3, 64, 437);
        RedVerticalWall redVerticalWall4 = new RedVerticalWall();
        addObject(redVerticalWall4, 64, 376);
        RedWall redWall4 = new RedWall();
        addObject(redWall4, 160, 471);
        RedVerticalWall redVerticalWall5 = new RedVerticalWall();
        addObject(redVerticalWall5, 194, 443);
        RedVerticalWall redVerticalWall6 = new RedVerticalWall();
        addObject(redVerticalWall6, 194, 383);
        Door door = new Door();
        addObject(door, 28, 551);
        RedWall redWall5 = new RedWall();
        addObject(redWall5, 239, 414);
        RedWall redWall6 = new RedWall();
        addObject(redWall6, 302, 414);
        RedWall redWall7 = new RedWall();
        addObject(redWall7, 364, 415);
        RedWall redWall8 = new RedWall();
        addObject(redWall8, 416, 396);
        RedWall redWall9 = new RedWall();
        addObject(redWall9, 472, 378);
        RedWall redWall10 = new RedWall();
        addObject(redWall10, 527, 361);
        RedWall redWall11 = new RedWall();
        addObject(redWall11, 580, 340);
        RedVerticalWall redVerticalWall7 = new RedVerticalWall();
        addObject(redVerticalWall7, 610, 305);
        RedVerticalWall redVerticalWall8 = new RedVerticalWall();
        addObject(redVerticalWall8, 611, 245);
        RedVerticalWall redVerticalWall9 = new RedVerticalWall();
        addObject(redVerticalWall9, 611, 184);
        RedVerticalWall redVerticalWall10 = new RedVerticalWall();
        addObject(redVerticalWall10, 611, 124);
        RedWall redWall12 = new RedWall();
        addObject(redWall12, 28, 339);
        DungeonStairsFloor3 dungeonStairsFloor3 = new DungeonStairsFloor3();
        addObject(dungeonStairsFloor3, 130, 422);
        Door door2 = new Door();
        addObject(door2, 163, 560);
        RedVerticalWall redVerticalWall11 = new RedVerticalWall();
        addObject(redVerticalWall11, 211, 545);
        RedWall redWall13 = new RedWall();
        addObject(redWall13, 259, 530);
        RedWall redWall14 = new RedWall();
        addObject(redWall14, 312, 509);
        RedWall redWall15 = new RedWall();
        addObject(redWall15, 363, 491);
        RedWall redWall16 = new RedWall();
        addObject(redWall16, 423, 491);
        RedWall redWall17 = new RedWall();
        addObject(redWall17, 473, 475);
        RedVerticalWall redVerticalWall12 = new RedVerticalWall();
        addObject(redVerticalWall12, 505, 505);
        RedVerticalWall redVerticalWall13 = new RedVerticalWall();
        addObject(redVerticalWall13, 505, 568);
        RedWall redWall18 = new RedWall();
        addObject(redWall18, 520, 642);
        RedWall redWall19 = new RedWall();
        addObject(redWall19, 580, 642);
        RedVerticalWall redVerticalWall14 = new RedVerticalWall();
        addObject(redVerticalWall14, 505, 596);
        RedWall redWall20 = new RedWall();
        addObject(redWall20, 631, 642);
        RedVerticalWall redVerticalWall15 = new RedVerticalWall();
        addObject(redVerticalWall15, 677, 627);
        RedVerticalWall redVerticalWall16 = new RedVerticalWall();
        addObject(redVerticalWall16, 708, 587);
        RedVerticalWall redVerticalWall17 = new RedVerticalWall();
        addObject(redVerticalWall17, 738, 550);
        RedVerticalWall redVerticalWall18 = new RedVerticalWall();
        addObject(redVerticalWall18, 768, 514);
        RedVerticalWall redVerticalWall19 = new RedVerticalWall();
        addObject(redVerticalWall19, 798, 478);
        RedVerticalWall redVerticalWall20 = new RedVerticalWall();
        addObject(redVerticalWall20, 831, 443);
        RedVerticalWall redVerticalWall21 = new RedVerticalWall();
        addObject(redVerticalWall21, 864, 443);
        RedVerticalWall redVerticalWall22 = new RedVerticalWall();
        addObject(redVerticalWall22, 896, 443);
        RedVerticalWall redVerticalWall23 = new RedVerticalWall();
        addObject(redVerticalWall23, 927, 443);
        RedVerticalWall redVerticalWall24 = new RedVerticalWall();
        addObject(redVerticalWall24, 957, 443);
        Door door3 = new Door();
        addObject(door3, 1005, 459);
        RedVerticalWall redVerticalWall25 = new RedVerticalWall();
        addObject(redVerticalWall25, 1053, 444);
        RedVerticalWall redVerticalWall26 = new RedVerticalWall();
        addObject(redVerticalWall26, 1084, 444);
        RedVerticalWall redVerticalWall27 = new RedVerticalWall();
        addObject(redVerticalWall27, 1115, 444);
        RedVerticalWall redVerticalWall28 = new RedVerticalWall();
        addObject(redVerticalWall28, 1146, 444);
        RedVerticalWall redVerticalWall29 = new RedVerticalWall();
        addObject(redVerticalWall29, 1178, 444);
        RedVerticalWall redVerticalWall30 = new RedVerticalWall();
        addObject(redVerticalWall30, 1208, 444);
        RedVerticalWall redVerticalWall31 = new RedVerticalWall();
        addObject(redVerticalWall31, 1238, 444);
        RedVerticalWall redVerticalWall32 = new RedVerticalWall();
        addObject(redVerticalWall32, 1266, 444);
        RedVerticalWall redVerticalWall33 = new RedVerticalWall();
        addObject(redVerticalWall33, 1296, 444);
        RedWall redWall21 = new RedWall();
        addObject(redWall21, 640, 340);
        Door door4 = new Door();
        addObject(door4, 704, 341);
        RedVerticalWall redVerticalWall34 = new RedVerticalWall();
        addObject(redVerticalWall34, 752, 325);
        RedWall redWall22 = new RedWall();
        addObject(redWall22, 767, 281);
        RedWall redWall23 = new RedWall();
        addObject(redWall23, 828, 281);
        RedWall redWall24 = new RedWall();
        addObject(redWall24, 889, 281);
        RedVerticalWall redVerticalWall35 = new RedVerticalWall();
        addObject(redVerticalWall35, 936, 267);
        RedVerticalWall redVerticalWall36 = new RedVerticalWall();
        addObject(redVerticalWall36, 936, 209);
        RedVerticalWall redVerticalWall37 = new RedVerticalWall();
        addObject(redVerticalWall37, 936, 148);
        RedWall redWall25 = new RedWall();
        addObject(redWall25, 982, 148);
        RedWall redWall26 = new RedWall();
        addObject(redWall26, 1042, 148);
        RedWall redWall27 = new RedWall();
        addObject(redWall27, 1103, 148);
        RedWall redWall28 = new RedWall();
        addObject(redWall28, 1164, 148);
        RedWall redWall29 = new RedWall();
        addObject(redWall29, 1225, 148);
        RedWall redWall30 = new RedWall();
        addObject(redWall30, 1286, 148);
        RedWall redWall31 = new RedWall();
        addObject(redWall31, 657, 200);
        RedWall redWall32 = new RedWall();
        addObject(redWall32, 718, 200);
        RedWall redWall33 = new RedWall();
        addObject(redWall33, 778, 200);
        Door door5 = new Door();
        addObject(door5, 841, 200);
        RedWall redWall34 = new RedWall();
        addObject(redWall34, 905, 200);
        RedVerticalWall redVerticalWall38 = new RedVerticalWall();
        addObject(redVerticalWall38, 831, 382);
        RedVerticalWall redVerticalWall39 = new RedVerticalWall();
        addObject(redVerticalWall39, 831, 322);
        RollingBomb rollingBomb = new RollingBomb();
        addObject(rollingBomb, 1264, 377);
        RollingBomb rollingBomb2 = new RollingBomb();
        addObject(rollingBomb2, 1262, 320);
        RollingBomb rollingBomb3 = new RollingBomb();
        addObject(rollingBomb3, 1257, 261);
        RedWall redWall35 = new RedWall();
        addObject(redWall35, 564, 109);
        RedVerticalWall redVerticalWall40 = new RedVerticalWall();
        addObject(redVerticalWall40, 528, 140);
        RedWall redWall36 = new RedWall();
        addObject(redWall36, 514, 185);
        RedWall redWall37 = new RedWall();
        addObject(redWall37, 463, 185);
        RedVerticalWall redVerticalWall41 = new RedVerticalWall();
        addObject(redVerticalWall41, 492, 227);
        RedVerticalWall redVerticalWall42 = new RedVerticalWall();
        addObject(redVerticalWall42, 491, 337);
        RedVerticalWall redVerticalWall43 = new RedVerticalWall();
        addObject(redVerticalWall43, 423, 281);
        RedVerticalWall redVerticalWall44 = new RedVerticalWall();
        addObject(redVerticalWall44, 527, 17);
        RedWall redWall38 = new RedWall();
        addObject(redWall38, 382, 279);
        RedWall redWall39 = new RedWall();
        addObject(redWall39, 321, 279);
        RedWall redWall40 = new RedWall();
        addObject(redWall40, 259, 247);
        RedWall redWall41 = new RedWall();
        addObject(redWall41, 259, 216);
        RedWall redWall42 = new RedWall();
        addObject(redWall42, 259, 185);
        RedWall redWall43 = new RedWall();
        addObject(redWall43, 259, 155);
        RedWall redWall44 = new RedWall();
        addObject(redWall44, 259, 124);
        RedWall redWall45 = new RedWall();
        addObject(redWall45, 320, 124);
        RedWall redWall46 = new RedWall();
        addObject(redWall46, 198, 216);
        RedWall redWall47 = new RedWall();
        addObject(redWall47, 138, 216);
        Door door6 = new Door();
        addObject(door6, 75, 216);
        RedWall redWall48 = new RedWall();
        addObject(redWall48, 11, 216);
        GreenRupee greenRupee = new GreenRupee();
        addObject(greenRupee, 567, 153);
        GreenRupee greenRupee2 = new GreenRupee();
        addObject(greenRupee2, 1272, 190);
        GreenRupee greenRupee3 = new GreenRupee();
        addObject(greenRupee3, 1228, 190);
        GreenRupee greenRupee4 = new GreenRupee();
        addObject(greenRupee4, 1185, 190);
        GreenRupee greenRupee5 = new GreenRupee();
        addObject(greenRupee5, 1148, 190);
        GreenRupee greenRupee6 = new GreenRupee();
        addObject(greenRupee6, 1110, 190);
        GreenRupee greenRupee7 = new GreenRupee();
        addObject(greenRupee7, 766, 564);
        GreenRupee greenRupee8 = new GreenRupee();
        addObject(greenRupee8, 1284, 495);
        GreenRupee greenRupee9 = new GreenRupee();
        addObject(greenRupee9, 470, 514);
        GreenRupee greenRupee10 = new GreenRupee();
        addObject(greenRupee10, 21, 382);
        StrafingBomb strafingBomb = new StrafingBomb();
        addObject(strafingBomb, 520, 438);
        StrafingBomb strafingBomb2 = new StrafingBomb();
        addObject(strafingBomb2, 524, 68);
        RedWall redWall49 = new RedWall();
        addObject(redWall49, 90, 339);
        RedVerticalWall redVerticalWall45 = new RedVerticalWall();
        addObject(redVerticalWall45, 124, 259);
        RedVerticalWall redVerticalWall46 = new RedVerticalWall();
        addObject(redVerticalWall46, 124, 303);
        GreenRupee greenRupee11 = new GreenRupee();
        addObject(greenRupee11, 15, 300);
        GreenRupee greenRupee12 = new GreenRupee();
        addObject(greenRupee12, 15, 252);
        GreenRupee greenRupee13 = new GreenRupee();
        addObject(greenRupee13, 45, 252);
        GreenRupee greenRupee14 = new GreenRupee();
        addObject(greenRupee14, 45, 300);
        RedWall redWall50 = new RedWall();
        addObject(redWall50, 461, 556);
        RedVerticalWall redVerticalWall47 = new RedVerticalWall();
        addObject(redVerticalWall47, 420, 571);
        RedWall redWall51 = new RedWall();
        addObject(redWall51, 385, 606);
        RedVerticalWall redVerticalWall48 = new RedVerticalWall();
        addObject(redVerticalWall48, 432, 632);
        GreenRupee greenRupee15 = new GreenRupee();
        addObject(greenRupee15, 469, 606);
        GreenRupee greenRupee16 = new GreenRupee();
        addObject(greenRupee16, 381, 569);
        GreenRupee greenRupee17 = new GreenRupee();
        addObject(greenRupee17, 104, 600);
        GreenRupee greenRupee18 = new GreenRupee();
        addObject(greenRupee18, 159, 255);
        GreenRupee greenRupee19 = new GreenRupee();
        addObject(greenRupee19, 307, 240);
    }
}
