/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act5_canaria;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author precious kim
 */
public class Act05B_MyLinkekdList_Canaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       LinkedList<String> data = new LinkedList<>();
       System.out.print("How many members’ information will be entered? ");
       int members = input.nextInt();
       for(int i = 0; i< members;)
       {
          System.out.print("\nKindly give the information of member #" + (i+1)+"\n");
          System.out.print("Enter first name: ");
          String fname = input.next();
          data.add(fname);

          System.out.print("Enter middle name: ");
          String mname = input.next();
          data.add(mname);

          System.out.print("Enter last name: ");
          String lname = input.next();
          data.add(lname);

          System.out.print("Enter area code: ");
          String areaCode = input.next();
          data.add(areaCode);

          System.out.print("Enter telephone number: ");
          String phone = input.next();
          data.add(phone);

          System.out.print("Enter gender: ");
          String gender = input.next();
          data.add(gender);

          System.out.print("Enter age: ");
          String age = input.next();
          data.add(age);
	}

        
         //declare a index setter
        int set_index = 0;
         //Now welcome the members to the club
        for(int i = 0; i< members; i++)
        {
            System.out.println("\nWelcome to the club "+data.get(set_index)+" "
                    +data.get(set_index+1)+" "+data.get(set_index+2));
            //increment the value of set index by three
            set_index = set_index + 3;
            System.out.println("Your area code and telephone number is ("+data.get(set_index)+") "
                    +data.get(set_index+1));
            set_index =set_index + 2;
            System.out.println("You are a "+data.get(set_index)+" member, and your age is "
                    +data.get(set_index+1));
            set_index = set_index + 2;
        }
}
}