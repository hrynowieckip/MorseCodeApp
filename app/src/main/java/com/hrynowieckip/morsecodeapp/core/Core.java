package com.hrynowieckip.morsecodeapp.core;

import java.util.HashMap;

public class Core {
    static HashMap<String,String> toText = new HashMap<String,String>()
    {{
        put(".-", "a");
        put("-...", "b");
        put("-.-.", "c");
        put("-..", "d");
        put(".", "e");
        put("..-.", "f");
        put("--.", "g");
        put("....", "h");
        put("..", "i");
        put(".---", "j");
        put("-.-", "k");
        put(".-..", "l");
        put("--", "m");
        put("-.", "n");
        put("---", "o");
        put(".--.", "p");
        put("--.-", "q");
        put(".-.", "r");
        put("...", "s");
        put("-", "t");
        put("..-", "u");
        put("...-", "v");
        put(".--", "w");
        put("-..-", "x");
        put("-.--", "y");
        put("--..", "z");
        put(".----", "1");
        put("..---", "2");
        put("...--", "3");
        put("....-", "4");
        put(".....", "5");
        put("-....", "6");
        put("--...", "7");
        put("---..", "8");
        put("----.", "9");
        put("-----", "0");

        put("_", " ");
    }};
    static HashMap<String,String> toMorseCode = new HashMap<String,String>()
    {{
        put("a",".-");
        put("b","-...");
        put("c", "-.-.");
        put("d","-..");
        put("e",".");
        put("f", "..-.");
        put("g","--.");
        put("h","....");
        put("i","..");
        put("j",".---");
        put("k","-.-");
        put("l",".-..");
        put("m","--");
        put("n","-.");
        put("o","---");
        put("p",".--.");
        put("q","--.-");
        put("r",".-.");
        put("s","...");
        put("t","-");
        put("u","..-");
        put("v","...-");
        put("w",".--");
        put("x","-..-");
        put("y","-.--");
        put("z","--..");
        put("1",".----");
        put("2","..---");
        put("3","...--");
        put("4","....-");
        put("5",".....");
        put("6","-....");
        put("7","--...");
        put("8","---..");
        put("9","----.");
        put("0","-----");

        put(" ","_");
    }};

    public static String textToMorseCode(String userIn){
        userIn=userIn.toLowerCase();
        String[] userInInArray= new String[userIn.length()];
        for(int i=0; i < userIn.length();i++){
            userInInArray[i] = String.valueOf(userIn.charAt(i));
        }
        for(int i=0; i<userInInArray.length;i++){
            if(toMorseCode.containsKey(userInInArray[i])){
                String temp=toMorseCode.get(userInInArray[i]);
                userInInArray[i]=temp+" ";
            }
        }
        StringBuffer convertedUserInSB = new StringBuffer();
        for(int i = 0; i < userInInArray.length; i++) {
            convertedUserInSB.append(userInInArray[i]);
        }
        String convertedUserInStr = convertedUserInSB.toString();
        return convertedUserInStr;
    }
    public static String morseCodeToText(String userIn){
        String[] userInInArray = userIn.split(" ");
        System.out.println(userInInArray);

        for(int i=0; i<userInInArray.length;i++){
            if(toText.containsKey(userInInArray[i])){
                String temp=toText.get(userInInArray[i]);
                userInInArray[i]=temp;
            }
        }
        StringBuffer convertedUserInSB = new StringBuffer();
        for(int i = 0; i < userInInArray.length; i++) {
            convertedUserInSB.append(userInInArray[i]);
        }
        String convertedUserInStr = convertedUserInSB.toString();
        return convertedUserInStr;
    }

}
