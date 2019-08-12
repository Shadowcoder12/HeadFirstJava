public class phraseOMatic {
    public static void main (String[] args) {
        //Phrases of arrays
        String [] wordListOne = {
            "live","from New York", "It's Saturday", "Night", "This is it", "Hear I stand"
        };
        String [] wordListTwo = {
            "live","from New York", "What you see is what you get", "So GF when he's playing around", "Stop", "The love you save"
        };
        String [] wordListThree = {
            "live","from New York", "No hidden agenda", "We will", "May be your own", "You better remember"
        };
        // determing the number of words in the respective arrays
        int wordOneLength = wordListOne.length;
        int wordTwoLength = wordListTwo.length;
        int wordThreeLength = wordListThree.length;

        // generating a random number from 0 to the length of each respective array
        int randomNumber1 = (int) (Math.random() * wordOneLength);
        int randomNumber2 = (int) (Math.random() * wordTwoLength);
        int randomNumber3 = (int) (Math.random() * wordThreeLength);
        
        // building a string phrase by picking a random word from each respective array
        String phrase = wordListOne[randomNumber1] + " " +  wordListTwo[randomNumber2] + " " +  wordListThree[randomNumber3];
        
        // printing phrase to the console
        System.out.println( "Here is the randomly generated phrase:" + " " + phrase);
    }
}