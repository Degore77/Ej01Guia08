/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01guia08.servicios;

import ej01guia08.Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author demia
 */
public class CuentaBancariaServicio {
    
    private Scanner leer = new Scanner(System.in);
    
    CuentaBancaria cb1 = new CuentaBancaria();
    
    public void crearCuenta(){
        System.out.println("Ingrese el numero de cuenta");
        cb1.numeroCuenta = leer.nextInt();
        
        System.out.println("Ingrese su DNI");
        cb1.dniCliente = leer.nextLong();
        
        System.out.println("Ingrese su saldo actual");
        
        cb1.saldoActual = leer.nextDouble();
        
        
        
    }
    
    public void menu(){
        
        int selec=0;
        do {
            System.out.println("");
            System.out.println("MENU Cuenta Bancaria");
            System.out.println("");
            System.out.println("1) Ingresar dinero");
            System.out.println("2) Retirar dinero");
            System.out.println("3) Extraccion rapida (solo el 20%)");
            System.out.println("4) Consultar saldo");
            System.out.println("5) Consultar Datos");
            System.out.println("6) Salir");
            selec = leer.nextInt();
            
            switch (selec){
                case 1:
                    cb1.saldoActual = ingresar(cb1.saldoActual);
                    
                    break;
                case 2:
                    cb1.saldoActual = retirar(cb1.saldoActual);
                    break;
                case 3:
                    cb1.saldoActual = extrRapida(cb1.saldoActual);
                    break;
                case 4:
                    consuSaldo(cb1.saldoActual);
                    break;
                case 5:
                    consuDatos(cb1.numeroCuenta,cb1.dniCliente,cb1.saldoActual);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
                
            }
            
        } while (selec!=6);
        
        
        
    }
    
    public double ingresar(double saldo){
        System.out.println("INGRESAR DINERO");
        System.out.println("Cuanto dinero quiere ingresar?");
        saldo+= leer.nextDouble();
        
        return saldo;
    }
    
    public double retirar(double saldo){
        System.out.println("RETIRAR DINERO");
        System.out.println("Cuanto dinero va a retirar?");
        double retiro = leer.nextDouble();
        if (retiro>saldo) {
            System.out.println("No hay suficiente dinero!!");
            System.out.println("Ud retira los $"+saldo+" restantes");
            saldo-=saldo;
            
        }else{
            System.out.println("Muy bien, se le restara $"+retiro+" de su saldo");
            saldo-=retiro;
        }
        return saldo;
    }
    
    public double extrRapida(double saldo){
        System.out.println("EXTRACCION RAPIDA");
        System.out.println("Cuanto dinero va a retirar? Solo puede extraer hasta el 20%");
        double retiro=leer.nextDouble();
        do {
            if (retiro>(saldo*0.2)) {
            System.out.println("ERROR, es mas del 20%!!");
            System.out.println("Ingrese le monto nuevamente");
            retiro=leer.nextDouble();
            
        }else{
                System.out.println("Monto correcto no supera el 20%");
                saldo-=retiro;
                break;
            }
            
        } while (true);
        return saldo;
        
        
    }
    
    public void consuSaldo(double saldo){
        System.out.println("Su saldo es: $"+saldo);
    }
    
    public void consuDatos(int numero, long dni, double saldo){
        System.out.println("Su numero de cuenta es:"+numero);
        System.out.println("Su DNI es:"+dni);
        System.out.println("Su saldo es: $"+saldo);
    }
 
    
    
}
