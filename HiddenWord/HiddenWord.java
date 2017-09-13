public class HiddenWord
{
  private String word;

  public HiddenWord(String hWord)
  {
    word = hWord;
  }

  public String getHint(String guess)
  {
    String hint = "";
    
    if (guess.length() > word.length())
    {
    	return "Ayyyo, your guess is too long my guy.";
    }
    
    if (guess.length() < word.length())
    {
    	return "Ayyyo, your guess is too short my guy.";
    }
    
    for (int i = 0; i < guess.length(); i++)
    {
      if (guess.substring(i, i + 1).equals(word.substring(i, i + 1)))
      {
        hint += guess.substring(i, i + 1);
      }
      else
      {
        if(word.indexOf(guess.substring(i, i + 1)) != -1)
        {
          hint += "+";
        }
        else
        {
          hint += "*";
        }
      }
    }
    
    return hint;
  }
  
  public static void main(String[] args)
  {
  	HiddenWord word = new HiddenWord("Samson");
  	
  	System.out.println(word.getHint("SenorRoberto"));
  }
}