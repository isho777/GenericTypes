/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author Ishmael
 * @param <T>
 */
public class Printer <T>{  //Class takes a parameter. Convension is to use character T as a generic object passed in
    T t;   //generic type T as t instance
    
    public Printer(T t){      //Here the object is then  passed into constructor 
        this.t = t;
    }
    
    public void print(){
        System.out.println(this.t);
    }
}
