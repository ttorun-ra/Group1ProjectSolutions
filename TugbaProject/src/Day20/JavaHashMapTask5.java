package Day20;
import java.util.Map;
import java.util.HashMap;
public class JavaHashMapTask5 {
	//5. Write a Java program to check whether a map
    //   contains key-value mappings
  

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        //ex: do we have key 3, print => Black, <- value at key 3
        //                 else print => No we don't have
        int key = 1;
        if (map.containsKey(key)) {
            System.out.println("Value is " + map.get(key));
        } else {
            System.out.println("No we don't have");
        }

        //part 2, check if you map is empty
//        map.clear();
        if (map.isEmpty()) {
            System.out.println("it is empty");
        } else {
            System.out.println("it is not empty");
        }

    }
}


