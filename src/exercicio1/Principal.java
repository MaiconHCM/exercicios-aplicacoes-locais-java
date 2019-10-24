/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author Maicon
 */
public class Principal {

    int numero = 0;        
    IConversorACM objeto;

    public Principal() {
        executar();
    }

    private void executar() {
        objeto=(IConversorACM)new ImplementaConversorACM();
        
        System.out.println(objeto.convertACMtoDEC( 15));
         
    }
    public static void main(String[] args) {
      Principal start = new Principal();
   }
    
}
