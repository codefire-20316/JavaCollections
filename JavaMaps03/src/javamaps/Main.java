/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamaps;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Worker, Integer> salaries = new HashMap<>();
        
        salaries.put(new Worker(4, "Misha Pupkin"), 3234);
        salaries.put(new Worker(5, "Fedya Pupkin"), 3139);
        salaries.put(new Worker(1, "Vasya Pupkin"), 3033);
        salaries.put(new Worker(2, "Petya Pupkin"), 2035);
        salaries.put(new Worker(3, "Kolya Pupkin"), 4023);
        
        for (Worker workerKey : salaries.keySet()) {
            System.out.printf("%s\n$%d\n", workerKey, salaries.get(workerKey));
        }
        
        System.out.println(salaries.containsKey(new Worker(5, "Fedya Pupkin")));
        System.out.println(salaries.put(new Worker(5, "Fedya Pupkin"), 1000));
        
        System.out.println(salaries.keySet());
        System.out.println(salaries.values());
    }
    
}
