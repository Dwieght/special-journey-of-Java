/** Thank You! :) Hope this helps you */
import java.util.Scanner;
public class ReverseString{
   public static void main(String []args){
      Scanner scanner = new Scanner(System.in);//Input for Later 
		String text = scanner.nextLine();//Create Variable to store the input
      //The java string toCharArray() method converts the given string into a sequence of characters.
		char[] arr = text.toCharArray();
      int size = text.length();//Create size and store the length of input length above

      //empty String to store  
		String store = "";
      String reverse = "";
      //initialize for loop i = 0,if size above of the length is not 0 
		for(int i = 0;i<size;i++){
      store = store + arr[i];//store here if not yet 0 
		}
      //then after storing,reversing initialize for loop
      for(int i = store.length()-1; i>=0;i--){
         reverse = reverse + arr[i];//the reverse empty string store the array of decrement 
      }
		System.out.println(reverse);//input: dog Output:god
		
   
   
      }
   }