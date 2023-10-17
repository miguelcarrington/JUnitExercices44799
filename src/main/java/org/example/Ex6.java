package org.example;

public class Ex6 {

    public double countDigits(String number){
        String numbers = "0123456789";
        int average = 0;
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            String digit = number.substring(i,i+1);

            if(numbers.contains(digit)){
                average = average + Integer.parseInt(digit);
                count++;
            }
        }
        return (double) average /count;
    }
}
