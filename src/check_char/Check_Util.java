/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check_char;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author aytaj.veyisli
 */
public class Check_Util {
    
    public static Map<Character, Integer> countCharacters(String input){
        input = input.toLowerCase();
        
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c: input.toCharArray()) {
            if (c != ' ') {
                if (countMap.containsKey(c)) {
                    countMap.put(c, countMap.get(c)+1);
                }
                else{
                    countMap.put(c, 1);
                }
            }
            
        }
        return countMap;
    }

}






//public class CharacterCount {

//
//    public static Map<Character, Integer> countCharacters(String input) {
//        // Convert the input string to lowercase to make the count case-insensitive
//        input = input.toLowerCase();
//        
//        // Create a HashMap to store the character count
//        Map<Character, Integer> countMap = new HashMap<>();
//
//        // Iterate over each character in the string
//        for (char c : input.toCharArray()) {
//            // If the character is already in the map, increment its count
//            if (countMap.containsKey(c)) {
//                countMap.put(c, countMap.get(c) + 1);
//            } else {
//                // If the character is not in the map, add it with a count of 1
//                countMap.put(c, 1);
//            }
//        }
//        return countMap;
//    }
//}
