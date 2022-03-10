import java.util.Scanner;

public class ReadNumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number from 0 to 999");
        int number = scanner.nextInt();

        int numberOfUnits = number % 10;
        int numberOfTens = (number % 100) / 10;
        int numberOfHundreds = number / 100;

        if (number < 0 || number > 999) {
            System.out.println("Wrong value input");
        } else if (number == 0) {
            System.out.println("zero");
        } else if (number < 20) {
            String word = units(number);
            System.out.println(word);
        } else {
            String word;
            if (numberOfHundreds == 0) {
                word = tens(numberOfTens) + " " + units(numberOfUnits);
            } else if (numberOfTens == 1) {
                word = units(numberOfHundreds) + " hundred " + units(number % 100);
            } else {
                word = units(numberOfHundreds) + " hundred " + tens(numberOfTens) + " " + units(numberOfUnits);
            }
            System.out.println(word);
        }
    }

    public static String tens(int number) {
        String wordTens = "";
        switch (number) {
            case 2:
                wordTens = "twenty";
                break;
            case 3:
                wordTens = "thirty";
                break;
            case 4:
                wordTens = "forty";
                break;
            case 5:
                wordTens = "fifty";
                break;
            case 6:
                wordTens = "sixty";
                break;
            case 7:
                wordTens = "seventy";
                break;
            case 8:
                wordTens = "eighty";
                break;
            case 9:
                wordTens = "ninety";
                break;
        }
        return wordTens;
    }

    public static String units(int number) {
        String wordUnits = "";
        switch (number) {
            case 1:
                wordUnits = "one";
                break;
            case 2:
                wordUnits = "two";
                break;
            case 3:
                wordUnits = "three";
                break;
            case 4:
                wordUnits = "four";
                break;
            case 5:
                wordUnits = "five";
                break;
            case 6:
                wordUnits = "six";
                break;
            case 7:
                wordUnits = "seven";
                break;
            case 8:
                wordUnits = "eight";
                break;
            case 9:
                wordUnits = "nine";
                break;
            case 10:
                wordUnits = "ten";
                break;
            case 11:
                wordUnits = "eleven";
                break;
            case 12:
                wordUnits = "twelve";
                break;
            case 13:
                wordUnits = "thirteen";
                break;
            case 14:
                wordUnits = "fourteen";
                break;
            case 15:
                wordUnits = "fifteen";
                break;
            case 16:
                wordUnits = "sixteen";
                break;
            case 17:
                wordUnits = "seventeen";
                break;
            case 18:
                wordUnits = "eighteen";
                break;
            case 19:
                wordUnits = "nineteen";
                break;
        }
        return wordUnits;
    }
}
