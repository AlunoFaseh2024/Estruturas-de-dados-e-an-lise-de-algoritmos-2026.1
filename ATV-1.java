/******************************************************************************
O Localizador de Extremos (Aquecimento com Arrays)

*Objetivo:* Testar iteração simples e condicionais.
*Problema:* Escreva um método em Java que receba um array de inteiros 'int[] vetor' e imprima o maior valor, o menor valor e a média aritmética dos elementos.

Observação: O tamanho do vetor deve ser definido pela pessoa utilizadora.
Preencha o vetor com números gerados aleatóriamente, em formato inteiro.
Não é permitido o uso de bibliotecas para agilizar o processo.
A resposta deve armazenada no github, em repositório público.
Envie o link no campo correspondente abaixo.
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int[] numeros = {93137, 3670, 94184, 389, 52779, 160};
		int troca;
		int soma = 0;
		float media = 0;
		int ligado = 1;
		
	    while (ligado == 1){
	        ligado = 0;
	        
	        for (int i = 0; i < (numeros.length -1);i++){
	            if (numeros[i] > numeros[i+1]){
	                troca = numeros[i];
	                numeros[i] = numeros[i+1];
	                numeros[i+1] = troca;
	                ligado = 1;
	            };
	            
	        }
	    }
	    
	    System.out.println("Array organizado por bubble short:");
	    
	     for (int i = 0; i < (numeros.length);i++){
            System.out.print(numeros[i] + " ");
	     };
	     
	     for (int i = 0; i < (numeros.length);i++){
            soma = numeros[i] + soma;
	        }
        
        media = soma / numeros.length;
        
        System.out.println("\nMédia: " + media);
        System.out.println("Menor valor: " + numeros[0]);
        System.out.println("Maior valor: " + numeros[numeros.length -1]);
        
	}
}
