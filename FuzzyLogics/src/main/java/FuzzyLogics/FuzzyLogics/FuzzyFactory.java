package FuzzyLogics.FuzzyLogics;
public class FuzzyFactory 
{	
	private Fuzzy fuzzyVar = null;	
	
	public Fuzzy getInstance ()
	{		
		if ( fuzzyVar ==null )
		{			
			fuzzyVar = new SimMetricFuzzy();
			return fuzzyVar;
		}
		
		return fuzzyVar;		
	}
}
