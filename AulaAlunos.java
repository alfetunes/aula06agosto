/*Faça	um	programa que receba duas notas	de	seis alunos	(o	usuário digita	as	notas),	
calcule	e	mostre:	
0 a	média aritmética	das	notas	de	cada aluno
0 se	o	aluno está reprovado ou aprovado	(de	6	para cima)	ou	se	foi para	rec	(entre	3	e	
6)	
0 o	total	de	alunos aprovados
0 o	total	de	alunos reprovados
0 o	total	de	alunos	de	rec	
0 a	média	da	classe*/
import java.util.Scanner;

public class AulaAlunos{
    public static void main(String[] args){
        double [][] nota= new double[6][2];
        double [] mediaAlunos = new double[6];
        int totalAprovados=0;
        int totalReprovados=0;
        int totalRec=0;
        double mediaClasse=0;


        Scanner input = new Scanner(System.in);
        for(int i=0;i<6;i++){
            for(int j=1;j<3;j++){
                System.out.println("Digite a nota "+j+" do aluno "+(i+1));
                nota[i][j-1]= input.nextDouble();  
            }
            mediaAlunos[i] = (nota[i][0]+nota[i][1])/2;
            mediaClasse=mediaClasse+mediaAlunos[i];
            if(mediaAlunos[i]>=6){
                System.out.println("Aluno "+(i+1)+" foi aprovado!");
                totalAprovados++;    
            }else if(mediaAlunos[i]>=3&&mediaAlunos[i]<6){
                System.out.println("Aluno "+(i+1)+" está em recuperação!");
                totalRec++; 
            }else{
                System.out.println("Aluno "+(i+1)+" está reprovado!");
                totalReprovados++;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("******************************************************************");
        System.out.println("Média da classe: "+(mediaClasse/6));
        System.out.println("Alunos aprovados: "+totalAprovados);
        System.out.println("Alunos em REC: "+totalRec);
        System.out.println("Alunos reprovados: "+totalReprovados);
    }
}