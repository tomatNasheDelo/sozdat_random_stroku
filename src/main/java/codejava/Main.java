package codejava;

import java.nio.charset.Charset;
import java.util.Random;

public class Main {
	
	
	public static void main (String[] args) {
		
		System.out.println(randomStringSimple(20));
		System.out.println(randomAlphanumericString(20));
		randomAlphanumericString(20);
	}
	
	public static String randomStringSimple(int length) {
	    byte[] byteArray = new byte[length];
	    Random random = new Random();
	    random.nextBytes(byteArray);
	 
	    return new String(byteArray, Charset.forName("UTF-8"));
	}
	
	public static String randomAlphanumericString(int length) {
	    String alphanumericCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuv";
	 
	    StringBuffer randomString = new StringBuffer(length);
	    Random random = new Random();
	 
	    for (int i = 0; i < length; i++) {
	        int randomIndex = random.nextInt(alphanumericCharacters.length());
	        char randomChar = alphanumericCharacters.charAt(randomIndex);
	        randomString.append(randomChar);
	    }
	 
	    return randomString.toString();
	}

}
