package se.lexicon.zainabahmed;

public class Ex010CharJava {
    private static char[] javaChar = {'J','a','v','a' };

    public static void charToString(){
    String javaString ="";
        for (char letter : javaChar){
            javaString = javaString+letter;
        }
        System.out.println(javaString);
    }
}
