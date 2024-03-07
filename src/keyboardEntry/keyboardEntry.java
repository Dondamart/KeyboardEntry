/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keyboardEntry;

/**
 *
 * @author danim
 */
import java.util.Scanner;
public class keyboardEntry {

    public static void main(String[] args) {
        System.out.println("Starting program...");
        System.out.println("Enter your name: ");
        String newName= "";

        Scanner keyboardEntry= new Scanner(System.in);
        
        newName= keyboardEntry.nextLine();
        
        System.out.println("Your name is: "+ newName);
    }
    
}
