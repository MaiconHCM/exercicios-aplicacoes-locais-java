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
public class ImplementaConversorACM implements IConversorACM {

   @Override
   public int convertACMtoDEC(int a) {
      String numACM = Integer.toString(a);
      int numCasas = numACM.length();

      int numDecimal = 0;
//arriba el mexico
      for (int i = 0; i < numACM.length(); i++) {

         int fatorado = fatorar(numCasas);
         numCasas--;
         //O HOMEM MACACO QUE NÃO TEM ALMA E NEM CORAÇÃO
         char caracterio = numACM.charAt(i);
         numDecimal = (Integer.parseInt(String.valueOf(caracterio)) * fatorado) + numDecimal;
         //PULANDO TÃO ALTO, TENTANDO ME PEGAR....
      }
      return numDecimal;
   }
//SE ESSE CARA ME PEGA, ELE VAI, ME MATAR

   private int fatorar(int a) {
      int retorno;
      if (1 >= a) {
         retorno = 1;
      } else {
         retorno = a * fatorar(a - 1);
      }
      return retorno;
   }

}
