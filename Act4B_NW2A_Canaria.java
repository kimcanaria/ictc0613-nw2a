
package act4b_nw2a_canaria;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author precious kim
 */
public class Act4B_NW2A_Canaria {


	    public static void insert(){
                int a, b;
                   Scanner scan = new Scanner(System.in);
                   System.out.print("Enter Array length: ");
                   a = scan.nextInt();
                   int array[] = new int[a+1];
                   System.out.println("Enter Element");
                   for(int i = 0; i < a; i++)





                   {
                       array[i] = scan.nextInt();
                   }
                   System.out.print("Enter the element to insert: ");
                   b = scan.nextInt();
                   array[a] = b;

                   System.out.print("After inserting: ");
                   for(int i = 0; i <a; i++)
                   {
                       System.out.print(array[i]+"\n");
                   }
                   scan.close();
                   System.out.print(array[a]); 
             }

	  public static void delete(){

	        int c, d, e = 0;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter Array length: ");
	        c = scan.nextInt();
	        int array[] = new int[c];
	        System.out.println("Enter Element");
	        for(e = 0; e < c; e++)
	        {
	            array[e] = scan.nextInt();
	        }
	        System.out.print("Enter the index of the element to delete: ");
	        d = scan.nextInt();
	        System.out.println("Element to be deleted at index: "+ d); 

	        int[] copyArr = new int[array.length - 1]; 

	        System.arraycopy(array, 0, copyArr, 0, d); 

	        System.arraycopy(array, d + 1, copyArr, d, array.length - d - 1); 
	        scan.close();
	        System.out.println("Array after deleting an element: "+ Arrays.toString(copyArr));  
	  }

	  public static void traverse(){
	        int f;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter Array length: ");
	        f = scan.nextInt();
	        int array[] = new int[f+1];
	        System.out.println("Enter Element");
	        for(int g = 0; g < f; g++)
	        {
	            array[g] = scan.nextInt();
	        }
	        System.out.print("Elements in Array are:\n");
	        for(int g = 0; g < f; g++)
	        {
	            System.out.print(array[g]+" ");
	        }
	        scan.close();
	  }

	  public static void exit(){
	      System.out.println("Exit");
	  }
	  public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);
	      System.out.println("Select Options:");
	      System.out.println("1. Insert");
	      System.out.println("2. Delete"); 
	      System.out.println("3. Traverse");
	      System.out.println("4. Exit");
	      System.out.println("Enter chosen operations: ");
	      int choices = scan.nextInt();
	      System.out.println();
	      switch(choices){
	          case 1:
	              insert();
	              break;
	          case 2:
	              delete();
	              break;
	          case 3:
	              traverse();
	              break;
	          case 4:
	              exit();
	              break;
	      }
	      System.out.println();
	      scan.close(); 
	  }
	}
    

