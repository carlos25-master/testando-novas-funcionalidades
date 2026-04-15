package novoprojeto;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema!!!");
        System.out.println("Digite o que você quer testar:");
        System.out.println("1 -> jogos");
        System.out.println("2 -> sistema de contas:");
        System.out.println("3 -> printar desenho:");

        int escolha = leia.nextInt();

        switch (escolha) {
            case 1: {
                System.out.println("digite dois valores:");
                int valorJogo = leia.nextInt();
                int valorJogo2 = leia.nextInt();
                int test = jogos.somar(valorJogo, valorJogo2);
                System.out.println("valor enviado:" + test);
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                while (true) {
                    System.out.println("escolha:");
                    System.out.println("cafee");
                    System.out.println("pinguim");
                    System.out.println("velha");
                    leia.nextLine();
                    String escolhaDesenho = leia.nextLine();
                        
                    if (escolhaDesenho.equals("cafee") ||
                            escolhaDesenho.equals("pinguim") ||
                            escolhaDesenho.equals("velha")) {

                        System.out.println("boa escolha!!!");

                        if (escolhaDesenho.equals("cafee")) {
                            cafee();
                        }
                        if (escolhaDesenho.equals("pinguim")) {
                            pinguim();
                        } else
                            velha();
                        break;
                    }

                }
                break;
            }

        }

        leia.close();

    }

    private static void velha() {
        for (int val = 0; val < 3; val++) {

            if (val <= 1) {
                System.out.println("___|___|___");
            } else {
                System.out.println("   |   |   ");
            }

            

        }
System.out.println("");
    }

    public static void cafee() {
        System.out.println("        {  }");
        System.out.println("       __{  }__");
        System.out.println("      /        \\  _");
        System.out.println("     |          |/ )");
        System.out.println("     |  JAVA    | /");
        System.out.println("     |          |/");
        System.out.println("      \\________/");
        System.out.println("    __________");
        System.out.println("    \\_________\\");
        System.out.println("\n    [ COFFEE IS LIFE ]");
    }

    public static void pinguim() {
        System.out.println("          .88888888:.");
        System.out.println("        .88888888888888.");
        System.out.println("        888  '88'  888");
        System.out.println("        88    88    88");
        System.out.println("        '88  88  88'");
        System.out.println("         '88888888'");
        System.out.println("         .88888888.");
        System.out.println("        .8888888888.");
        System.out.println("       .888888888888.");
        System.out.println("       888  8888  888");
        System.out.println("       888  8888  888");
        System.out.println("      .888  8888  888.");
        System.out.println("   _..8888  8888  8888.._");
        System.out.println(" (  '  888888888888  '  )");
        System.out.println("  '---'            '---'");
        System.out.println("\n    [ TUX - LINUX MASCOT ]");
    }

}
