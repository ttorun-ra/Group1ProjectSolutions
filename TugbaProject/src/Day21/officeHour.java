package Day21;

import java.util.Arrays;

public class officeHour {

	public static void main1(String[] args) {
		
			
			      int counter = 0;
			      String sentence = "Java is a general-purpose computer-programming "
			          + "language that is concurrent, class-based, object-oriented, "
			          + "and specifically designed to have as "
			          +"few implementation dependencies as possible.";
			      
			      System.out.println(sentence);
			      
			      String[] words = sentence.split("-");
			      System.out.println("*********************************************************");
			      System.out.println(Arrays.toString(words));
			      System.out.println("length = " + words.length);
			      System.out.println("*********************************************************");
			      for(String str: words) {
			        if (str.equals("language")) {
			          break;
			        }
			        counter++;
			      }
			      System.out.println("Position: "+counter);
			      System.out.println(counter);
			      System.out.println(words[counter-1]);
			    }
			  

{
			  /**
			   * Create method that accepts String and returns character array. Input: “James”
			   * Output: [j, a, m, e, s]
			   * 
			   * 
			   */

			 

			    String word = "Huseyin";

			    char[] newArray = characterArray(word);

			    System.out.println("newArray = " + Arrays.toString(newArray));

			  }
			

			  public static char[] characterArray(String name) {

			  }

		
			
			  public static void main(String[] args) {
			    String[] arr= {"zero", "one","two","three","four"};
			    //array icerisinde kac tane kelime e harfini icerir
			    //count how many words have 'e' in the arr
			      }
			}

			

	}

}
