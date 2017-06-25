package FuzzyLogics.FuzzyLogics;

public interface Fuzzy 
{
	public  String simmetricClassPath = "uk.ac.shef.wit.simmetrics.similaritymetrics."; 
	
	public double getMatchPercent (String s1, String s2, String attribute);
}
