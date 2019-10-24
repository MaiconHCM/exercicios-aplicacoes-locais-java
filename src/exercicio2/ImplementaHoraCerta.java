/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Calendar;

/**
 *
 * @author Maicon
 */
public class ImplementaHoraCerta implements IHoraCerta {

   @Override
   public String dataAtual() {
      Calendar data = Calendar.getInstance();
      return pad(String.valueOf(data.get(Calendar.DAY_OF_MONTH)), 2) + '/' + pad(String.valueOf(data.get(Calendar.MONTH)+1), 2) + '/' + String.valueOf(data.get(Calendar.YEAR));
   }

   @Override
   public String horaAtual() {
      Calendar data = Calendar.getInstance();
      return pad(String.valueOf(data.get(Calendar.HOUR_OF_DAY)),2) + ':' +  pad(String.valueOf(data.get(Calendar.MINUTE)),2) + ':' + pad(String.valueOf(data.get(Calendar.SECOND)),2);
   }

   private String pad(String value, int size) {
      String result = value;

      while (result.length() < size) {
         result = '0' + result;
      }

      return result;
   }

}
