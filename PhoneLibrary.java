import javax.swing.*;
import java.util.Scanner;

public class PhoneLibrary {
   public static void main(String[] args){
           Scanner scan = new Scanner(System.in);
           System.out.println("           menu      ");
           System.out.println(" ------------------------- ");
           System.out.println(" 1- write default message ");
           System.out.println(" 2-put your name  ");
           byte Menu = scan.nextByte();
           if (Menu == 1) {
               System.out.println(" HELLO ");

           } else if (Menu == 2 ){
               System.out.println(" PLEASE WRITE YOUR NAME :");
               String Name = scan.next();
               System.out.println(" Hello Dear "+ Name);
           } else {
                System.out.println(" PLEASE PUT CORRECT NUMBER  :");

           }


       }
   }
