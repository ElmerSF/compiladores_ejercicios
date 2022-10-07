/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compiladores_ejercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author elmer
 */
public class Compiladores_ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        ValidaSintaxis();
// TODO code application logic here
    }
    
    

public static void ValidaSintaxis() 
 {
 Scanner leer = new Scanner(System.in);
 String correo;
 System.out.print("Escriba la dirección de correo: ");
 correo = leer.nextLine();
 Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[AZa-z0-9]+)*(\\.[A-Za-z]{2,})$");
 Matcher mat = pat.matcher(correo);
 if(mat.find()){
 System.out.println("Correo Válido");
 }else{
 System.out.println("Correo No Válido");
 }
 }
 } 