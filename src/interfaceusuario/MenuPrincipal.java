package interfaceusuario;


import java.util.Scanner;

import static interfaceusuario.CommandLineUtils.*;

public class MenuPrincipal {

    public static void main(String[] args) {

        mensagemBemVindo();

        int opcao;
        do {
            exibeMenuPrincipal();
            opcao = lerEntradaInt();
            switch(opcao){
                case 1:
                    //
                    retornaMenuPrincipal();
                    break;
                case 2:
                    //
                    retornaMenuPrincipal();
                    break;
                case 3:
                    //
                    retornaMenuPrincipal();
                    break;
                case 4:
                    //
                    retornaMenuPrincipal();
                    break;
                case 5:
                    //
                    retornaMenuPrincipal();
                    break;
                case 6:
                    //
                    retornaMenuPrincipal();
                    break;
            }
        } while(opcao != 7);
        System.out.println("Obrigado por utilizar o sistema, ate breve");
    }

    public static void mensagemBemVindo() {
        limpaTela();
        System.out.println(" ======================================================");
        System.out.println(" Bem vindo ao sistema de Gerenciamento de Professores ");
        System.out.println(" ======================================================");
        pulaLinha();
        pulaLinha();
        pulaLinha();
        pulaLinha();
        System.out.println("Pressione qualquer tecla para acessar o menu principal...");
        Scanner entrada = new Scanner(System.in);
        entrada.nextLine();
    }

    public static void exibeMenuPrincipal() {
        limpaTela();
        System.out.println("=========================");
        System.out.println("Escolha a opcao desejada: ");
        System.out.println("=========================");
        System.out.println(" 1 - Cadastrar turma");
        System.out.println(" 2 - Cadastrar docentes");
        System.out.println(" 3 - Definir docentes para uma determinada turma");
        System.out.println(" 4 - Listar turmas com seus respectivos assuntos, docentes e semanas");
        System.out.println(" 5 - Listar todos os docentes");
        System.out.println(" 6 - Listar um docente e suas semanas de aula já definidas");
        System.out.println(" 7 - Sair");
    }

    public static void retornaMenuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pressione qualquer tecla para retornar ao menu principal");
        entrada.nextLine();
    }
}