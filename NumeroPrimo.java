/*Faça	um	programa que receba	um	número inteiro maior que	1,	verifique	se	o	número
fornecido é	primo	ou não	e	mostre	a	mensagem	de	número	primo	ou número não
primo,	junto	com	o	número.	(Número	primo	é quando é divisível apenas por	1	e	por ele
mesmo)*/
import java.util.Scanner;

public class NumeroPrimo{
    public static void main(String[] args){
        double numero=0;
        boolean ehPrimo=true;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é primo:");
        numero= input.nextDouble();

        for(int i=2; i<numero; i++){
            if (numero % i == 0){
                ehPrimo=false;
            }  
        }  
        if(ehPrimo){
            System.out.println("É primo!");
        }else{
            System.out.println("Não é primo!");
        }
    }
}	