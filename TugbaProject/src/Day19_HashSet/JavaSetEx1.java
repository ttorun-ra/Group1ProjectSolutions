package Day19_HashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class JavaSetEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> listNumbers= new ArrayList<>();
		listNumbers.add(1);
		listNumbers.add(1);
		listNumbers.add(1);

		for(int i=0; i<listNumbers.size(); i++) {
			System.out.println(listNumbers.get(i));
			
			
			System.out.println("HashSet------");
			Set<Integer>setNumbers=new HashSet<>();
			setNumbers.add(1);
			setNumbers.add(1);
			setNumbers.add(1);
		
			System.out.println(setNumbers);
			System.out.println();
		}
	}
}
		