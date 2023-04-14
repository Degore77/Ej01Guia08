/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01guia08;

import ej01guia08.servicios.CuentaBancariaServicio;



/**
 *
 * @author demia
 */
public class Ej01Guia08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicio cbs1 = new CuentaBancariaServicio();
        
        cbs1.crearCuenta();
        cbs1.menu();
        
        
    }
    
}
