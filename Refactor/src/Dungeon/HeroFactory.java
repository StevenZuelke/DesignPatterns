//Author: Steven Zuelke

package Dungeon;

public class HeroFactory {

    AttackFactory attackFactory;

    public HeroFactory(AttackFactory attackFactory){
        this.attackFactory = attackFactory;
    }

    public Hero createHero(String heroType){

        Hero hero = new Warrior(attackFactory.getAttack("warrior"));
        heroType = heroType.toUpperCase();
        switch(heroType){

            case "WARRIOR":
                return new Warrior(attackFactory.getAttack("warrior"));
            case "THIEF":
                return new Thief(attackFactory.getAttack("thief"));
            case "SORCERESS":
                return new Sorceress(attackFactory.getAttack("sorceress"));
            case "BARBARIAN":
                return new Barbarian(attackFactory.getAttack("barbarian"));
            case "ROGUE":
                return new Rogue(attackFactory.getAttack("rogue"));

        }//end switch type

        return hero;

    }//end createHero

}//end class
