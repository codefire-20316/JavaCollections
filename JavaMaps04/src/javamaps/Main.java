/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamaps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
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
        
        // Natural sorted (LinkedHashSet)
        Set<String> nameSet = new LinkedHashSet<>();
        nameSet.add("Misha Pupkin");
        nameSet.add("Fedya Pupkin");
        nameSet.add("Vasya Pupkin");
        nameSet.add("Petya Pupkin");
        nameSet.add("Kolya Pupkin");
        
        System.out.println(nameSet);
        
        
        // Natural sorted (LinkedHashMap)
        Map<Worker, Integer> salaries = new LinkedHashMap<>();
        
        salaries.put(new Worker(4, "Misha Pupkin"), 3234);
        salaries.put(new Worker(5, "Fedya Pupkin"), 3139);
        salaries.put(new Worker(1, "Vasya Pupkin"), 3033);
        salaries.put(new Worker(2, "Petya Pupkin"), 2035);
        salaries.put(new Worker(3, "Kolya Pupkin"), 4023);
        
        for (Worker workerKey : salaries.keySet()) {
            System.out.printf("%s ($%d)\n", workerKey, salaries.get(workerKey));
        }
    }
    
}
