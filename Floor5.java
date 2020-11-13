import greenfoot.*;

public class Floor5 extends World {
    public static int counter;
    public static GreenfootSound sound; 
    public static boolean worldBoolean;
    public Floor5() {    
        super(1300,700,1); 
        this.counter = 70;
        this.worldBoolean = true;
        terraForming();
        sound = new GreenfootSound("Undertale OST 031 - Waterfall.mp3");
        sound.playLoop();
        prepare();
    }

    protected void terraForming() {
        int tellerWall = 0;
        int tellerVWall = 0;

        addObject(new Link(), 650, 667);
        addObject(new Mr_Bones(), 650, 100);

        setPaintOrder(
            Mr_Bones_FinalForm.class,
            Link.class,
            Mr_Bones.class,
            RollingBomb.class,
            StrafingBomb.class,
            BlackWall.class,
            BlackVerticalWall.class,
            DungeonStairsFloor4.class,
            GreenRupee.class,
            Door.class
        );
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WhiteVerticalWall whiteVerticalWall = new WhiteVerticalWall();
        addObject(whiteVerticalWall,688,670);
        WhiteVerticalWall whiteVerticalWall2 = new WhiteVerticalWall();
        addObject(whiteVerticalWall2,606,670);

        WhiteWall whiteWall = new WhiteWall();
        addObject(whiteWall,733,646);

        WhiteVerticalWall whiteVerticalWall3 = new WhiteVerticalWall();
        addObject(whiteVerticalWall3,588,618);

        WhiteWall whiteWall2 = new WhiteWall();
        addObject(whiteWall2,547,652);

        WhiteVerticalWall whiteVerticalWall4 = new WhiteVerticalWall();
        addObject(whiteVerticalWall4,510,628);
        WhiteVerticalWall whiteVerticalWall5 = new WhiteVerticalWall();
        addObject(whiteVerticalWall5,731,611);

        WhiteWall whiteWall3 = new WhiteWall();
        addObject(whiteWall3,770,576);
        WhiteWall whiteWall4 = new WhiteWall();
        addObject(whiteWall4,792,646);
        WhiteWall whiteWall5 = new WhiteWall();
        addObject(whiteWall5,770,546);
        WhiteWall whiteWall6 = new WhiteWall();
        addObject(whiteWall6,770,515);
        WhiteWall whiteWall7 = new WhiteWall();
        addObject(whiteWall7,770,484);
        WhiteWall whiteWall8 = new WhiteWall();
        addObject(whiteWall8,830,532);
        WhiteWall whiteWall9 = new WhiteWall();
        addObject(whiteWall9,892,532);
        WhiteWall whiteWall10 = new WhiteWall();
        addObject(whiteWall10,953,532);
        WhiteWall whiteWall11 = new WhiteWall();
        addObject(whiteWall11,1015,532);

        GhostVerticalWall ghostVerticalWall = new GhostVerticalWall();
        addObject(ghostVerticalWall,840,661);
        GhostVerticalWall ghostVerticalWall2 = new GhostVerticalWall();
        addObject(ghostVerticalWall2,840,604);

        BlueRupee blueRupee = new BlueRupee();
        addObject(blueRupee,771,612);

        GreenRupee greenRupee = new GreenRupee();
        addObject(greenRupee,732,681);

        GhostVerticalWall ghostVerticalWall3 = new GhostVerticalWall();
        addObject(ghostVerticalWall3,956,576);
        GhostVerticalWall ghostVerticalWall4 = new GhostVerticalWall();
        addObject(ghostVerticalWall4,956,631);
        WhiteVerticalWall whiteVerticalWall6 = new WhiteVerticalWall();
        addObject(whiteVerticalWall6,770,439);
        WhiteVerticalWall whiteVerticalWall7 = new WhiteVerticalWall();
        addObject(whiteVerticalWall7,770,379);

        WhiteWall whiteWall12 = new WhiteWall();
        addObject(whiteWall12,816,453);
        WhiteWall whiteWall13 = new WhiteWall();
        addObject(whiteWall13,878,453);

        GreenRupee greenRupee2 = new GreenRupee();
        addObject(greenRupee2,819,495);
        GreenRupee greenRupee3 = new GreenRupee();
        addObject(greenRupee3,759,682);

        WhiteVerticalWall whiteVerticalWall8 = new WhiteVerticalWall();
        addObject(whiteVerticalWall8,924,468);
        WhiteVerticalWall whiteVerticalWall9 = new WhiteVerticalWall();
        addObject(whiteVerticalWall9,1030,487);

        WhiteWall whiteWall14 = new WhiteWall();
        addObject(whiteWall14,1015,440);

        GreenRupee greenRupee4 = new GreenRupee();
        addObject(greenRupee4,990,487);

        WhiteVerticalWall whiteVerticalWall10 = new WhiteVerticalWall();
        addObject(whiteVerticalWall10,924,407);

        WhiteWall whiteWall15 = new WhiteWall();
        addObject(whiteWall15,909,367);
        WhiteWall whiteWall16 = new WhiteWall();
        addObject(whiteWall16,851,367);
        WhiteWall whiteWall17 = new WhiteWall();
        addObject(whiteWall17,828,367);

        GreenRupee greenRupee5 = new GreenRupee();
        addObject(greenRupee5,888,411);

        WhiteVerticalWall whiteVerticalWall11 = new WhiteVerticalWall();
        addObject(whiteVerticalWall11,588,637);

        GreenRupee greenRupee6 = new GreenRupee();
        addObject(greenRupee6,577,684);

        WhiteVerticalWall whiteVerticalWall12 = new WhiteVerticalWall();
        addObject(whiteVerticalWall12,870,320);
        WhiteVerticalWall whiteVerticalWall13 = new WhiteVerticalWall();
        addObject(whiteVerticalWall13,870,260);
        WhiteVerticalWall whiteVerticalWall14 = new WhiteVerticalWall();
        addObject(whiteVerticalWall14,870,200);
        GhostVerticalWall ghostVerticalWall8 = new GhostVerticalWall();
        addObject(ghostVerticalWall8,870,140);
        GhostVerticalWall ghostVerticalWall9 = new GhostVerticalWall();
        addObject(ghostVerticalWall9,870,80);

        GhostWall ghostWall = new GhostWall();
        addObject(ghostWall,1212,172);
        GhostWall ghostWall2 = new GhostWall();
        addObject(ghostWall2,1164,172);
        GhostWall ghostWall3 = new GhostWall();
        addObject(ghostWall3,1121,172);
        GhostWall ghostWall4 = new GhostWall();
        addObject(ghostWall4,1068,172);
        GhostWall ghostWall5 = new GhostWall();
        addObject(ghostWall5,1013,172);
        GhostWall ghostWall6 = new GhostWall();
        addObject(ghostWall6,960,172);

        WhiteVerticalWall whiteVerticalWall15 = new WhiteVerticalWall();
        addObject(whiteVerticalWall15,1227,126);
        WhiteVerticalWall whiteVerticalWall16 = new WhiteVerticalWall();
        addObject(whiteVerticalWall16,1227,72);
        WhiteVerticalWall whiteVerticalWall17 = new WhiteVerticalWall();
        addObject(whiteVerticalWall17,1144,32);
        WhiteVerticalWall whiteVerticalWall18 = new WhiteVerticalWall();
        addObject(whiteVerticalWall18,1144,90);

        WhiteWall whiteWall18 = new WhiteWall();
        addObject(whiteWall18,1099,105);

        WhiteVerticalWall whiteVerticalWall19 = new WhiteVerticalWall();
        addObject(whiteVerticalWall19,1052,90);

        WhiteWall whiteWall19 = new WhiteWall();
        addObject(whiteWall19,1037,44);

        GreenRupee greenRupee7 = new GreenRupee();
        addObject(greenRupee7,1097,67);

        BlueRupee blueRupee2 = new BlueRupee();
        addObject(blueRupee2,1269,136);
        BlueRupee blueRupee3 = new BlueRupee();
        addObject(blueRupee3,1264,674);

        StrafingBomb strafingBomb = new StrafingBomb();
        addObject(strafingBomb,1260,520);

        GhostWall ghostWall7 = new GhostWall();
        addObject(ghostWall7,971,367);
        GhostWall ghostWall8 = new GhostWall();
        addObject(ghostWall8,917,245);
        GhostWall ghostWall9 = new GhostWall();
        addObject(ghostWall9,980,245);
        GhostWall ghostWall10 = new GhostWall();
        addObject(ghostWall10,1041,245);
        GhostWall ghostWall11 = new GhostWall();
        addObject(ghostWall11,1076,471);
        GhostWall ghostWall12 = new GhostWall();
        addObject(ghostWall12,1140,471);
        GhostWall ghostWall13 = new GhostWall();
        addObject(ghostWall13,1110,471);
        GhostWall ghostWall14 = new GhostWall();
        addObject(ghostWall14,1172,471);
        GhostWall ghostWall15 = new GhostWall();
        addObject(ghostWall15,1229,471);
        GhostWall ghostWall16 = new GhostWall();
        addObject(ghostWall16,1244,471);

        StrafingBomb strafingBomb2 = new StrafingBomb();
        addObject(strafingBomb2,946,306);
        StrafingBomb strafingBomb3 = new StrafingBomb();
        addObject(strafingBomb3,1113,233);
        StrafingBomb strafingBomb4 = new StrafingBomb();
        addObject(strafingBomb4,948,88);

        WhiteVerticalWall whiteVerticalWall20 = new WhiteVerticalWall();
        addObject(whiteVerticalWall20,510,568);
        WhiteVerticalWall whiteVerticalWall21 = new WhiteVerticalWall();
        addObject(whiteVerticalWall21,510,508);
        WhiteVerticalWall whiteVerticalWall22 = new WhiteVerticalWall();
        addObject(whiteVerticalWall22,510,447);
        WhiteVerticalWall whiteVerticalWall23 = new WhiteVerticalWall();
        addObject(whiteVerticalWall23,510,386);
        WhiteVerticalWall whiteVerticalWall24 = new WhiteVerticalWall();
        addObject(whiteVerticalWall24,510,325);

        WhiteWall whiteWall20 = new WhiteWall();
        addObject(whiteWall20,464,583);

        WhiteVerticalWall whiteVerticalWall25 = new WhiteVerticalWall();
        addObject(whiteVerticalWall25,419,568);
        WhiteVerticalWall whiteVerticalWall26 = new WhiteVerticalWall();
        addObject(whiteVerticalWall26,419,507);
        WhiteVerticalWall whiteVerticalWall27 = new WhiteVerticalWall();
        addObject(whiteVerticalWall27,419,448);
        WhiteVerticalWall whiteVerticalWall28 = new WhiteVerticalWall();
        addObject(whiteVerticalWall28,419,390);
        WhiteVerticalWall whiteVerticalWall29 = new WhiteVerticalWall();
        addObject(whiteVerticalWall29,419,329);

        GhostWall ghostWall17 = new GhostWall();
        addObject(ghostWall17,374,583);

        WhiteVerticalWall whiteVerticalWall30 = new WhiteVerticalWall();
        addObject(whiteVerticalWall30,328,568);
        WhiteVerticalWall whiteVerticalWall31 = new WhiteVerticalWall();
        addObject(whiteVerticalWall31,236,568);
        WhiteVerticalWall whiteVerticalWall32 = new WhiteVerticalWall();
        addObject(whiteVerticalWall32,328,509);

        GhostWall ghostWall18 = new GhostWall();
        addObject(ghostWall18,192,583);

        WhiteVerticalWall whiteVerticalWall33 = new WhiteVerticalWall();
        addObject(whiteVerticalWall33,147,568);

        GhostWall ghostWall19 = new GhostWall();
        addObject(ghostWall19,103,583);

        WhiteVerticalWall whiteVerticalWall34 = new WhiteVerticalWall();
        addObject(whiteVerticalWall34,57,568);

        GhostWall ghostWall20 = new GhostWall();
        addObject(ghostWall20,11,583);

        Door door = new Door();
        addObject(door,374,583);
        Door door2 = new Door();
        addObject(door2,192,583);
        Door door3 = new Door();
        addObject(door3,103,583);
        Door door4 = new Door();
        addObject(door4,11,583);
        Door door5 = new Door();
        addObject(door5,282,583);

        WhiteVerticalWall whiteVerticalWall35 = new WhiteVerticalWall();
        addObject(whiteVerticalWall35,236,509);
        WhiteVerticalWall whiteVerticalWall36 = new WhiteVerticalWall();
        addObject(whiteVerticalWall36,147,509);
        WhiteVerticalWall whiteVerticalWall37 = new WhiteVerticalWall();
        addObject(whiteVerticalWall37,57,509);
        WhiteVerticalWall whiteVerticalWall38 = new WhiteVerticalWall();
        addObject(whiteVerticalWall38,328,402);
        WhiteVerticalWall whiteVerticalWall39 = new WhiteVerticalWall();
        addObject(whiteVerticalWall39,236,402);
        WhiteVerticalWall whiteVerticalWall40 = new WhiteVerticalWall();
        addObject(whiteVerticalWall40,147,402);
        WhiteVerticalWall whiteVerticalWall41 = new WhiteVerticalWall();
        addObject(whiteVerticalWall41,57,402);
        WhiteVerticalWall whiteVerticalWall42 = new WhiteVerticalWall();
        addObject(whiteVerticalWall42,328,303);
        WhiteVerticalWall whiteVerticalWall43 = new WhiteVerticalWall();
        addObject(whiteVerticalWall43,236,303);
        WhiteVerticalWall whiteVerticalWall44 = new WhiteVerticalWall();
        addObject(whiteVerticalWall44,147,303);
        WhiteVerticalWall whiteVerticalWall45 = new WhiteVerticalWall();
        addObject(whiteVerticalWall45,57,303);

        GhostWall ghostWall21 = new GhostWall();
        addObject(ghostWall21,374,417);
        GhostWall ghostWall22 = new GhostWall();
        addObject(ghostWall22,282,417);
        GhostWall ghostWall23 = new GhostWall();
        addObject(ghostWall23,192,417);
        GhostWall ghostWall24 = new GhostWall();
        addObject(ghostWall24,11,417);

        Door door6 = new Door();
        addObject(door6,374,417);
        Door door7 = new Door();
        addObject(door7,282,417);
        Door door8 = new Door();
        addObject(door8,192,417);
        Door door9 = new Door();
        addObject(door9,103,417);
        Door door10 = new Door();
        addObject(door10,11,417);

        GhostWall ghostWall25 = new GhostWall();
        addObject(ghostWall25,102,524);
        GhostWall ghostWall26 = new GhostWall();
        addObject(ghostWall26,374,524);
        GhostWall ghostWall27 = new GhostWall();
        addObject(ghostWall27,10,524);

        GhostWall ghostWall28 = new GhostWall();
        addObject(ghostWall28,375,318);
        GhostWall ghostWall29 = new GhostWall();
        addObject(ghostWall29,192,318);
        GhostWall ghostWall30 = new GhostWall();
        addObject(ghostWall30,103,318);
        GhostWall ghostWall31 = new GhostWall();
        addObject(ghostWall31,12,318);

        Door door11 = new Door();
        addObject(door11,374,318);
        Door door12 = new Door();
        addObject(door12,282,318);
        Door door13 = new Door();
        addObject(door13,192,318);
        Door door14 = new Door();
        addObject(door14,103,318);
        Door door15 = new Door();
        addObject(door15,12,318);
        WhiteVerticalWall whiteVerticalWall46 = new WhiteVerticalWall();
        addObject(whiteVerticalWall46,419,268);
        WhiteVerticalWall whiteVerticalWall47 = new WhiteVerticalWall();
        addObject(whiteVerticalWall47,419,209);

        WhiteWall whiteWall21 = new WhiteWall();
        addObject(whiteWall21,404,163);
        WhiteWall whiteWall22 = new WhiteWall();
        addObject(whiteWall22,344,163);
        WhiteWall whiteWall23 = new WhiteWall();
        addObject(whiteWall23,286,163);
        WhiteWall whiteWall24 = new WhiteWall();
        addObject(whiteWall24,224,163);
        WhiteWall whiteWall25 = new WhiteWall();
        addObject(whiteWall25,165,163);
        WhiteWall whiteWall26 = new WhiteWall();
        addObject(whiteWall26,104,163);
        GhostWall ghostWall32 = new GhostWall();
        addObject(ghostWall32,1270,245);

        WhiteVerticalWall whiteVerticalWall48 = new WhiteVerticalWall();
        addObject(whiteVerticalWall48,89,116);

        WhiteWall whiteWall27 = new WhiteWall();
        addObject(whiteWall27,104,71);
        WhiteWall whiteWall28 = new WhiteWall();
        addObject(whiteWall28,134,71);

        WhiteVerticalWall whiteVerticalWall49 = new WhiteVerticalWall();
        addObject(whiteVerticalWall49,235,28);
        WhiteVerticalWall whiteVerticalWall50 = new WhiteVerticalWall();
        addObject(whiteVerticalWall50,235,90);

        StrafingBomb strafingBomb5 = new StrafingBomb();
        addObject(strafingBomb5,367,453);
        StrafingBomb strafingBomb6 = new StrafingBomb();
        addObject(strafingBomb6,327,227);

        WhiteWall whiteWall29 = new WhiteWall();
        addObject(whiteWall29,556,493);

        WhiteVerticalWall whiteVerticalWall51 = new WhiteVerticalWall();
        addObject(whiteVerticalWall51,588,532);

        GreenRupee greenRupee8 = new GreenRupee();
        addObject(greenRupee8,552,532);
        GreenRupee greenRupee9 = new GreenRupee();
        addObject(greenRupee9,551,614);

        GhostWall ghostWall37 = new GhostWall();
        addObject(ghostWall37,636,518);

        StrafingBomb strafingBomb7 = new StrafingBomb();
        addObject(strafingBomb7,571,430);

        GhostWall ghostWall33 = new GhostWall();
        addObject(ghostWall33,557,388);
        GhostWall ghostWall34 = new GhostWall();
        addObject(ghostWall34,619,388);
        GhostWall ghostWall35 = new GhostWall();
        addObject(ghostWall35,724,388);
        GhostWall ghostWall36 = new GhostWall();
        addObject(ghostWall36,673,334);

        WhiteVerticalWall whiteVerticalWall52 = new WhiteVerticalWall();
        addObject(whiteVerticalWall52,770,319);
        WhiteVerticalWall whiteVerticalWall53 = new WhiteVerticalWall();
        addObject(whiteVerticalWall53,510,263);
        WhiteVerticalWall whiteVerticalWall54 = new WhiteVerticalWall();
        addObject(whiteVerticalWall54,510,203);
        WhiteVerticalWall whiteVerticalWall55 = new WhiteVerticalWall();
        addObject(whiteVerticalWall55,770,259);
        WhiteVerticalWall whiteVerticalWall56 = new WhiteVerticalWall();
        addObject(whiteVerticalWall56,770,200);

        GhostVerticalWall ghostVerticalWall7 = new GhostVerticalWall();
        addObject(ghostVerticalWall7,293,118);

        GhostWall ghostWall38 = new GhostWall();
        addObject(ghostWall38,283,44);
        GhostWall ghostWall39 = new GhostWall();
        addObject(ghostWall39,344,44);
        WhiteWall whiteWall30 = new WhiteWall();
        addObject(whiteWall30,556,300);
        WhiteWall whiteWall31 = new WhiteWall();
        addObject(whiteWall31,617,300);
        WhiteWall whiteWall32 = new WhiteWall();
        addObject(whiteWall32,724,274);
        WhiteWall whiteWall33 = new WhiteWall();
        addObject(whiteWall33,661,242);

        WhiteVerticalWall whiteVerticalWall57 = new WhiteVerticalWall();
        addObject(whiteVerticalWall57,589,254);
        WhiteVerticalWall whiteVerticalWall58 = new WhiteVerticalWall();
        addObject(whiteVerticalWall58,709,227);

        GreenRupee greenRupee10 = new GreenRupee();
        addObject(greenRupee10,739,237);
        GreenRupee greenRupee11 = new GreenRupee();
        addObject(greenRupee11,736,447);
        GreenRupee greenRupee12 = new GreenRupee();
        addObject(greenRupee12,551,343);
        GreenRupee greenRupee13 = new GreenRupee();
        addObject(greenRupee13,552,259);

        BlueRupee blueRupee4 = new BlueRupee();
        addObject(blueRupee4,463,541);
        BlueRupee blueRupee5 = new BlueRupee();
        addObject(blueRupee5,462,491);

        GhostWall ghostWall40 = new GhostWall();
        addObject(ghostWall40,495,433);
        GhostWall ghostWall41 = new GhostWall();
        addObject(ghostWall41,436,386);
        GhostWall ghostWall42 = new GhostWall();
        addObject(ghostWall42,495,338);
        GhostWall ghostWall43 = new GhostWall();
        addObject(ghostWall43,436,286);
        GhostWall ghostWall44 = new GhostWall();
        addObject(ghostWall44,495,234);
        GhostWall ghostWall45 = new GhostWall();
        addObject(ghostWall45,435,179);

        WhiteVerticalWall whiteVerticalWall59 = new WhiteVerticalWall();
        addObject(whiteVerticalWall59,419,117);
        WhiteVerticalWall whiteVerticalWall60 = new WhiteVerticalWall();
        addObject(whiteVerticalWall60,419,57);

        WhiteWall whiteWall34 = new WhiteWall();
        addObject(whiteWall34,525,158);

        BlueRupee blueRupee6 = new BlueRupee();
        addObject(blueRupee6,190,524);
        BlueRupee blueRupee7 = new BlueRupee();
        addObject(blueRupee7,375,357);

        GreenRupee greenRupee14 = new GreenRupee();
        addObject(greenRupee14,374,257);
        GreenRupee greenRupee15 = new GreenRupee();
        addObject(greenRupee15,17,371);
        GreenRupee greenRupee16 = new GreenRupee();
        addObject(greenRupee16,281,524);

        BlueRupee blueRupee8 = new BlueRupee();
        addObject(blueRupee8,498,684);
        BlueRupee blueRupee9 = new BlueRupee();
        addObject(blueRupee9,474,683);
        BlueRupee blueRupee10 = new BlueRupee();
        addObject(blueRupee10,452,682);

        DungeonStairsFloor6 dungeonStairsFloor6 = new DungeonStairsFloor6();
        addObject(dungeonStairsFloor6,62,667);

        WhiteWall whiteWall35 = new WhiteWall();
        addObject(whiteWall35,1001,646);
        WhiteWall whiteWall36 = new WhiteWall();
        addObject(whiteWall36,1063,646);

        WhiteVerticalWall whiteVerticalWall61 = new WhiteVerticalWall();
        addObject(whiteVerticalWall61,1078,600);

        WhiteWall whiteWall37 = new WhiteWall();
        addObject(whiteWall37,1124,613);
        WhiteWall whiteWall38 = new WhiteWall();
        addObject(whiteWall38,1184,585);
        WhiteWall whiteWall39 = new WhiteWall();
        addObject(whiteWall39,1093,555);

        GreenRupee greenRupee17 = new GreenRupee();
        addObject(greenRupee17,1139,580);
        GreenRupee greenRupee18 = new GreenRupee();
        addObject(greenRupee18,991,608);
        GreenRupee greenRupee19 = new GreenRupee();
        addObject(greenRupee19,1031,607);
        GreenRupee greenRupee20 = new GreenRupee();
        addObject(greenRupee20,897,572);

        StrafingBomb strafingBomb8 = new StrafingBomb();
        addObject(strafingBomb8,1145,361);
        StrafingBomb strafingBomb9 = new StrafingBomb();
        addObject(strafingBomb9,1220,314);
        StrafingBomb strafingBomb10 = new StrafingBomb();
        addObject(strafingBomb10,1203,415);
        StrafingBomb strafingBomb11 = new StrafingBomb();
        addObject(strafingBomb11,1072,337);
        StrafingBomb strafingBomb12 = new StrafingBomb();
        addObject(strafingBomb12,1091,406);
        StrafingBomb strafingBomb13 = new StrafingBomb();
        addObject(strafingBomb13,1252,369);
        StrafingBomb strafingBomb14 = new StrafingBomb();
        addObject(strafingBomb14,1151,279);
        
        WhiteWall whiteWall40 = new WhiteWall();
        addObject(whiteWall40,586,72);
        WhiteWall whiteWall41 = new WhiteWall();
        addObject(whiteWall41,717,72);
        WhiteWall whiteWall42 = new WhiteWall();
        addObject(whiteWall42,779,72);
        WhiteWall whiteWall43 = new WhiteWall();
        addObject(whiteWall43,828,72);
        WhiteWall whiteWall44 = new WhiteWall();
        addObject(whiteWall44,537,72);
        WhiteWall whiteWall45 = new WhiteWall();
        addObject(whiteWall45,492,72);
        WhiteWall whiteWall46 = new WhiteWall();
        addObject(whiteWall46,456,72);
        
        StrafingBomb strafingBomb15 = new StrafingBomb();
        addObject(strafingBomb15,474,618);
    }
}