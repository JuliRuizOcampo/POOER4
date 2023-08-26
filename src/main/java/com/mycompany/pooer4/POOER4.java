package com.mycompany.pooer4;
import java.util.Scanner;
/**
 *
 * @author JuliRuizOcampo
 */
public class POOER4 {

    public static void main(String[] args) {
        int edJuan, edMama, edAlber, edAna;
        
        /*
        edJuan: edad de Juan, edMama: edad de la mama,
        edAlber: edad de Alberto, edAna: edad de Ana
        */
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan: ");
        edJuan = lector.nextInt();
        
        //Operaciones para encontrar las edades
        edAlber = (edJuan*2)/3; //Calculo de la edad de Alberto
        edAna = (edJuan*4)/3; //Calculo de la edad de Ana
        edMama = edJuan + edAlber + edAna; //Calculo de la edad de la mama
        
        System.out.println("Las edades son: ");
        System.out.println("Juan: " + edJuan);
        System.out.println("Alberto: " + edAlber);
        System.out.println("Ana: " + edAna);
        System.out.println("Mama: " + edMama);
    }
}