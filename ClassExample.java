/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject3;

/**
 *
 * @author TAU
 */
public class ClassExample {
    String name, bff;
    int age, affinity;
    double grade, money;
    ClassExample.bff;
    
    public ClassExample(String name) {
        this.name = name;
        this.age = age;
        this.affinity = 0;
        this.grade = 2.50;
        this.money = 500;
    }
    
    public ClassExample (String name, int age) {
        
    }
    
    public void introduce() {
        System.out.printf("Hi my name is %s. %n",name);
    }
    
    public void study(int hours){
        grade -= hours * 0.05;
    }
    
    public double getGrade() {
        return grade;
    }
    
    public void talk(ClassExample other) {
        affinity += 1;
        other.affinity += 1;
    }
}
