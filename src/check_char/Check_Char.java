/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check_char;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author aytaj.veyisli
 */
public class Check_Char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
       
        
        Map<Character, Integer> characterCount = Check_Util.countCharacters(str);
        System.out.println(characterCount);
        
        
    }
    
}
