package Dungeon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTests {


    //start HeroFactory test
    @Test
    public void getHero_doesntThrowException()
    {

        AttackFactory attackFactory = new AttackFactory();
        HeroFactory hero = new HeroFactory(attackFactory);

        String heroName = "thief";
        hero.createHero(heroName);
        heroName = "rogue";
        hero.createHero(heroName);
        heroName = "sorceress";
        hero.createHero(heroName);
        heroName = "warrior";
        hero.createHero(heroName);
        heroName = "barbarian";
        hero.createHero(heroName);
    }

    @Test
    public void getHero_doesntThrowExceptionEmptyString()
    {

        AttackFactory attackFactory = new AttackFactory();
        HeroFactory hero = new HeroFactory(attackFactory);

        String heroName = " ";

        hero.createHero(heroName);
    }
    //end HeroFactory



    //Start MonsterFactory test
    @Test
    public void testCreateMonster_doesntThrowException()
    {
        AttackFactory attackFactory = new AttackFactory();
        MonsterFactory monster = new MonsterFactory(attackFactory);

        monster.createMonster();
    }
    //end MonsterFactory



}
