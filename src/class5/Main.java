/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        Cuenta.global=50;
        Cuenta cuenta1= new Cuenta(1012, 1234, "Magdalena Sanchez", 0);
        Cuenta cuenta2= new Cuenta(1013, 9876, "Joselito Perez", 500000);
        
        cuenta1.consignar(100000);
        System.out.println("Saldo " + cuenta1.getSaldo());
        
        
        System.out.println("Ingrese la nueva clave: ");
        int clave = lectura.nextInt();
        
        System.out.println("Ingrese dueno: ");
        String dueno = lectura.next();
        
        cuenta2.cambiarClave(clave);
        System.out.println("Saldo " + cuenta2.consultarSaldo());
        
        
    }
}
