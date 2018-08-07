/*Faça	um	programa que receba	as	informações	de	uma turma	e	as	guarde em	um	array,	
sendo que para cada aluno receberá	as	seguintes informações:	duas notas,	número	de	
aulas assistidas	(Considere	o	número	de	aulas ministradas	=	18).	Calcule	e	mostre	a	
média	final	deste aluno	e	diga	se	ele foi aprovado ou reprovado.	Para	que	um	aluno seja
aprovado ele precisa ter uma média igual ou maior que	6	e	ter	no	mínimo	75%	de	
frequência.	*/

import java.util.Scanner;

public class AulaAlunos{
    public static void main(String[] args){
        double [][] nota= new double[6][2];
        double [] mediaAlunos = new double[6];
        double [] frequencia = new double[6];


        Scanner input = new Scanner(System.in);
        for(int i=0;i<6;i++){
            for(int j=1;j<3;j++){
                System.out.println("Digite a nota "+j+" do aluno "+(i+1));
                nota[i][j-1]= input.nextDouble();  
            }
            mediaAlunos[i] = (nota[i][0]+nota[i][1])/2;
            System.out.println("Digite a presença do aluno"+(i+1)+" (em numero de aulas: MAX 18)");
            frequencia[i] = input.nextInt(); 
            frequencia [i] = (frequencia [i]*100)/18; 

            if(mediaAlunos[i]>=6 && frequencia>=75){
                System.out.println("Aluno "+(i+1)+" foi aprovado!");
                System.out.println("Frequencia:" + frequencia);
            }else if(mediaAlunos[i]>=3&&mediaAlunos[i]<6 && frequencia>=75){
                System.out.println("Aluno "+(i+1)+" está em recuperação!");
                System.out.println("Frequencia:" + frequencia);
            }else{
                System.out.println("Aluno "+(i+1)+" está reprovado!");
                System.out.println("Frequencia:" + frequencia);
            }
        }
       
    }
}