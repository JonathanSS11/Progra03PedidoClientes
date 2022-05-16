/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra03pedidoclientes;

/**
 *
 * @author HP
 */
public class Progra03PedidoClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Convertir de string a numero");
        String numCadena = "1";
        int numEntero = Integer.parseInt(numCadena);
        System.out.println(numEntero);
        
        System.out.println("Convertir de numero a string");
        numCadena= String.valueOf(numEntero);
        System.out.println(numCadena);
        
        
    }
    
}
