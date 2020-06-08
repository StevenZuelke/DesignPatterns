package Dungeon;

import javafx.geometry.Point2D;

import java.util.ArrayList;

//this is the dungeon class that contains the rooms for the project
public class NewDungeon {

    private Hero theHero;
    private Room[][] Rooms = new Room[5][5];

    /*      c0 c1 c2 c3 c4
     * [enter] [] [] [] [] //r0
     *      [] [] [] [] [] //r1
     *      [] [] [] [] [] //r2
     *      [] [] [] [] [] //r3
     *      [] [] [] [] [exit] //r4
     */

    public NewDungeon(Hero hero){
        theHero = hero;
        roomSetup();
    }

    public Room[][] getRooms(){
        return Rooms;
    }
    public Hero getHero(){
        return theHero;
    }

    public ArrayList<Integer> getItems(int x, int y){
        return Rooms[x][y].getItems();
    }

    private void roomSetup()//adding entrance,exit, 4 pillars and items and monsters
    {

        makeRooms();
        int totalPillars = 0;

        theHero.location = new Point2D(0, 0);
        Rooms[0][0].addItem(0); //Entrance
        Rooms[4][4].addItem(1); //Exit
        //add pillars
        while(totalPillars < 4) {

            int row = (int)(Math.random()*4);
            int col = (int)(Math.random()*4);
            if(Rooms[row][col].getItems().isEmpty()) {

                Rooms[row][col].addItem(6);//add Pillar
                totalPillars++;

            }//end if
        }

        for(int i = 0; i < Rooms.length; i++){
            for(int j = 0; j < Rooms[0].length; j++){

                if(!(Rooms[i][j].getItems().contains(6) ||
                        Rooms[i][j].getItems().contains(0) || Rooms[i][j].getItems().contains(1))){// No pillar/entrance/exit

                    if(Math.random() < .2){// 20% chance Healing pot

                        Rooms[i][j].addItem(2);

                    }//end if

                    if(Math.random() < .3){// 30% chance Pit

                        Rooms[i][j].addItem(4);

                    }//end if

                    if(Math.random() < .1){// 10% chance Vision pot

                        Rooms[i][j].addItem(3);

                    }//end if

                    if(!Rooms[i][j].getItems().contains(4) && Math.random() < .4){// 40% chance Monster pot if no pit

                        Rooms[i][j].addItem(5);

                    }//end if

                }//end if


            }//end for j
        }//end for i

    }//end roomSetup

    public String heroLocation()//maintains location of hero in dungeon
    {
        return "The hero is located in [" + (int)theHero.location.getX() + "] [" + (int)theHero.location.getY() + "]";
    }

    //enstanciate rooms
    private void makeRooms() {

        for(int i = 0; i < Rooms.length; i++){
            for(int j = 0; j < Rooms[0].length; j++){

                Rooms[i][j] = new Room();

            }
        }

    }

    public void printRoom(int x, int y){//printCurrent room according to spec

        Room room = Rooms[x][y];
        //top
        String str = "*";
        if (x == 0) str += "*";
        else str += "-";
        str += "*\n";
        //middle
        if (y == 0) str += "*";
        else str +="|";
        //item
        ArrayList<Integer> items = room.getItems();
        if(items.contains(0)) str += "I";
        if(items.contains(1)) str += "O";
        if(items.contains(6)) str += "!";
        if(items.size() == 0) str += "E";
        if(items.size() > 1) str += "M";
        else if(items.contains(2)) str += "H";
        else if(items.contains(3)) str += "V";
        else if(items.contains(4)) str += "P";
        else if(items.contains(5)) str += "M";
        if (y == Rooms.length - 1) str += "*\n*";
        else str +="|\n*";
        //bottom
        if (x == Rooms.length - 1) str += "**";
        else str +="-*";
        System.out.println(str);

    }//end printroom

    public String toString()//dungeon information
    {

        String message = "Here is the information about the entire dungeon:\n";

        for(int rows = 0; rows < this.Rooms.length;rows++) {

            for(int columns = 0; columns < this.Rooms[0].length; columns++) {

                message += "[";
                message += rows + ", " + columns + ": ";
                if(theHero.location.getX() == rows && theHero.location.getY() == columns)
                    message += "PLAYER ";
                message += Rooms[rows][columns].itemsToString();
                message += "]";

            }

            message += "\n";

        }

        return message;

    }

}//end class
