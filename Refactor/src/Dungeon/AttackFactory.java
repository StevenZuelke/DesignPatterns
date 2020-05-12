package Dungeon;

import java.util.HashMap;
import java.util.Map;

public class AttackFactory {

     Map<String, Attack> Attacks = new HashMap<String, Attack>();

    public void fillMap(){
        Attacks.put("gremlin", new GremlinAttack());
        Attacks.put("ogre", new OgreAttack());
        Attacks.put("skeleton", new SkeletonAttack());
        Attacks.put("sorceress", new SorceressAttack());
        Attacks.put("thief", new ThiefAttack());
        Attacks.put("warrior", new WarriorAttack());
    }

    public Attack getAttack(String characterType){
        return Attacks.get(characterType);
    }

}
