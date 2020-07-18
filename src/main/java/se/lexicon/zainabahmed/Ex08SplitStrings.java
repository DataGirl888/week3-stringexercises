package se.lexicon.zainabahmed;

public class Ex08SplitStrings {

    private static String names = "Carl,Susie,Fredrick,Bob,Erik";

    public static void namesSplitting(){
        String aName =  names.substring(0,names.indexOf(","));
        String [] namesArray = new String [5];

        namesArray[0] = names.substring(names.indexOf("Carl"),names.indexOf(","));
        namesArray[1] = names.substring(names.indexOf("Susie"),names.indexOf(",F"));
        namesArray[2] = names.substring(names.indexOf("Fredrick"),names.indexOf(",B"));
        namesArray[3] = names.substring(names.indexOf("Bob"),names.indexOf(",E"));
        namesArray[4] = names.substring(names.indexOf("Erik"),names.length());
        System.out.println(namesArray[0]);
        System.out.println(namesArray[1]);
        System.out.println(namesArray[2]);
        System.out.println(namesArray[3]);
        System.out.println(namesArray[4]);
    }

}

