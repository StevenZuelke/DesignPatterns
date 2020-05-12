//Author: Steven Zuelke

package Dungeon;

public class HeroFactory {

    public Hero createHero(String heroType){

        Hero hero = new Warrior();
        heroType = heroType.toUpperCase();
        switch(heroType){
            case "WARRIOR":
                return new Warrior();
            case "THIEF":
                return new Thief();
            case "SORCERESS":
                return new Sorceress();
        }
        return hero;

    }//end createHero

}//end class
