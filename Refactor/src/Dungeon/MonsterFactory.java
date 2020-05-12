//Author: Steven Zuelke

package Dungeon;

import java.util.Random;

public class MonsterFactory {

    public Monster createMonster(){

        Monster monster = new Skeleton();
        int monsterType = (new Random()).nextInt() % 3;
        switch(monsterType){
            case 0:
                return new Skeleton();
            case 1:
                return new Ogre();
            case 2:
                return new Gremlin();
        }
        return monster;

    }//end createMonster

}//end class
