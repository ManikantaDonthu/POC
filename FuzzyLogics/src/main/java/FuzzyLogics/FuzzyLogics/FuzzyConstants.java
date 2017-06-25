package FuzzyLogics.FuzzyLogics;

import java.io.IOException;
import java.io.InputStream;
import java.util.MissingResourceException;
import java.util.Properties;

public class FuzzyConstants 
{
	
	public static final String nameAttr = "NAME";

	public static final String NAME_ALG = "NAME_FUZZY_ALGORITHM";
	
	public static final String FUZZY_BOUNDS = "FuzzyMatch.properties";	
	public static Properties fuzzyProps = new Properties();
	
	static
	{		
		try
		{
			InputStream inputStream = FuzzyConstants.class.getClassLoader().getResourceAsStream(FUZZY_BOUNDS);
			fuzzyProps.load(inputStream);
		}
		catch(MissingResourceException missingResourceException)
		{
			missingResourceException.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static String getLowerUpperBounds(String name)
	{
		return fuzzyProps.getProperty(name);
	}
	
	public static String getAlgorithm(String algName)
	{
		return fuzzyProps.getProperty(algName);
	}
}
