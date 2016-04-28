/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.HashSet;
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
        Set<Worker> workerSet = new HashSet<>();
        workerSet.add(new Worker(1, "Vasya Pupkin", 2000.));
        workerSet.add(new Worker(2, "Vasya Pupkin", 2000.));
        workerSet.add(new Worker(3, "Vasya Pupkin", 2000.));
        workerSet.add(new Worker(1, "Vasya Pupkin", 2000.));
        workerSet.add(new Worker(1, "Vasya Pupkin", 2000.));
        
//        System.out.println(workerSet.size());

        System.out.println(workerSet);
        
    }
    
}
