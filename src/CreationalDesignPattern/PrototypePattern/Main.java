package CreationalDesignPattern.PrototypePattern;

public class Main {
    public static void main(String[] args){

        CharacterFactory characterFactory = new CharacterFactory();
        try{
            Character luffy =  characterFactory.createCharacterWithName("Luffy");
            System.out.println(luffy.showCharacterInfo());
        }catch(Exception e){

        }

    }
}
