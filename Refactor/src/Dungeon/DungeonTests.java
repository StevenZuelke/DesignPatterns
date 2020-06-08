package Dungeon;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DungeonTests {

    @Test
    public void ConstructorSetup_WorksWithFourPillars(){

        //Arrange
        Hero hero = new Rogue(new RogueAttack());

        //Act
        NewDungeon dungeon = new NewDungeon(hero);
        int numPillars = 0;
        Room[][] rooms = dungeon.getRooms();

        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms.length; j++){
                if(rooms[i][j].getItems().contains(6))
                    numPillars++;
            }
        }

        //Assert
        assertEquals(4, numPillars);

    }//end setup w/4 pillars

    @Test
    public void getItemsWorksCorrectRoom(){

        Hero hero = new Rogue(new RogueAttack());
        NewDungeon dungeon = new NewDungeon(hero);

        ArrayList items = dungeon.getItems(0,0);

        assertEquals(1, items.size());
        assertTrue(items.contains(0));

    }//end getItems

    @Test
    public void heroLocationWorks(){

        Hero hero = new Rogue(new RogueAttack());
        NewDungeon dungeon = new NewDungeon(hero);

        String str = dungeon.heroLocation();

        assertEquals("The hero is located in [0] [0]", str);

    }//end herolo9action

    @Test
    public void dungeonToString_DoesntThrowException(){

        Hero hero = new Rogue(new RogueAttack());
        NewDungeon dungeon = new NewDungeon(hero);

        System.out.println(dungeon.toString());

    }//end tostring

    @Test
    public void printRoom_DoesntThrowException(){
        Hero hero = new Rogue(new RogueAttack());
        NewDungeon dungeon = new NewDungeon(hero);

        dungeon.printRoom(0,0);
    }

}//end class
