package BDD_practise;

import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Boolean match = Pattern.matches("Nitin", "Nitin");
		//Boolean match = Pattern.matches("[Nn]itin", "Nitin");
		//Boolean match = Pattern.matches("Niti[Nni]", "Nitin");
		//Boolean match = Pattern.matches("Nitin", "Nitin Patil");
		//Boolean match = Pattern.matches(".*Nitin.*", "Nitin Patil");
		//Boolean match = Pattern.matches(".itin", "Nitin"); - it will ignore the first letter
		//Boolean match = Pattern.matches("[0-9]itin", "0itin");
		//Boolean match = Pattern.matches("[aA0-zZ9]itin", "0itin");
		//Boolean match = Pattern.matches("[^aA0-zZ9]itin", "0itin");
		//Boolean match = Pattern.matches("Niti[^aeioun]", "Nitin");
		//Boolean match = Pattern.matches("\\ditin", "0itin"); \\d -- accept digit from 0-9
		//Boolean match = Pattern.matches("\\Ditin", "0itin"); \\D -- not accept digit from 0-9
		//Boolean match = Pattern.matches("\\witin", "Nitin"); \\w -- accept letter from [0aA-9AZ]
		//Boolean match = Pattern.matches("\\Witin", "Nitin"); \\W -- Not accept letter from [0aA-9AZ]
		//Boolean match = Pattern.matches("^Nitin", "Nitin is my name"); - Not match--because after Nitin String is not match
		//Boolean match = Pattern.matches("^Nitin.*", "Nitin is my name"); --Matched
		//Boolean match = Pattern.matches("name$", "Nitin is my name"); -- $ means ending word -- Not matched
		//Boolean match = Pattern.matches(".*name$", "Nitin is my name"); -- Matched
		//Boolean match = Pattern.matches("N...n", "Nitin");-- 3 dots means 3 words -- metched
		//Boolean match = Pattern.matches("^Nitin.*name$", "Nitin is my name");--Matched -- it will accept if there should be no character like Nitinname
		//Boolean match = Pattern.matches("^Nitin.+name$", "Nitinname"); -- + means there should be character in between Nitin and name
		//Boolean match = Pattern.matches("^Nitin.{2}+name$", "Nitinname");--{2} means 2 dots/Anything should be there, its mandatory
		//Boolean match = Pattern.matches("Nitin|nitin", "Nitin"); -- | means or, either Nitin or nitin
		//Boolean match = Pattern.matches("[a-d[m-p]]","s"); -- either a-d or m-p
		//Boolean match = Pattern.matches("[a-z&&[mp]]","m"); -- should match from a-z and from mp
		//Boolean match = Pattern.matches("[a-z&&[^mp]]","m"); -- should not from mp
		//Boolean match = Pattern.matches("[a-z&&[^m-p]]","m"); -- should not from the range of m - p
		Boolean match = Pattern.matches("[a-z&&[^m-p]]","m");
		if(match)
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
	}

}
