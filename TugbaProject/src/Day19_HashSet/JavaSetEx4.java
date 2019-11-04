package Day19_HashSet;

import java.util.HashSet;

public class JavaSetEx4 {

	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
        
      //7. Write a Java program to convert a hash set to an array.

        Integer[] array = new Integer[numbers.size()];
       numbers.toArray(array);
   
       
       System.out.println("Array elements: ");
        for(Integer element : array){
          System.out.println(element);
          
        //8. Write a Java program to convert a hash set to a tree set.
       }
	}

}
