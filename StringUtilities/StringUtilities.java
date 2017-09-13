public class StringUtilities
{
	public static String reverseString(String str)
	{
		String newString = "";
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			newString += str.substring(i, i + 1);
		}
		
		return newString;
	}

	public static boolean isPalindrome(String str)
	{
		return (str.equals(reverseString(str)));
	}
	
	public static boolean isVowel(String str)
	{
		if (str.length() != 1)
		{
			return false;
		}
		
		return "AEIOUaeiou".indexOf(str) != -1; /*Checks if an occurence of str is in the string "AEIOUaeiou. 
												If it does occur it will be an index != -1 otherwise it would 
												be -1.*/
	}
	
	public static boolean hasVowel(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			String letter = str.substring(i, i + 1);
			if (isVowel(letter))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean isDigit(char ch)
	{	
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean allDigits(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{		
			if (!isDigit(str.charAt(i)))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isUpperCase(char ch)
	{
		return (ch > 'A' && ch < 'Z');
	}
	
	public static boolean hasUpperCase(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			if(isUpperCase(str.charAt(i)))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasUpperCase(char[] ch)
	{
		for (int i = 0; i < ch.length; i++)
		{
			if(isUpperCase(ch[i]))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean isLowerCase(char ch)
	{
		return (ch > 'a' && ch < 'z');
	}
	
	public static boolean hasLowerCase(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			if(isLowerCase(str.charAt(i)))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasLowerCase(char[] ch)
	{
		for (int i = 0; i < ch.length; i++)
		{
			if(isLowerCase(ch[i]))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasNumeric(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			if(isDigit(str.charAt(i)))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasNumeric(char[] ch)
	{
		for (int i = 0; i < ch.length; i++)
		{
			if(isDigit(ch[i]))
			{
				return true;
			}
		}
		
		return false;
	}
	
	/*
	public static int[] alphaStringArray(String str)
	{
		int[] arr = new int[26];
		String upperCaseStr = str.toUpperCase();
		
		for (int i = 0; i < upperCaseStr.length(); i++)
		{
			for (char j = 'A'; j <= 'Z'; i++)
			{
				if (upperCaseStr.charAt(i) == j)
				{
					arr[(int)(j) - 65]++;
				}
			}
		}
		
		return arr;
	}
	*/
	public static void main(String[] args)
	{
		String str1 = "Sons of Gondor, of Rohan. My brothers. I see in your eyes the same fear that would take"
						+
			           "the heart of me! A day may come, when the courage of men fails, when we forsake our"
			           	+ 
			           "friends and break all bonds of Fellowship, but it is not this day! An hour of wolves and"
			           	+
			           "shattered shields when the age of men comes crashing down! But it is not this day! This"
			           	+
			           "day we fight! By all that you hold dear on this good earth, I bid you, stand, men of"
			           	+ 
			           "the West!";
			           
		String str2 = "anutforajaroftuna";
		
		String str3 = "3141592653589793238462643";
			           
		String reverseStr1 = reverseString(str1);
		
		String reverseStr2 = reverseString(str2);
		
		boolean isPalindromeStr1 = isPalindrome(str1);
		
		boolean isPalindromeStr2 = isPalindrome(str2);
		
		boolean hasVowelStr2 = hasVowel(str2);
		
		char c1 = 'G';
		
		boolean allDigitsStr3 = allDigits(str3);
		
		System.out.println(reverseStr1);
		
		System.out.println();
		
		System.out.println(reverseStr2);
		
		System.out.println();
		
		System.out.println(isPalindromeStr1);
		
		System.out.println();
		
		System.out.println(isPalindromeStr2);
		
		System.out.println();
		
		System.out.println(hasVowelStr2);
		
		System.out.println(c1);
		
		System.out.println((int)c1);
		
		c1++;
		
		System.out.println(c1);
		
		System.out.println((int)c1);
		
		c1 = (char)(c1 + 1);
		
		System.out.println(c1);
		
		System.out.println((int)c1);
		
		System.out.println();
		
		System.out.println(allDigitsStr3);
		/*
		int[] alphaArrStr2 = alphaStringArray(str2);
		
		for (int i = 0; i < alphaArrStr2.length; i++)
		{
			char currentLetter1 = (char)(i + 65);
			char currentLetter2 = (char)(i + 97);
			System.out.println("Letter " + currentLetter1 + " or " + currentLetter2 + " occurences = " + alphaArrStr2[i]);
		}
		
		*/
	}
}