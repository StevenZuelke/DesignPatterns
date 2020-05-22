package Dungeon;

import java.util.HashMap;
import java.util.Map;

public class AttackFactory {

     Map<String, Attack> Attacks = new HashMap<String, Attack>();

     public AttackFactory(){
         fillMap();
     }

    private void fillMap(){

        Attacks.put("gremlin", new GremlinAttack());
        Attacks.put("ogre", new OgreAttack());
        Attacks.put("skeleton", new SkeletonAttack());
        Attacks.put("sorceress", new SorceressAttack());
        Attacks.put("thief", new ThiefAttack());
        Attacks.put("warrior", new WarriorAttack());
        Attacks.put("barbarian", new BarbarianAttack());
        Attacks.put("goblin", new GoblinAttack());
        Attacks.put("dragon", new DragonAttack());
        Attacks.put("rogue", new RogueAttack());

    }//end fillMap

    public Attack getAttack(String characterType){
        return Attacks.get(characterType.toLowerCase());
    }

}
