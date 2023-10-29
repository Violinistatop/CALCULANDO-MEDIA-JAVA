package CalcularNota;

import java.util.Scanner;



public class MediaDeNota {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Crindo os 3 Alunos 
		
		 Aluno aluno1 = new Aluno();
	     Aluno aluno2 = new Aluno();
	     Aluno aluno3 = new Aluno();
	        
	     //insira a nota do Aluno 1
	     
	     System.out.println("Informe as notas para o primeiro aluno:");
	     
	     aluno1.setNota1(scanner.nextDouble());
	     aluno1.setNota2(scanner.nextDouble());
	     aluno1.setNota3(scanner.nextDouble());
	     
	     
	     System.out.println("Informe as notas do Segundo Aluno:");
	     
	     aluno2.setNota1(scanner.nextDouble());
	     aluno2.setNota2(scanner.nextDouble());
	     aluno2.setNota3(scanner.nextDouble());
	     
	     System.out.println("Informe as notas do Terceiro Aluno:");
	     
	     aluno3.setNota1(scanner.nextDouble());
	     aluno3.setNota2(scanner.nextDouble());
	     aluno3.setNota3(scanner.nextDouble());
	     
	     //metodo calcularMedia
	     double mediaAluno1 = aluno1.calcularMedia();
	     double mediaAluno2 = aluno2.calcularMedia();
	     double mediaAluno3 = aluno3.calcularMedia();
	     
	     System.out.println("Média do primeiro aluno: " + mediaAluno1);
	     System.out.println("Média do segundo aluno: " + mediaAluno2);
	     System.out.println("Média do terceiro aluno: " + mediaAluno3);

	        // Fecha o Scanner
	     
	        scanner.close();
	        
	    }
	
	}
class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;

    // Getters e Setters para as notas
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    // Método para calcular a média das notas
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
}


