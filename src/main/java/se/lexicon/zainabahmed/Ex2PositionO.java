package se.lexicon.zainabahmed;

/*
* 3.Given the following String: "Ok this is not as long!"create a substring of only "not as long" (excluding theexclamation point) and print it out
* */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Ex2PositionO {
    private static String opinion = "Ok this is not as long!";

    public static void printSubstring(){
        System.out.println(opinion.length() +"(length). Index; " + opinion.indexOf("not as long"));
        System.out.println(opinion.substring(11,22));
    }
}
