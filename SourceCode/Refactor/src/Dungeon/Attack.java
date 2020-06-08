package Dungeon;

public interface Attack {
    String name();
    void attack(DungeonCharacter attacker, DungeonCharacter opponent);
}
