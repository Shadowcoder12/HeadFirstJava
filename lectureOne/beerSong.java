public class beerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String bottlesString = "bottles";

        while (beerNum>=1) {
            // once the number of beers is not plural , change bottleString to bottle
            if(beerNum <2) {
                bottlesString = "bottle";
            }
            System.out.println(beerNum + " " +  bottlesString + " of beer on the wall," + beerNum + bottlesString + " of beer");
            System.out.println("Take one down and pass it around, " + (beerNum - 1) + " " + bottlesString + " of beer on the wall");
            beerNum--;
        }
        if (beerNum == 0 ) {
            System.out.println("No more bottles of beer on the wall, no more bottles of beer");
            System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall");
        }
    }
}
// THINGS LEARNED 
// 1. String are immutable in java!! Ex: Inside the while loop , i created a dynamic strig that would chang the lyrics to the song as x 
// decremented but when i would print that string to the console , i kept getting 99 bottles of .. even if the while loop was decrementing beerNum

// 2. Source file name (beerSong.java) and class name (public class beerSong) must be the same!

