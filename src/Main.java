import java.util.Scanner;

class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Type two words below this sentence!");
        String mystery = in.next();
        String mystery2 = in.next();

        String str = "1234";

        int strLen = "1234".length();
        System.out.println(strLen);

        int strLen2 = mystery.length();
        System.out.println(strLen2);

//This gets the character at the 1st index, aka the second character
        char secondChar = "1234".charAt(1);
        System.out.println(secondChar);

        char firstChar = "1234".charAt(0);
        System.out.println(firstChar);

        String combo1 = "1234" + "5678";
        String combo2 = "1234".concat("5678");
        System.out.println(combo1);
        System.out.println(combo2);

        String Mystery2 = "mystery".concat("2");
        System.out.println(mystery.concat(mystery2));

        in.close();

    }
}