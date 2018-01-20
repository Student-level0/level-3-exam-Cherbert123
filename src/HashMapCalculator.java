import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int toReturn = 0;
		if(hashmap1.get("Bob").equals(hashmap2.get("Bob"))) {
			toReturn = toReturn + 1;
		}
		if(hashmap1.get("Felix").equals(hashmap2.get("Felix"))) {
			toReturn = toReturn + 1;
		}
		if(hashmap1.get("Mary").equals(hashmap2.get("Mary"))) {
			toReturn = toReturn + 1;
		}
		return toReturn;
	}

}
