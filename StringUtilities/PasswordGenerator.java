public class PasswordGenerator
{
	private char[] options;
	
	public PasswordGenerator()
	{
		options = new char[68];
		int i = 0;
		char ch = 'A';
		
		for (; ch <= 'Z'; i++, ch++)
		{
			options[i] = ch;
		}
		
		for (ch = 'a'; ch <= 'z'; i++, ch++)
		{
			options[i] = ch;
		}
		
		for (ch = '0'; ch <= '9'; i++, ch++)
		{
			options[i] = ch;
		}
		
		options[i] = '_';
		i++;
		options[i] = '-';
		i++;
		options[i] = '$';
		i++;
		options[i] = '%';
		i++;
		options[i] = '#';
		i++;
		options[i] = '@';
		i++;
	}
	
	public static int numberOfCharacters()
	{
		return (int)(Math.random() * 5) + 8;
	}
	
	public char firstLetter()
	{
		return options[(int)(Math.random() * 52)];
	}
	
	public char[] generatePassword()
	{
		boolean isValid = false;
		int plength = numberOfCharacters();
		int pos = (int)((Math.random() * (plength - 1)) + 1);
		String password = "";
		char[] cpassword = new char[plength];
		
		while(!isValid)
		{
			cpassword[0] = firstLetter();
			
			for (int i = 1; i < cpassword.length; i++)
			{
				cpassword[i] = options[(int)(Math.random() * 63)];
			}
			
			cpassword[pos] = options[(int)((Math.random() * 5) + 63)];
			
			for (int i = 0; i < cpassword.length; i++)
			{
				password += cpassword[i];
			}
			
			if (StringUtilities.hasUpperCase(password) && StringUtilities.hasLowerCase(password) && StringUtilities.hasNumeric(password))
			{
				isValid = true;
			}
		}
		
		return cpassword;
	}
	
	public static void main(String[] args)
	{
		PasswordGenerator pg = new PasswordGenerator();
		for (int i = 0; i < 100; i++)
		{
			System.out.println(pg.generatePassword());
		}
	}
	
	public void printOptions()
	{
		for(int i = 0; i < options.length; i++)
		{
			System.out.println("options[" + i + "] = " + options[i]);
			System.out.println();
		}
	}
	
	
}