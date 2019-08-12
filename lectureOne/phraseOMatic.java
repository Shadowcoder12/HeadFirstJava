public class phraseOMatic {
    public static void main (String[] args) {
        //Phrases
        String [] wordListOne = {
            "live","from New York", "It's Saturday", "Night", "This is it", "Hear I stand"
        };
        String [] wordListTwo = {
            "live","from New York", "What you see is what you get", "So GF when he's playing around", "Stop", "The love you save"
        };
        String [] wordListThree = {
            "live","from New York", "No hidden agenda", "We will", "May be your own", "You better remember"
        };
        
        int wordOneLength = wordListOne.length;
        int wordTwoLength = wordListTwo.length;
        int wordThreeLength = wordListThree.length;

        int randomNumber1 = (int) (Math.random() * wordOneLength);
        int randomNumber2 = (int) (Math.random() * wordTwoLength);
        int randomNumber3 = (int) (Math.random() * wordThreeLength);

        String phrase = wordListOne[randomNumber1] + " " +  wordListTwo[randomNumber2] + " " +  wordListThree[randomNumber3];

        System.out.println( "Here is the randomly generated phrase:" + " " + phrase);
    }
}