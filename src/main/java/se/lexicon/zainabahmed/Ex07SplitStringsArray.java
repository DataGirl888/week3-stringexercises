package se.lexicon.zainabahmed;

public class Ex07SplitStringsArray {
    private static String oilWater = "Oil and Water";

    public static void splitOilWater(){
        String[] oilWaterArray = new String[2];
        oilWaterArray[0] = oilWater.substring(0,oilWater.indexOf("a"));
        oilWaterArray[1] = oilWater.substring(oilWater.indexOf("Water"),oilWater.length());
        System.out.println(oilWaterArray[0] + " " + oilWaterArray[1]);
    }
}
