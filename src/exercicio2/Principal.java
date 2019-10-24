/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author Maicon
 */
public class Principal {

   int numero = 0;
   IHoraCerta objeto;

   public Principal() {
      executar();
   }

   private void executar() {
      objeto = (IHoraCerta) new ImplementaHoraCerta();

      System.out.println("Data Atual : " + objeto.dataAtual());
      System.out.println("Hora Atual : " + objeto.horaAtual());

   }

   public static void main(String[] args) {
      Principal start = new Principal();
   }

}
