import java.util.Scanner;

public class RomanToDecimal {
	
	//method to process the characters from the romanToDecimal method
	public int ProcessRoman(int TotalDecimal, int LastRomanLetter, int LastDecimal) {
        if (LastRomanLetter > TotalDecimal) {
            return LastDecimal - TotalDecimal;
        } else {
            return LastDecimal + TotalDecimal;
        }
    }

    public void romanToDecimal(String roman) {
    	//declare variables
        int decimal = 0;
        int lastNumber = 0;
        //create variable to convert to the string to all uppercase
        String romanNumeral = roman.toUpperCase();
        //start a loop to parse the string
        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
        	//declare variable to define character position
            char convertToDecimal = romanNumeral.charAt(x);
            //switch case for the value of each character
            switch (convertToDecimal) {
                case 'M':
                    decimal = ProcessRoman(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = ProcessRoman(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = ProcessRoman(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = ProcessRoman(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = ProcessRoman(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = ProcessRoman(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = ProcessRoman(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        //print the roman numeral's value
        System.out.println(romanNumeral + " is equal to " + decimal);
    }
    //method to be called from main
    public void GetRoman() {
    	//create scanner
        Scanner getRoman = new Scanner(System.in);
        String Roman = getRoman.next();
        
        //call method to convert roman numeral
        romanToDecimal(Roman);
        
        //close scanner
        getRoman.close();
    }
}
