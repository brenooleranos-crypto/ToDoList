/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ToDoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //
        import java.util.Scanner;

 public class ListaTarefas{

    public static void main(String[] args)}

        Scanner scanner = new Scanner(System.in);

        String[] tarefas = new String[10];
        boolean[] concluidas = new boolean[10];

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n=== LISTA DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Excluir tarefa");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    int posicao = -1;

                    // Procura uma posição disponível
                    for (int i = 0; i < 10; i++) {
                        if (tarefas[i] == null) {
                            posicao = i;
                            break;
                        }
                    }

                    if (posicao == -1) {
                        System.out.println("A lista de tarefas está cheia!");
                    } else {
                        System.out.print("Digite a tarefa: ");
                        tarefas[posicao] = scanner.nextLine();
                        concluidas[posicao] = false;

                        System.out.println("Tarefa adicionada com sucesso!");
                    }
                    break;

                case 2:
                    boolean existeTarefa = false;

                    System.out.println("\n=== MINHAS TAREFAS ===");

                    for (int i = 0; i < 10; i++) {

                        if (tarefas[i] != null) {
                            existeTarefa = true;

                            if (concluidas[i]) {
                                System.out.println((i + 1) + " - [X] " + tarefas[i]);
                            } else {
                                System.out.println((i + 1) + " - [ ] " + tarefas[i]);
                            }
                        }
                    }

                    if (!existeTarefa) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o número da tarefa que deseja concluir: ");
                    int numeroConcluir = scanner.nextInt();

                    if (numeroConcluir < 1 || numeroConcluir > 10 ||
                        tarefas[numeroConcluir - 1] == null) {

                        System.out.println("Tarefa inválida!");

                    } else {
                        concluidas[numeroConcluir - 1] = true;
                        System.out.println("Tarefa concluída com sucesso!");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número da tarefa que deseja excluir: ");
                    int numeroExcluir = scanner.nextInt();

                    if (numeroExcluir < 1 || numeroExcluir > 10 ||
                        tarefas[numeroExcluir - 1] == null) {

                        System.out.println("Tarefa inválida!");

                    } else {
                        tarefas[numeroExcluir - 1] = null;
                        concluidas[numeroExcluir - 1] = false;

                        System.out.println("Tarefa excluída com sucesso!");
                    }
                    break;

                case 5:
                    System.out.println("Programa encerrado. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
    }
    

