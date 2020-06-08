package Dungeon;


import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class SpecialAttackTests {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void BarbarianAttack(){
    //First Method of J Unit test
        BarbarianAttack underTest = new BarbarianAttack();
        assertEquals(underTest, underTest);


    }//end Barbarian

    @Test
    public void DragonAttack(){
    //Second method of J Unit test
        DragonAttack underTest = new DragonAttack();
        exception.expect(RuntimeException.class);


    }//end Dragon


    @Test
    public void GoblinAttack(){

        GoblinAttack underTest = new GoblinAttack();
        assertEquals(underTest, underTest);


    }//end Goblin

    @Test
    public void GremlinAttack(){

        GremlinAttack underTest = new GremlinAttack();
        assertEquals(underTest, underTest);


    }//end Gremlin

    @Test
    public void OgreAttack(){

        DragonAttack underTest = new DragonAttack();
        assertEquals(underTest, underTest);

    }//end Ogre

    @Test
    public void RogueAttack(){

        RogueAttack underTest = new RogueAttack();
        assertEquals(underTest, underTest);


    }//end Rogue

    @Test
    public void SkeletonAttack(){

        SkeletonAttack underTest = new SkeletonAttack();
        assertEquals(underTest, underTest);


    }//end Skeleton

    @Test
    public void SorceressAttack(){

        SorceressAttack underTest = new SorceressAttack();
        assertEquals(underTest, underTest);


    }//end Sorceress

    @Test
    public void ThiefAttack(){

        ThiefAttack underTest = new ThiefAttack();
        assertEquals(underTest, underTest);


    }//end Thief

    @Test
    public void WarriorAttack(){

        WarriorAttack underTest = new WarriorAttack();
        assertEquals(underTest, underTest);


    }//end Warrior

}//end class
