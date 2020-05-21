package Dungeon;

import java.util.ArrayList;

public class Room {

    //0: Entrance
    //1: Exit
    //2: Healing Potion
    //3: Vision Potion
    //4: Pit
    //5: Monster
    //6: Pillar
    private ArrayList<Integer> itemsContained = new ArrayList<Integer>();
    private Boolean occupied;

    public Room(){

        occupied = false;

    }//end constructor

    public void addItem(int itemNum){ itemsContained.add(itemNum); }

    public void clearItems(){ itemsContained = new ArrayList<Integer>(); }

    public String itemsToString(){

        String items = "";
        for(int i = 0; i < itemsContained.size(); i++){

            switch(itemsContained.get(i)){

                case 0:
                    items += "Entrance";
                    break;
                case 1:
                    items += "Exit";
                    break;
                case 2:
                    items += "Healing Potion";
                    break;
                case 3:
                    items += "Vision Potion";
                    break;
                case 4:
                    items += "Pit";
                    break;
                case 5:
                    items += "Monster";
                    break;
                case 6:
                    items += "Pillar";
                    break;


            }//end switch item

            items += ", ";

        }//end for i

        return items;

    }//end itemsToString

    public ArrayList<Integer> getItems(){ return itemsContained; }

    public boolean getOccupied(){ return occupied; }

    public void setOccupied(boolean occupied){

        this.occupied = occupied;

    }//end setOccupied

}//end class
