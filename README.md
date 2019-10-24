# exercicios-aplicacoes-locais-java
Desenvolva aplicações locais relacionadas abaixo, conforme modelos desenvolvidos em sala de aula, obedecendo os princípios da orientação objeto, dividindo-os em no mínimo três classes (principal, interface e implementação).

Atente para os prazos:

Alunos que não participaram do Viasoft Connect deverão entregar a atividade até o final do dia 10/09.
Alunos que participarem do Viasoft Connect, poderão entregar até o final do dia 13/09. Deve ser anexada junto a entrega um comprovação de participação do evento (credencial, foto...)
Entregue apenas um projeto, compactado e dois pacotes (um para cada exercício)

Exercício 1

Faça um programa que converte um número do método chamado "A Curious Method" (ACM). A notação ACM usa os mesmos dígitos da notação decimal, isto é, de 0 a 9. Para converter um número A da notação ACM para decimal você deve adicionar k termos, sendo que k é o número de dígitos de A (na notação ACM). O valor do i-ésimo digito(ai), contando da direita para a esquerda, é ai x i!. Por exemplo, o número 719ACM é equivalente ao número 53 em decimal, fazendo: 7 x 3! + 1 x 2! + 9 x 1! = 53. Outro exemplo, 15ACM = 7 em decimal, 110ACM = 8 em decimal. 

lembre-se que: ! = fatorial do número.

Deve ser implementada a interface abaixo.

        public interface IConversorACM {

               public int convertACMtoDEC(int a);

    }

Exercício 2
Faça um programa para pegar a hora ou a data do computador. Deve ser implementada a interface abaixo.


public interface IHoraCerta {

   public String dataAtual();

   public String horaAtual();

}

       O formato da String de retorno de dever ser:

       - Para a data: DD/MM/AAAA  (ex: 10/09/2019)

       - Para a hora: HH:MM:SS    (ex: 19:21:04)

