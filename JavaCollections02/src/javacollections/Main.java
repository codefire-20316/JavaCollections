/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
        
        List<String> numberList = new ArrayList<>();
        
        System.out.println(numberList.add("One"));
        System.out.println(numberList.add("Two"));
        System.out.println(numberList.add("Three"));
        System.out.println(numberList.add("Four"));
        System.out.println(numberList.add("Five"));
        System.out.println(numberList.add("Five"));
        System.out.println(numberList.add("Four"));
        System.out.println(numberList.add("Three"));
        System.out.println(numberList.add("Two"));
        System.out.println(numberList.add("One"));
        
        for (String number : numberList) {
            System.out.println(number);
        }
        
        Set<String> numberSet = new HashSet<>(numberList);
        System.out.println(numberSet);
        
    }
    
}
