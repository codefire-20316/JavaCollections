/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

/**
 *
 * @author human
 */
public class Worker {
    
    private int id;
    private String fullName;
    private double salary;

    public Worker(int id, String fullName, double salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode()");
        return id;//super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals()");
        
        if (obj == null) {
            return false;
        }
        
        if (obj.getClass() == Worker.class) {
            Worker worker = (Worker)obj;
            
            if (worker.id == this.id) {
                return true;
            }
        }
        
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", fullName=" + fullName + '}';
    }
}
