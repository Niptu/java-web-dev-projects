import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        String input ="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";

        char[] charactersInString = input.toCharArray();

        HashMap  <Character, Integer> characterCounter = new HashMap<>();
        int counter = 1;

        for (Character i: charactersInString) {
            if (characterCounter.containsKey(i)) {
                characterCounter.put(i,characterCounter.get(i)+1);
            } else {
                characterCounter.put (i, counter);
            }
        }
        System.out.print(characterCounter);
    }
}