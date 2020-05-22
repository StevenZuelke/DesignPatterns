//Author: Steven Zuelke

package Dungeon;

public class HeroFactory {

    private AttackFactory attackFactory;

    public HeroFactory(AttackFactory attackFactory){
        this.attackFactory = attackFactory;
    }

    public Hero createHero(String heroType){

        Hero hero;
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
            default:
                return new Warrior(attackFactory.getAttack("warrior"));

        }//end switch type

    }//end createHero

}//end class
