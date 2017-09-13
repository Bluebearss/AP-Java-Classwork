public class Sound
{ 
	private int[] samples;
	
	/** Change those values in this sound that have
	 *  an amplitude greater than limit.
	 *  Values greater than limit are changed to limit.
	 *  Values less than -limit are changed to -limit.
	 *  @param limit the amplitude limit
	 *		Precondition: limit >= 0
	 *  @return the number of values in the sound
	 *  that this methode changed
	 */
	 
	public Sound (int[] samples)
	{
		this.samples = samples;
	}
	
	public int limitAmplitude(int limit)
	{
		int numChanges = 0;
		
		for (int i = 0; i < samples.length; i++)
		{
			if (samples[i] > limit)
			{
				samples[i] = limit;
				numChanges++;
			}
			
			else 
			{
				if (samples[i] < -limit)
				{
					samples[i] = -limit;
					numChanges++;
				}
			}
		}
		
		return numChanges;
	}
	
	/** Removes all silence from the beginning of this sound.
	 *  Silence is represented by a value of 0.
	 *  Precondition:  samples contains at least one 
	 *					non-zero value
	 *  Postcondition: the length of samples reflects the
	 *					removal of starting silence
	 */
	public void trimSilenceFromBeginning()
	{
		int i = 0;
		
		while (samples[i] == 0)
		{
			i++;
		}
		
		int[] temp = new int[samples.length - i];
		
		for (int j = 0; j < temp.length; j++)
		{
			temp[j] = samples[j + i];
		}
		
		samples = temp;
	}