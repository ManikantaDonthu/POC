package FuzzyLogics.FuzzyLogics;

import uk.ac.shef.wit.simmetrics.similaritymetrics.AbstractStringMetric;



public class SimMetricFuzzy implements Fuzzy 
{
	
	public double getMatchPercent(String str1, String str2, String attribute) 
	{		
		double result = 0;
		
		if ((str1 != null && str2==null) || (str1 == null && str2 != null) )
			result = 0;
		else
		{			
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			
			str1 = str1.trim();
			str2 = str2.trim();
			
			try
			{
				result = getAlgorithmSimilarity(str1, str2, attribute);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}		
		return result;		
	}
	
	
	public double getAlgorithmSimilarity(String str1, String str2, String attribute)
	{
		double result = 0;		
		try
		{
			if(attribute.equals(FuzzyConstants.nameAttr))
			{
				result = loadAlgorithmClass(FuzzyConstants.NAME_ALG, str1, str2);
			}
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;		
	}
	
	public double loadAlgorithmClass(String algName, String str1, String str2) 
	{
		double result = 0;
		try
		{			
			String algProp = FuzzyConstants.getAlgorithm(algName);	
			Class algClass = Class.forName(simmetricClassPath + algProp);				
			Object obj = algClass.newInstance(); 
			AbstractStringMetric metric = (AbstractStringMetric)obj;
			result = metric.getSimilarity(str1, str2);
			return result; 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}

}
