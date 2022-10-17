package foreach.learn;

import java.util.ArrayList;
import java.util.List;

public class FirstLambda{
	public static void main(String[] args) {
		List<String> newList = new ArrayList <String>();
		newList.add("Football");
		newList.add("BaseBall");
		newList.add("Circket");
		newList.add("Hockey");
		newList.add("Boxing");
		
		//System.out.println("------------------------By Using Lambda expression----------------");
		
		newList.forEach(games ->System.out.println(games));
		
		for(int i =0; i<newList.size();++i) {
			
			System.out.println(newList.get(i));
		}
	}
}