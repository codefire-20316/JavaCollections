/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // Add
        map.put("Kolya Pupkin", 6000);
        map.put("Misha Pupkin", 2000);
        map.put("Vasya Pupkin", 3000);
        map.put("Petya Pupkin", 5000);
        
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() < 3000) {
                entry.setValue(entry.getValue() * 2);
            }
            
            System.out.printf("%s %s\n", entry.getKey(), entry.getValue());
        }
    }

}
