/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author Ishmael
 */
public class GenericsMain {                   //Set any Type and print it
    public static void main(String[] args) {
        Printer<Double>  p1 = new Printer<>(1234.5678) ;
        Printer<String>  p2 = new Printer<>("Hello") ;
        p1.print();
        p2.print();
    }
}
