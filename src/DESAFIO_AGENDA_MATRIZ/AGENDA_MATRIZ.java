package DESAFIO_AGENDA_MATRIZ;

import java.util.Scanner;

public class AGENDA_MATRIZ {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	String agenda[][] = new String [24][31];
	int dia=0, hora=0;
	int opcao;
	int atividades = 0;

			do {
				System.out.print("Minha agenda \n");
				              
                System.out.print("Digite o numero do dia [1-31] ");
                dia = ler.nextInt();
                ler.nextLine();
                
                dia = dia - 1;
                
                System.out.print("Digite o número da hora [0-23]: ");
                hora = ler.nextInt();
                ler.nextLine();
                
               System.out.print("Digite sua anotação: ");
               agenda[hora][dia] = ler.nextLine();
               
               System.out.print("Deseja continuar? [1] - Sim / [0] - Não: ");
               opcao = ler.nextInt();

            }while(opcao != 0);

			
			for(int i = 0; i < agenda.length; i++)
			{
                for(int j = 0; j < agenda[i].length; j++)
                {
                    if (agenda[i][j] != null)
                    {
                        System.out.print("Minhas anotacoes: "+ (i + 1) +" as "+ (j + 1) +"h : "+ agenda[i][j] +"\n");
                        atividades++;
                    }
                
            }

          
        }
			  System.out.println("Voce tem "+ atividades +" nesse mes.");
	
}
}
