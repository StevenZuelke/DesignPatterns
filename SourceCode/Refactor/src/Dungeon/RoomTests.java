package Dungeon;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomTests {

    @Test
    public void addItemsWorks(){

        //Arrange
        Room room = new Room();

        //Act
        room.addItem(0);
        room.addItem(4);
        ArrayList items = room.getItems();

        //Assert
        assertEquals(2, items.size());

    }//end addtolist

    @Test
    public void itemsToStringWorks(){

        //Arrange
        Room room = new Room();
        room.addItem(0);
        room.addItem(3);

        //Act
        String str = room.itemsToString();

        //Assert
        assertEquals("Entrance, Vision Potion, ", str);

    }//end itemstostring

}//end class
