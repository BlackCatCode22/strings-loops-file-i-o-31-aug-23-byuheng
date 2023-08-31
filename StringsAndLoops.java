import java.util.ArrayList;

public class StringsAndLoops {
    public static void main(String [] args){

        String phrase = "The quick brown fox jumped over the lazy dog";
        String string02 = "";
        int theCharIndex = 0;

        //examples of multiple methods
        System.out.println(phrase.substring(phrase.indexOf("b"), phrase.indexOf("j")));

        System.out.println(phrase.substring(10,19));

        System.out.println(phrase.substring(phrase.indexOf("b"), 19));

        // class demo
        theCharIndex = phrase.indexOf("brown fox");
        System.out.println((theCharIndex));


        System.out.println("\n The index of 'b'is " + theCharIndex);

        string02 = phrase.substring(theCharIndex, 19);

        // for loop

        String [] friends = {"jim", "angela", "oscar","dwight"};

        for(int i = 0; i< friends.length; i++){
            System.out.println(friends[i]);

        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);

        for(int a : numbers){
            System.out.println(a);
        }


    }
}