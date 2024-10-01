import java.util.Scanner;

public class Quiz {
    public Quiz(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("UNIFAN ");
        System.out.println("ALUNO: GABRIEL HENRIQUE ALVES SANTIAGO E SILVA");
        System.out.println("PROFESSOR: BRENNO PIMENTA");
        System.out.println(" ESN1 ");
        System.out.println("RESPONDA ESSAS 15 PERGUNTAS CORRETAMENTE, SOBRE ASSUNTOS GERAIS.");
        System.out.println("  ");

        Quiz q1 = new Quiz(
                "",
                "A) ",
                "B) ",
                "C) ",
                "D) ",
                "E) ",
                ""
        );

        Quiz q2 = new Quiz(
                "",
                "A) ",
                "B) ",
                "C) ",
                "D) ",
                "E) ",
                ""
        );

        Quiz[] questoes = {q1, q2};

        int acertos = 0;
        int erros = 0;
        int i = 0;

        for (Quiz questaoAtual : questoes) {
            questaoAtual.escrevaquestao();

            System.out.print("Digite a sua resposta (A/B/C/D/E): ");
            String respostaUsuario = scanner.nextLine().toUpperCase();

            if (questaoAtual.isCorreta(respostaUsuario)) {
                acertos++;
            } else {
                erros++;
            }
        }

        System.out.println("Quiz finalizado!");
        System.out.println("Número de acertos: " + acertos);
        System.out.println("Número de erros: " + erros);

        scanner.close();
    }
}












