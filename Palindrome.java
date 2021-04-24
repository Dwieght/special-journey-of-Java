import javax.swing.*;//to add the JOption import <--
public class Palindrome{
   public static void main(String []args){
      //add addition original Variables, to store JOption for Later
      String original = JOptionPane.showInputDialog(null,"Enter a String:"); //showInputDialog for input and showMessageDialog for output
      //additional integer variable for length of the input
      int str = original.length();
      String reverse ="";
      
      //to get the length of the String
      for(int i = (str-1);i>=0; i--){ //str-1? well array starts at 0 to avoid it -1 is the key Folks
      //Store the loop here at empty reverse 
      reverse += original.charAt(i);//stored
      }//if the original is upper and lower case initialize equalsignore case from reverse string
      if(original.equalsIgnoreCase(reverse)){
      JOptionPane.showMessageDialog(null,"You entered a Palindrome"); 
      }//shoeMessageDialog for Output
      else{
      JOptionPane.showMessageDialog(null,"You did not enter a palindrome");
     }   
  }
}