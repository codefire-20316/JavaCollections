/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamaps;

import java.util.Collection;
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

        // Replace
        Integer put = map.put("Misha Pupkin", 3500);
        System.out.println(put);

        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            System.out.printf("%s %s\n", key, map.get(key));
        }

        int sum = 0;
        
        Collection<Integer> values = map.values();
        
        for (Integer value : values) {
            sum += value;
            System.out.println(value);
        }
        
        System.out.println("Sum: " + sum);
    }

}
