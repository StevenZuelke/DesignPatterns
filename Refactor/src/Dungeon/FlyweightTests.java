package Dungeon;

import org.junit.jupiter.api.Test;

public class FlyweightTests {

    @Test
    public void constructorFillMap_DoesntThrowException(){

        AttackFactory af = new AttackFactory();

    }//end Fillmap

    @Test
    public void getAttacks_DoesntThrowExceptions(){

        AttackFactory af = new AttackFactory();
        Attack attack = af.getAttack("barbarian");
        attack = af.getAttack("dragon");
        attack = af.getAttack("goblin");
        attack = af.getAttack("gremlin");
        attack = af.getAttack("ogre");
        attack = af.getAttack("rogue");
        attack = af.getAttack("skeleton");
        attack = af.getAttack("sorceress");
        attack = af.getAttack("thief");
        attack = af.getAttack("warrior");

    }//end getAttack

}//end class
