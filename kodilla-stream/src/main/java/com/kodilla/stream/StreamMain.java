package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        PoemDecorator toUpper = (String string) -> string.toUpperCase();

        PoemDecorator abcAdd = (String string) -> "ABC "+string+" ABC";

        PoemDecorator starsBetweenLetters = (String string) -> {
            String letterAndStar;
            String letterAndStarAdd = "*";
            for (int i = 0; i < string.length(); i++) {
                letterAndStar = string.charAt(i)+"*";
                letterAndStarAdd += letterAndStar;
            }
            return letterAndStarAdd;
        };

        PoemDecorator starsAroundLetters = (String string) -> {
            String stars = "* ";
            String text = " ";
            for (int i = 0; i < 27; i++) {
                stars +="* ";
            }
            text = "\n* * *"+string+" * * *\n";
            return stars + text +stars;
        };

            poemBeautifier.beautify("W Szczebrzeszynie Chrząszcz brzmi w trzcinie", toUpper);
            System.out.println();
            poemBeautifier.beautify("W Szczebrzeszynie Chrząszcz brzmi w trzcinie", abcAdd);
            System.out.println();
            poemBeautifier.beautify("W Szczebrzeszynie Chrząszcz brzmi w trzcinie", starsBetweenLetters);
            System.out.println();
            poemBeautifier.beautify("W Szczebrzeszynie Chrząszcz brzmi w trzcinie", starsAroundLetters);

    }
}


