public class EnterRomanNumeral {

	public static void main(String[] args) {
		
		//create new RomanToDecimal object
		RomanToDecimal converter = new RomanToDecimal();
		
		//prompt user for decimal
        System.out.println("Enter a roman numeral to be converted: ");
        
        //call method from RomanToDecimal class
        converter.GetRoman();
	}

}
