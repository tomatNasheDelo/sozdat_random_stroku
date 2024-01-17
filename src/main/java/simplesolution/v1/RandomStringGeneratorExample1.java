package simplesolution.v1;

import gfg1.RandomString;

public class RandomStringGeneratorExample1 {
    public static void main(String[] args) {
    	
        RandomString generator = new RandomString
                .Builder()
                .withinRange('0', 'z')
                .build();

        String generatedString1 = generator.generate(5);
        String generatedString2 = generator.generate(10);
        String generatedString3 = generator.generate(15);

        System.out.println(generatedString1);
        System.out.println(generatedString2);
        System.out.println(generatedString3);
    }
}