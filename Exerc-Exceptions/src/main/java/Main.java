import br.inatel.cdg.exceptions.Checked;
import br.inatel.cdg.exceptions.UnChecked;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fetin fetin = new Fetin();

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome e nota do projeto: ");

        boolean flag = false;

        String nome;
        double nota;

        while (!flag) {
            System.out.println("1 - Salvar novo projeto");
            System.out.println("2 - Sair");

            int op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();

                    System.out.println("Entre com o nome e a nota do projeto: ");
                    nome = sc.nextLine();
                    nota = sc.nextInt();

                    if (nota < 0) {
                        flag = true;
                        break;
                    }

                    sc.nextLine();

                    try {
                        fetin.adicionaProjeto(nome, nota);
                        System.out.println("Projeto cadastrado");
                        System.out.println("-----------------------------------");
                    } catch (Checked e) {
                        System.out.println(e.getMessage());
                    } catch (UnChecked e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    flag = true;
                    break;
            }
        }

        System.out.println("Chegou ao final da Main!");
    }
}
