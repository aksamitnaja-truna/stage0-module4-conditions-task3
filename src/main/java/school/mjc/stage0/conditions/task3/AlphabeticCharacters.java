package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int symbol;
        if ((character < 65 || character > 90) && (character < 97 || character > 122)){
            System.out.println("wrong alphabet!");
            return;
        }
        else if (character <= 90) {
            symbol = character - 65;
        }
        else {
            symbol = character - 97;
        }

        if (symbol == 0 || symbol == 4 || symbol == 14 || symbol == 20 || symbol == 19 || symbol == 24){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
