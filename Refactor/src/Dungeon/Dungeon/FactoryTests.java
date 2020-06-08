package Dungeon;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTests {

    @Test
    public void createHero(){

        AttackFactory aHero = new AttackFactory();
        HeroFactory toTest = new HeroFactory(aHero);
        assertEquals(toTest, toTest);


    }


    @Test
    public void createMonster(){

        AttackFactory aMonster = new AttackFactory();
        HeroFactory toTest = new HeroFactory(aMonster);
        assertEquals(toTest, toTest);
    }
}
