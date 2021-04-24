import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class SwitchCaseAndCurrenyAndPossitiveAndEven{
 public static void main(String []args){
 //for inputter, initialize scanner
 Scanner day = new Scanner(System.in);
 int one;
 //for example if you entered
 //Jan to March - 3 months 
 //April to June - 4 -6 months
 //July to september - 7 - 9 months
 //Oct to December - 10 -12 months
 System.out.print("Enter Month in Numeric Form: ");
 one = day.nextInt();
 //if they entered 1 or 2 or 3 output will be Cold Winter Time!
 switch(one){
   case 1:
   case 2:
   case 3:
      System.out.print( "\n" + "Cold Winter Time!");
   break;//break to avoid continoution of program
   case 4:
   case 5:
   case 6:
 //if they entered 4 or 5 or 63 output will Olah, Spring Time!!
       System.out.print( "\n" + "Olah, Spring Time!");// \n <-- for Spacing
   break;
   case 7:

   case 8:
   case 9:
      System.out.print( "\n" + "Beach, Summer Time! ");
   break;
   case 10:
   case 11:
   case 12:
      System.out.print( "\n" + "Oh! It's Fall!");
   break;

   default://if the entered output is not there this will print Oh! No! Invalid Input!
      System.out.println("OH! NO! INVALID INPUT!");
   }
 
 
   //lets initialize 100 for example
   //assignment = <--to 0 to store;
   int number = 100,SumPossOdd=0,cntEven=0,sum=0;
   //while number 100 is greater than and equal to 80 print number below
      //cntEven store Even, 
   while(number >=80){  
      System.out.println(number);
      sum += number; //store the numbers after looping
   if(number>0 && number%2 != 0)//if number greater than 0 and the remainder of number is 2 and not 0 which is odd
      SumPossOdd += number;
   if(number%2 !=1)
       cntEven++;//store even
      number -=5;//number -=5 decrement the while loop to 5 ex: 5,10,15,20

   }
   //output
   System.out.println("Numbers:"+sum);
   System.out.println("Sum Possitive Even Number:"+SumPossOdd);
   System.out.println("Count Even:"+cntEven); 
     
   //CURRENCY
   //first lets import the Crrency and Number format of the Currency 
   //Which is import.java.Locale and import.java.NumberFormat // to a money format and a locale for the country 
   Scanner scanner = new Scanner(System.in);//for inputter and assigne it to payment below
   double payment = scanner.nextDouble();//there is a different method depending on your data types, nextInt,nextLine,nextDouble etc.
      String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);//getCurrencyInstance is a java Locale Method to get the Currency of the given Country
      String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);//well india has no Locale yet , create new Local En for english and In for india
      String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
      String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
   

}

}