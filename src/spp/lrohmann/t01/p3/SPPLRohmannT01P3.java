/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmann.t01.p3;
import java.util.Scanner;
/**
 *
 * @author lisdyrohmann
 */
public class SPPLRohmannT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Lisdy Nadine Rohmann Martínez 513659
     //Carrera: IIS
     //Problema 3
        
    int X1,X2,Y1,Y2;
    double D;
    Scanner Sc= new Scanner (System.in);
        System.out.println("Introduzca el valor de X1");
        X1= (int) Sc.nextDouble();
        System.out.println("Introduzca el valor de X2");
        X2= (int) Sc.nextDouble();
        System.out.println("Introduzca el valor de Y1");
        Y1=(int) Sc.nextDouble();
        System.out.println("Introduzca el valor de Y2");
        Y2= (int) Sc.nextDouble();
        
        D= Math.sqrt (Math.pow((X1-X2),2) + Math.pow((Y1-Y2),2));
        System.out.println("La distancia entre los 2 puntos es:" + D);
        
        
    }
    
}
