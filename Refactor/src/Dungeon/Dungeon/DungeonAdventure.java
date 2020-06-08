package Dungeon;

import javafx.geometry.Point2D;

import java.util.ArrayList;

public class DungeonAdventure {

    private static AttackFactory attackFactory = new AttackFactory();
    private static MonsterFactory monsterFactory = new MonsterFactory(attackFactory);
    private static HeroFactory heroFactory = new HeroFactory(attackFactory);
    private static NewDungeon dungeon;
    private static boolean gameOver;

    public static void main(String[] args){

        do
        {
            Hero theHero = chooseHero();
            dungeon = new NewDungeon(theHero);
            playGame();
            System.out.println(dungeon.toString());

        } while (playAgain());

    }//end main

    private static void playGame(){

        gameOver = false;

        while(!gameOver){

            System.out.println(dungeon.heroLocation());
            dungeon.printRoom((int)dungeon.getHero().location.getX(), (int)dungeon.getHero().location.getY());
            boolean getInput = true;
            while(getInput){

                System.out.println(dungeon.getHero().toString());
                System.out.println("Choose what to do:\n" +
                        "1. Move up\n" +
                        "2. Move right\n" +
                        "3. Move down\n" +
                        "4. Move left\n" +
                        "5. Use Healing Potion\n" +
                        "6. Use Vision Potion\n");
                int input = Keyboard.readInt();
                switch(input){

                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        if(move(input))
                            getInput = false;
                        else
                            System.out.println("You can't move that direction");
                        break;
                    case 5:
                        useHealingPot();
                        break;
                    case 6:
                        useVisionPot();
                        break;
                    case 7:
                        //cheat
                        System.out.println(dungeon.toString());
                        break;

                }//end switch input


            }//end while getInput

        }//end while KeepPlaying

    }//end playGame

    private static boolean move(int direction){

        boolean moved = true;
        Point2D location = dungeon.getHero().location;
        switch(direction){

            case 1:
                if(location.getX() == 0) return false;
                dungeon.getHero().location = new Point2D(location.getX() - 1, location.getY());
                break;
            case 2:
                if(location.getY() == dungeon.getRooms().length) return false;
                dungeon.getHero().location = new Point2D(location.getX(), location.getY() + 1);
                break;
            case 3:
                if(location.getX() == dungeon.getRooms().length) return false;
                dungeon.getHero().location = new Point2D(location.getX() + 1, location.getY());
                break;
            case 4:
                if(location.getY() == 0) return false;
                dungeon.getHero().location = new Point2D(location.getX(), location.getY() - 1);
                break;

        }//end switch direction
        ArrayList<Integer> items = dungeon.getRooms()[(int)dungeon.getHero().location.getX()][(int)dungeon.getHero().location.getY()].getItems();
        if(items.contains(1) && dungeon.getHero().getPillars() == 4) {
            winGame();
            return true;
        }
        if(items.contains(2)) {
            dungeon.getHero().changeHealingPots(1);
            System.out.println("Found a Healing Potion!");
        }
        if(items.contains(3)) {
            dungeon.getHero().changeVisionPots(1);
            System.out.println("Found a Vision Potion!");
        }
        if(items.contains(4)){
            dungeon.getHero().subtractHitPoints((int)(Math.random() * 19) + 1);
            System.out.println("You fell into a Pit!");
        }
        if (items.contains(6)) {
            dungeon.getHero().addPillar();
            System.out.println("You found a Pillar!");
        }
        if(items.contains(5)){
            battle(dungeon.getHero(), monsterFactory.createMonster());
        }
        items.clear();
        return moved;

    }//end move method

    private static void battle(Hero theHero, Monster theMonster)
    {
        System.out.println(theHero.getName() + " battles " +
                theMonster.getName());
        System.out.println("---------------------------------------------");

        //do battle
        while (theHero.isAlive() && theMonster.isAlive() )
        {
            //hero goes first
            theHero.battleChoices(theMonster);

            //monster's turn (provided it's still alive!)
            if (theMonster.isAlive())
                theMonster.attack(theHero);

        }//end battle loop

        if (!theMonster.isAlive()){
            System.out.println(theHero.getName() + " was victorious!");
            if(Math.random() < .1){
                System.out.println("Obtained a healing potion from the enemy!");
                theHero.changeHealingPots(1);
            }
        }
        else if (!theHero.isAlive()){
            System.out.println(theHero.getName() + " was defeated in battle!");
            lostGame();
        }


    }//end battle method

    private static void lostGame(){
        System.out.println("You lost the game because you ran out of health!");
        gameOver = true;
    }

    private static void winGame(){

        gameOver = true;
        System.out.println("You made it to the exit with all the Pillars and Won!");

    }//end method to handle winning

    private static void useHealingPot(){

        if(dungeon.getHero().getHeal() > 0){

            dungeon.getHero().addHitPoints((int)(Math.random() * 15) + 5);
            dungeon.getHero().changeHealingPots(-1);

        }else
            System.out.println("You have no healing potions to use.");

    }//end useHealingPot

    private static void useVisionPot(){

        if(dungeon.getHero().getVision() > 0){

            dungeon.getHero().changeVisionPots(-1);
            int x = (int)dungeon.getHero().location.getX();
            int y = (int)dungeon.getHero().location.getY();
            for(int i = x - 1; i <= x + 1; i++){

                for(int j = y - 1; j <= y + 1; j++){

                    if(!(x < 0) && !(y < 0) && !(x >= dungeon.getRooms().length - 1) && !(y >= dungeon.getRooms()[0].length - 1)){

                        dungeon.printRoom(x,y);

                    }//end if room exists

                }//end for j

            }//end for i

        }else
            System.out.println("You have no vision potions to use.");

    }//end useVisionPot

    private static Hero chooseHero()
    {
        int choice;
        Hero theHero;


        System.out.println("Choose a hero:\n" +
                "1. Warrior\n" +
                "2. Sorceress\n" +
                "3. Thief\n" +
                "4. Barbarian\n" +
                "5. Rogue");
        choice = Keyboard.readInt();


        switch(choice)
        {
            case 1: return heroFactory.createHero("warrior");

            case 2: return heroFactory.createHero("sorceress");

            case 3: return heroFactory.createHero("thief");

            case 4: return heroFactory.createHero("barbarian");

            case 5: return heroFactory.createHero("rogue");

            default: System.out.println("invalid choice, returning Thief");
                return heroFactory.createHero("thief");
        }//end switch

    }//end chooseHero method

    private static boolean playAgain()
    {
        char again;

        System.out.println("Play again (y/n)?");
        again = Keyboard.readChar();
        return (again == 'Y' || again == 'y');

    }//end playAgain method

}//end class
