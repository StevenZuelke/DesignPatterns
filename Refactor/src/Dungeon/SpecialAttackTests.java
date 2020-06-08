package Dungeon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SpecialAttackTests {

    @Test
    public void BarbarianAttack_DoesntThrowException(){
        Attack BarbAttack = new BarbarianAttack();
        Barbarian attacker = new Barbarian(BarbAttack);
        Attack DragAttack = new DragonAttack();
        DungeonCharacter opponent = new Dragon(DragAttack);

        BarbAttack.attack(attacker, opponent);
    }//end Barbarian

    @Test
    public void DragonAttack_DoesntThrowException(){
        Attack DragAttack = new DragonAttack();
        DungeonCharacter attacker = new Dragon(DragAttack);
        Attack BarbAttack = new BarbarianAttack();
        Barbarian opponent = new Barbarian(BarbAttack);

        DragAttack.attack(attacker, opponent);
    }//end Dragon


    @Test
    public void GoblinAttack_DoesntThrowException(){
        Attack GobAttack = new GoblinAttack();
        DungeonCharacter attacker = new Goblin(GobAttack);
        Attack BarbAttack = new BarbarianAttack();
        Barbarian opponent = new Barbarian(BarbAttack);

        GobAttack.attack(attacker, opponent);

    }//end Goblin

    @Test
    public void GremlinAttack_DoesntThrowException(){
        Attack GremAttack = new GremlinAttack();
        DungeonCharacter attacker = new Gremlin(GremAttack);
        Attack BarbAttack = new BarbarianAttack();
        Barbarian opponent = new Barbarian(BarbAttack);

        GremAttack.attack(attacker, opponent);
    }//end Gremlin

    @Test
    public void OgreAttack_DoesntThrowException(){
        Attack OgreAttack = new OgreAttack();
        DungeonCharacter attacker = new Ogre(OgreAttack);
        Attack BarbAttack = new BarbarianAttack();
        Barbarian opponent = new Barbarian(BarbAttack);

        OgreAttack.attack(attacker, opponent);
    }//end Ogre

    @Test
    public void RogueAttack_DoesntThrowException(){
        Attack RogueAttack = new RogueAttack();
        DungeonCharacter attacker = new Rogue(RogueAttack);
        Attack GremlinAttack = new GremlinAttack();
        Gremlin opponent = new Gremlin(GremlinAttack);

        RogueAttack.attack(attacker, opponent);
    }//end Rogue

    @Test
    public void SkeletonAttack_DoesntThrowException(){
        Attack SkelAttack = new SkeletonAttack();
        DungeonCharacter attacker = new Skeleton(SkelAttack);
        Attack BarbAttack = new BarbarianAttack();
        Barbarian opponent = new Barbarian(BarbAttack);

        SkelAttack.attack(attacker, opponent);
    }//end Skeleton

    @Test
    public void SorceressAttack_DoesntThrowException(){
        Attack SorcAttack = new SorceressAttack();
        DungeonCharacter attacker = new Sorceress(SorcAttack);
        Attack GremlinAttack = new GremlinAttack();
        Gremlin opponent = new Gremlin(GremlinAttack);

        SorcAttack.attack(attacker, opponent);
    }//end Sorceress

    @Test
    public void ThiefAttack_DoesntThrowException(){
        Attack ThiefAttack = new ThiefAttack();
        DungeonCharacter attacker = new Thief(ThiefAttack);
        Attack GremlinAttack = new GremlinAttack();
        Gremlin opponent = new Gremlin(GremlinAttack);

        ThiefAttack.attack(attacker, opponent);
    }//end Thief

    @Test
    public void WarriorAttack_DoesntThrowException(){
        Attack WarAttack = new WarriorAttack();
        DungeonCharacter attacker = new Warrior(WarAttack);
        Attack GremlinAttack = new GremlinAttack();
        Gremlin opponent = new Gremlin(GremlinAttack);

        WarAttack.attack(attacker, opponent);
    }//end Warrior
}//end class
