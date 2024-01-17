package javacodeexamples;

import java.util.Random;

public class JavaRandomStringExample {
 
    //we want random alphanumeric string of 20 characters
    static final int OUTPUT_STRING_LENGTH = 20;
 
    public static void main(String[] args) {
        
        //string containing allowed characters, modify according to your needs
        String strAllowedCharacters = 
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
                
 
        //initialize Random
        Random random = new Random();
        
        System.out.println("Random alphanumeric string of 20 characters");
        for(int i=0; i<10; i++){
            System.out.println( getNextRandomString(strAllowedCharacters, random) );
        }
        
        
    }
 
    private static String getNextRandomString(String strAllowedCharacters, Random random) {
        
        StringBuilder sbRandomString = new StringBuilder(OUTPUT_STRING_LENGTH);
        
        for(int i = 0 ; i < OUTPUT_STRING_LENGTH; i++){
            
            //get random integer between 0 and string length
            int randomInt = random.nextInt(strAllowedCharacters.length());
            
            //get char from randomInt index from string and append in StringBuilder
            sbRandomString.append( strAllowedCharacters.charAt(randomInt) );
        }
        
        return sbRandomString.toString();
        
    }
    
    
}