package se.lexicon.zainabahmed;

public class Ex09CharArray {
    private static String stringArray = "ThisShouldBeConverted";

    public static void convertChar (){
        char[] charArray = new char[stringArray.length()];

        for (int i =0; i <stringArray.length(); i++){
            charArray[i] = stringArray.charAt(i);
            System.out.print(charArray[i]);
        }
    }
}
