//Author: Steven Zuelke

package Dungeon;

import java.util.Random;

public class MonsterFactory {

    AttackFactory attackFactory;

    public MonsterFactory(AttackFactory attackFactory){
        this.attackFactory = attackFactory;
    }

    public Monster createMonster(){

        Monster monster = new Skeleton(attackFactory.getAttack("skeleton"));
        int monsterType = (new Random()).nextInt() % 5;
        switch(monsterType){

            case 0:
                return new Skeleton(attackFactory.getAttack("skeleton"));
            case 1:
                return new Ogre(attackFactory.getAttack("ogre"));
            case 2:
                return new Gremlin(attackFactory.getAttack("gremlin"));
            case 3:
                return new Dragon(attackFactory.getAttack("dragon"));
            case 4:
                return new Goblin(attackFactory.getAttack("goblin"));

        }//end switch type

        return monster;

    }//end createMonster

}//end class
