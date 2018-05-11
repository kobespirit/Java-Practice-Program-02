/*
 * COMP90041 lab2 
 * Assignment Name: Factors.java
 * Student NO.:653909 
 * Author: Changjian MA 
 * Date: 25/08/2015
 * Java program to print out all of the factors of that number from
 * 1 up to that number on a single line, separated by spaces
 */
public class Factors {
    public static void main(String[]args)  {
        String num = args[0];
        int numb= Integer.parseInt(num); 
        System.out.print("");
        for(int i = 1;i<=numb;i++){
          if(numb%i==0){
        	  if (i != 1) {
         		 System.out.print(" ");
        	  }
    		  System.out.print(i);
	      }
        }
        System.out.println();
    }
}

