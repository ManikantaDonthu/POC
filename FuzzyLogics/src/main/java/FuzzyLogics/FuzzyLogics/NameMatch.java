package FuzzyLogics.FuzzyLogics;

public class NameMatch {

	public static void main(String[] args) {
		
		String name="BalaVenkata Manikanta";
		String name1="Bala";
		FuzzyFactory fuzzyFactory = new FuzzyFactory();
		double percMatch = fuzzyFactory.getInstance().getMatchPercent(name, name1, FuzzyConstants.nameAttr);
		System.out.println(percMatch);
	}

}
