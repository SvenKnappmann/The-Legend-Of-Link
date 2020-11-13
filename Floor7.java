import greenfoot.*;

public class Floor7 extends World {
    public static GreenfootSound sound; 
    public static boolean worldBoolean;
    public Floor7() {    
        super(1300, 700, 1); 
        this.worldBoolean = true;
        walls(0,0,22);
        verticalWalls(0,0,12);
        walls(0,700,22);
        verticalWalls(1300,0,12);
        sound = new GreenfootSound("Undertale OST 100 - Megalovania.mp3");
        sound.playLoop();
        terraForming();
        prepare();
    }
    protected void terraForming() {
        int tellerWall = 0;
        int tellerVWall = 0;

        addObject(new Link(), 650, 600);
        addObject(new Mr_Bones_FinalForm(), 650, 350);

        setPaintOrder(
            Mr_Bones_FinalForm.class,
            Link.class,
            Mr_Bones.class,
            RollingBomb.class,
            BlackWall.class,
            BlackVerticalWall.class,
            DungeonStairsFloor4.class,
            GreenRupee.class,
            Door.class
        );
    }

    protected void walls(int x, int y, int amount) {
        int teller = 0;
        for (int i = 0; i < amount; i++) {
            addObject(new BlackWall(), x + teller, y);
            teller += 63;
        }
    }

    protected void verticalWalls(int x, int y, int amount) {
        int teller = 0;
        for (int i = 0; i < amount; i++) {
            addObject(new BlackVerticalWall(), x, y + teller);
            teller += 63;
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //        RollingBomb rollingBomb = new RollingBomb();
        //        addObject(rollingBomb,1188,92);
        //        RollingBomb rollingBomb2 = new RollingBomb();
        //        addObject(rollingBomb2,182,79);
        //        RollingBomb rollingBomb3 = new RollingBomb();
        //        addObject(rollingBomb3,186,319);
        //        RollingBomb rollingBomb4 = new RollingBomb();
        //        addObject(rollingBomb4,170,498);
        //        RollingBomb rollingBomb5 = new RollingBomb();
        //        addObject(rollingBomb5,98,523);
        //        RollingBomb rollingBomb6 = new RollingBomb();
        //        addObject(rollingBomb6,68,447);
        //        RollingBomb rollingBomb7 = new RollingBomb();
        //        addObject(rollingBomb7,405,140);
        //        RollingBomb rollingBomb8 = new RollingBomb();
        //        addObject(rollingBomb8,283,184);
        //        RollingBomb rollingBomb9 = new RollingBomb();
        //        addObject(rollingBomb9,943,99);
        //        RollingBomb rollingBomb10 = new RollingBomb();
        //        addObject(rollingBomb10,807,61);
        //        RollingBomb rollingBomb11 = new RollingBomb();
        //        addObject(rollingBomb11,635,52);
        //        RollingBomb rollingBomb12 = new RollingBomb();
        //        addObject(rollingBomb12,1038,632);
        //        RollingBomb rollingBomb13 = new RollingBomb();
        //        addObject(rollingBomb13,1131,540);
        //        RollingBomb rollingBomb14 = new RollingBomb();
        //        addObject(rollingBomb14,1160,511);
        //        RollingBomb rollingBomb15 = new RollingBomb();
        //        addObject(rollingBomb15,1153,443);
        //        RollingBomb rollingBomb16 = new RollingBomb();
        //        addObject(rollingBomb16,1133,303);
        //        RollingBomb rollingBomb17 = new RollingBomb();
        //        addObject(rollingBomb17,1096,204);
        //        RollingBomb rollingBomb18 = new RollingBomb();
        //        addObject(rollingBomb18,1091,394);
        //        RollingBomb rollingBomb19 = new RollingBomb();
        //        addObject(rollingBomb19,878,129);
        //        RollingBomb rollingBomb20 = new RollingBomb();
        //        addObject(rollingBomb20,856,117);
        //        RollingBomb rollingBomb21 = new RollingBomb();
        //        addObject(rollingBomb21,880,224);
        //        RollingBomb rollingBomb22 = new RollingBomb();
        //        addObject(rollingBomb22,932,360);
        //        RollingBomb rollingBomb23 = new RollingBomb();
        //        addObject(rollingBomb23,998,527);
        //        RollingBomb rollingBomb24 = new RollingBomb();
        //        addObject(rollingBomb24,298,499);
        //        RollingBomb rollingBomb25 = new RollingBomb();
        //        addObject(rollingBomb25,500,539);
        //        RollingBomb rollingBomb26 = new RollingBomb();
        //        addObject(rollingBomb26,848,576);
        //        RollingBomb rollingBomb27 = new RollingBomb();
        //        addObject(rollingBomb27,873,571);
        //        RollingBomb rollingBomb28 = new RollingBomb();
        //        addObject(rollingBomb28,822,550);
        //        RollingBomb rollingBomb29 = new RollingBomb();
        //        addObject(rollingBomb29,832,513);
        //        RollingBomb rollingBomb30 = new RollingBomb();
        //        addObject(rollingBomb30,1036,497);
        //        RollingBomb rollingBomb31 = new RollingBomb();
        //        addObject(rollingBomb31,275,569);
        //        RollingBomb rollingBomb32 = new RollingBomb();
        //        addObject(rollingBomb32,272,568);
        //        RollingBomb rollingBomb33 = new RollingBomb();
        //        addObject(rollingBomb33,371,540);
        //        RollingBomb rollingBomb34 = new RollingBomb();
        //        addObject(rollingBomb34,324,445);
        //        RollingBomb rollingBomb35 = new RollingBomb();
        //        addObject(rollingBomb35,370,431);
        //        RollingBomb rollingBomb36 = new RollingBomb();
        //        addObject(rollingBomb36,364,421);
        //        RollingBomb rollingBomb37 = new RollingBomb();
        //        addObject(rollingBomb37,331,371);
        //        RollingBomb rollingBomb38 = new RollingBomb();
        //        addObject(rollingBomb38,260,394);
        //        RollingBomb rollingBomb39 = new RollingBomb();
        //        addObject(rollingBomb39,271,441);
        //        RollingBomb rollingBomb40 = new RollingBomb();
        //        addObject(rollingBomb40,323,351);
        //        RollingBomb rollingBomb41 = new RollingBomb();
        //        addObject(rollingBomb41,297,373);
        //        RollingBomb rollingBomb42 = new RollingBomb();
        //        addObject(rollingBomb42,298,408);
        //        RollingBomb rollingBomb43 = new RollingBomb();
        //        addObject(rollingBomb43,324,508);
        //        RollingBomb rollingBomb44 = new RollingBomb();
        //        addObject(rollingBomb44,348,643);
        //        RollingBomb rollingBomb45 = new RollingBomb();
        //        addObject(rollingBomb45,198,435);
        //        RollingBomb rollingBomb46 = new RollingBomb();
        //        addObject(rollingBomb46,107,263);
        //        RollingBomb rollingBomb47 = new RollingBomb();
        //        addObject(rollingBomb47,144,124);
        //        RollingBomb rollingBomb48 = new RollingBomb();
        //        addObject(rollingBomb48,310,108);
        //        RollingBomb rollingBomb49 = new RollingBomb();
        //        addObject(rollingBomb49,430,55);
        //        RollingBomb rollingBomb50 = new RollingBomb();
        //        addObject(rollingBomb50,332,47);
        //        RollingBomb rollingBomb51 = new RollingBomb();
        //        addObject(rollingBomb51,192,141);
        //        RollingBomb rollingBomb52 = new RollingBomb();
        //        addObject(rollingBomb52,94,402);
        //        RollingBomb rollingBomb53 = new RollingBomb();
        //        addObject(rollingBomb53,136,608);
        //        RollingBomb rollingBomb54 = new RollingBomb();
        //        addObject(rollingBomb54,191,553);
        //        RollingBomb rollingBomb55 = new RollingBomb();
        //        addObject(rollingBomb55,236,335);
        //        RollingBomb rollingBomb56 = new RollingBomb();
        //        addObject(rollingBomb56,468,164);
        //        RollingBomb rollingBomb57 = new RollingBomb();
        //        addObject(rollingBomb57,588,112);
        //        RollingBomb rollingBomb58 = new RollingBomb();
        //        addObject(rollingBomb58,770,188);
        //        RollingBomb rollingBomb59 = new RollingBomb();
        //        addObject(rollingBomb59,630,328);
        //        RollingBomb rollingBomb60 = new RollingBomb();
        //        addObject(rollingBomb60,392,320);
        //        RollingBomb rollingBomb61 = new RollingBomb();
        //        addObject(rollingBomb61,372,276);
        //        RollingBomb rollingBomb62 = new RollingBomb();
        //        addObject(rollingBomb62,448,260);
        //        RollingBomb rollingBomb63 = new RollingBomb();
        //        addObject(rollingBomb63,463,328);
        //        RollingBomb rollingBomb64 = new RollingBomb();
        //        addObject(rollingBomb64,548,232);
        //        RollingBomb rollingBomb65 = new RollingBomb();
        //        addObject(rollingBomb65,510,370);
        //        RollingBomb rollingBomb66 = new RollingBomb();
        //        addObject(rollingBomb66,736,307);
        //        RollingBomb rollingBomb67 = new RollingBomb();
        //        addObject(rollingBomb67,743,470);
        //        RollingBomb rollingBomb68 = new RollingBomb();
        //        addObject(rollingBomb68,792,316);
        //        RollingBomb rollingBomb69 = new RollingBomb();
        //        addObject(rollingBomb69,804,419);
        //        RollingBomb rollingBomb70 = new RollingBomb();
        //        addObject(rollingBomb70,852,304);
        //        RollingBomb rollingBomb71 = new RollingBomb();
        //        addObject(rollingBomb71,926,374);
        //        RollingBomb rollingBomb72 = new RollingBomb();
        //        addObject(rollingBomb72,944,256);
        //        RollingBomb rollingBomb73 = new RollingBomb();
        //        addObject(rollingBomb73,980,362);
        //        RollingBomb rollingBomb74 = new RollingBomb();
        //        addObject(rollingBomb74,925,458);
        //        RollingBomb rollingBomb75 = new RollingBomb();
        //        addObject(rollingBomb75,894,486);
        //        RollingBomb rollingBomb76 = new RollingBomb();
        //        addObject(rollingBomb76,885,378);
        //        RollingBomb rollingBomb77 = new RollingBomb();
        //        addObject(rollingBomb77,849,335);
        //        RollingBomb rollingBomb78 = new RollingBomb();
        //        addObject(rollingBomb78,809,243);
        //        RollingBomb rollingBomb79 = new RollingBomb();
        //        addObject(rollingBomb79,670,168);
        //        RollingBomb rollingBomb80 = new RollingBomb();
        //        addObject(rollingBomb80,581,172);
        //        RollingBomb rollingBomb81 = new RollingBomb();
        //        addObject(rollingBomb81,516,170);
        //        RollingBomb rollingBomb82 = new RollingBomb();
        //        addObject(rollingBomb82,477,118);
        //        RollingBomb rollingBomb83 = new RollingBomb();
        //        addObject(rollingBomb83,362,164);
        //        RollingBomb rollingBomb84 = new RollingBomb();
        //        addObject(rollingBomb84,254,253);
        //        RollingBomb rollingBomb85 = new RollingBomb();
        //        addObject(rollingBomb85,186,216);
        //        RollingBomb rollingBomb86 = new RollingBomb();
        //        addObject(rollingBomb86,100,154);
        //        RollingBomb rollingBomb87 = new RollingBomb();
        //        addObject(rollingBomb87,82,228);
        //        RollingBomb rollingBomb88 = new RollingBomb();
        //        addObject(rollingBomb88,80,333);
        //        RollingBomb rollingBomb89 = new RollingBomb();
        //        addObject(rollingBomb89,152,357);
        //        RollingBomb rollingBomb90 = new RollingBomb();
        //        addObject(rollingBomb90,219,610);
        //        RollingBomb rollingBomb91 = new RollingBomb();
        //        addObject(rollingBomb91,522,649);
        //        RollingBomb rollingBomb92 = new RollingBomb();
        //        addObject(rollingBomb92,456,594);
        //        RollingBomb rollingBomb93 = new RollingBomb();
        //        addObject(rollingBomb93,446,464);
        //        RollingBomb rollingBomb94 = new RollingBomb();
        //        addObject(rollingBomb94,636,504);
        //        RollingBomb rollingBomb95 = new RollingBomb();
        //        addObject(rollingBomb95,729,537);
        //        RollingBomb rollingBomb96 = new RollingBomb();
        //        addObject(rollingBomb96,766,618);
        //        RollingBomb rollingBomb97 = new RollingBomb();
        //        addObject(rollingBomb97,878,620);
        //        RollingBomb rollingBomb98 = new RollingBomb();
        //        addObject(rollingBomb98,927,563);
        //        RollingBomb rollingBomb99 = new RollingBomb();
        //        addObject(rollingBomb99,988,623);
        //        RollingBomb rollingBomb100 = new RollingBomb();
        //        addObject(rollingBomb100,1075,583);
        //        RollingBomb rollingBomb101 = new RollingBomb();
        //        addObject(rollingBomb101,1124,636);
        //        RollingBomb rollingBomb102 = new RollingBomb();
        //        addObject(rollingBomb102,1171,628);
        //        RollingBomb rollingBomb103 = new RollingBomb();
        //        addObject(rollingBomb103,1226,608);
        //        RollingBomb rollingBomb104 = new RollingBomb();
        //        addObject(rollingBomb104,1249,547);
        //        RollingBomb rollingBomb105 = new RollingBomb();
        //        addObject(rollingBomb105,1248,524);
        //        RollingBomb rollingBomb106 = new RollingBomb();
        //        addObject(rollingBomb106,1245,478);
        //        RollingBomb rollingBomb107 = new RollingBomb();
        //        addObject(rollingBomb107,1256,355);
        //        RollingBomb rollingBomb108 = new RollingBomb();
        //        addObject(rollingBomb108,1250,415);
        //        RollingBomb rollingBomb109 = new RollingBomb();
        //        addObject(rollingBomb109,1256,262);
        //        RollingBomb rollingBomb110 = new RollingBomb();
        //        addObject(rollingBomb110,1245,163);
        //        RollingBomb rollingBomb111 = new RollingBomb();
        //        addObject(rollingBomb111,1248,199);
        //        RollingBomb rollingBomb112 = new RollingBomb();
        //        addObject(rollingBomb112,1250,230);
        //        RollingBomb rollingBomb113 = new RollingBomb();
        //        addObject(rollingBomb113,1252,64);
        //        RollingBomb rollingBomb114 = new RollingBomb();
        //        addObject(rollingBomb114,1248,134);
        //        RollingBomb rollingBomb115 = new RollingBomb();
        //        addObject(rollingBomb115,1252,304);
        //        RollingBomb rollingBomb116 = new RollingBomb();
        //        addObject(rollingBomb116,1260,654);
        //        RollingBomb rollingBomb117 = new RollingBomb();
        //        addObject(rollingBomb117,1078,170);
        //        RollingBomb rollingBomb118 = new RollingBomb();
        //        addObject(rollingBomb118,1052,70);
        //        RollingBomb rollingBomb119 = new RollingBomb();
        //        addObject(rollingBomb119,993,149);
        //        RollingBomb rollingBomb120 = new RollingBomb();
        //        addObject(rollingBomb120,920,189);
        //        RollingBomb rollingBomb121 = new RollingBomb();
        //        addObject(rollingBomb121,1012,205);
        //        RollingBomb rollingBomb122 = new RollingBomb();
        //        addObject(rollingBomb122,1072,110);
        //        RollingBomb rollingBomb123 = new RollingBomb();
        //        addObject(rollingBomb123,1148,129);
        //        RollingBomb rollingBomb124 = new RollingBomb();
        //        addObject(rollingBomb124,1174,270);
        //        RollingBomb rollingBomb125 = new RollingBomb();
        //        addObject(rollingBomb125,1176,188);
        //        RollingBomb rollingBomb126 = new RollingBomb();
        //        addObject(rollingBomb126,1073,293);
        //        RollingBomb rollingBomb127 = new RollingBomb();
        //        addObject(rollingBomb127,1010,235);
        //        RollingBomb rollingBomb128 = new RollingBomb();
        //        addObject(rollingBomb128,716,90);
        GhostWall ghostWall = new GhostWall();
        addObject(ghostWall,715,480);
        GhostWall ghostWall2 = new GhostWall();
        addObject(ghostWall2,778,480);
        GhostWall ghostWall3 = new GhostWall();
        addObject(ghostWall3,840,480);
        GhostWall ghostWall4 = new GhostWall();
        addObject(ghostWall4,654,480);
        GhostWall ghostWall5 = new GhostWall();
        addObject(ghostWall5,596,480);
        GhostWall ghostWall6 = new GhostWall();
        addObject(ghostWall6,538,480);
        GhostWall ghostWall7 = new GhostWall();
        addObject(ghostWall7,489,480);
        GhostVerticalWall ghostVerticalWall = new GhostVerticalWall();
        addObject(ghostVerticalWall,474,433);
        GhostVerticalWall ghostVerticalWall2 = new GhostVerticalWall();
        addObject(ghostVerticalWall2,474,372);
        GhostVerticalWall ghostVerticalWall3 = new GhostVerticalWall();
        addObject(ghostVerticalWall3,474,311);
        GhostVerticalWall ghostVerticalWall4 = new GhostVerticalWall();
        addObject(ghostVerticalWall4,474,251);
        GhostWall ghostWall8 = new GhostWall();
        addObject(ghostWall8,652,213);
        GhostWall ghostWall9 = new GhostWall();
        addObject(ghostWall9,596,213);
        GhostWall ghostWall10 = new GhostWall();
        addObject(ghostWall10,544,213);
        GhostWall ghostWall11 = new GhostWall();
        addObject(ghostWall11,490,213);
        GhostWall ghostWall12 = new GhostWall();
        addObject(ghostWall12,712,213);
        GhostWall ghostWall13 = new GhostWall();
        addObject(ghostWall13,772,213);
        GhostWall ghostWall14 = new GhostWall();
        addObject(ghostWall14,810,213);
        GhostWall ghostWall15 = new GhostWall();
        addObject(ghostWall15,840,213);
        GhostVerticalWall ghostVerticalWall5 = new GhostVerticalWall();
        addObject(ghostVerticalWall5,855,229);
        GhostVerticalWall ghostVerticalWall6 = new GhostVerticalWall();
        addObject(ghostVerticalWall6,855,283);
        GhostVerticalWall ghostVerticalWall7 = new GhostVerticalWall();
        addObject(ghostVerticalWall7,855,343);
        GhostVerticalWall ghostVerticalWall8 = new GhostVerticalWall();
        addObject(ghostVerticalWall8,855,403);
        GhostVerticalWall ghostVerticalWall9 = new GhostVerticalWall();
        addObject(ghostVerticalWall9,855,465);
    }
}
