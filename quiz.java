package quiz;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        //Declaração de variáveis

        Scanner ler = new Scanner(System.in);
        String continua;
        int cont;
        int contp;
        String nome;
        //Cabeçalho

        Cabeçalho head = new Cabeçalho();
        head.aluno = "Gabriel Henrique Alves Santiago e Silva";
        head.professor = "Brenno";
        head.facul = "UNIFAN";
        head.materia = "Lógica de programação e algoritmos 2";
        head.printhead();
        //fim cabeçalho












