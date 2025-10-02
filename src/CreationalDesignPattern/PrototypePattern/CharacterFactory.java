package CreationalDesignPattern.PrototypePattern;

public class CharacterFactory {
    private Character prototypeCharacter;

    public CharacterFactory(){
        prototypeCharacter = new Character("Default name", 100, 50, 1);
    }

    public Character createCharacterWithName(String name) throws CloneNotSupportedException{
        Character clonedCharacter = prototypeCharacter.clone();
        clonedCharacter = new Character(name, clonedCharacter.health, clonedCharacter.attackPower, clonedCharacter.level);
        return clonedCharacter;
    }

    public Character createCharacterWithAttackPower(int attackPower) throws CloneNotSupportedException{
        Character clonedCharacter = prototypeCharacter.clone();
        clonedCharacter = new Character(prototypeCharacter.name, prototypeCharacter.health, attackPower, prototypeCharacter.level);
        return clonedCharacter;
    }

}
