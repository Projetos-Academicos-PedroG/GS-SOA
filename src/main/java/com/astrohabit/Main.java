package com.astrohabit;

import com.astrohabit.domain.RegistroSono;
import com.astrohabit.domain.TarefaFoco;
import com.astrohabit.exceptions.CargaMentalExcedidaException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sistemaAtivo = true;

        List<String> tarefasEmAndamento = new ArrayList<>();

        exibirApresentacao();

        while (sistemaAtivo) {
            System.out.println("\n=========================================");
            System.out.println("   PAINEL DE CONTROLE : ASTROHABIT");
            System.out.println("=========================================");
            System.out.println("1. Iniciar Tarefa (Ativar Modo Órbita)");
            System.out.println("2. Finalizar Tarefa e Avaliar Desgaste");
            System.out.println("3. Configurar Ciclo Circadiano (Sono)");
            System.out.println("4. Desligar Sistema");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nQual tarefa você vai iniciar agora? ");
                    String novaTarefa = scanner.nextLine();

                    // Armazena a tarefa na lista
                    tarefasEmAndamento.add(novaTarefa);

                    System.out.println("\n[MODO ÓRBITA ATIVADO]");
                    System.out.println("Tarefa registrada: '" + novaTarefa + "'.");
                    System.out.println("Notificações silenciadas. Foco total para evitar atrasos na missão.");
                    break;

                case 2:
                    if (tarefasEmAndamento.isEmpty()) {
                        System.out.println("\n[AVISO] Você não tem nenhuma tarefa em andamento. Inicie uma na Opção 1 primeiro.");
                        break;
                    }

                    System.out.println("\nTarefas em andamento no momento: " + tarefasEmAndamento);
                    System.out.print("Digite o nome exato da tarefa que você acabou de finalizar: ");
                    String tarefaFinalizada = scanner.nextLine();

                    boolean tarefaExiste = tarefasEmAndamento.stream().anyMatch(t -> t.equalsIgnoreCase(tarefaFinalizada));

                    if (tarefaExiste) {
                        System.out.println("\n--- PROTOCOLO NASA TLX ---");
                        System.out.print("De 1 a 10, quão desgastante mentalmente foi essa tarefa? ");
                        int notaTlx = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Explique brevemente por que foi esse nível de desgaste: ");
                        String explicacao = scanner.nextLine();

                        tarefasEmAndamento.removeIf(t -> t.equalsIgnoreCase(tarefaFinalizada));

                        System.out.println("\n[FEEDBACK DO SISTEMA]");
                        if (notaTlx >= 1 && notaTlx <= 4) {
                            System.out.println("Atividade sob controle. Ótimo gerenciamento de energia, continue assim!");
                        } else if (notaTlx >= 5 && notaTlx <= 8) {
                            System.out.println("Carga moderada/alta. Não exagere tanto, lembre-se de intercalar com pausas de 5 minutos!");
                        }

                        try {
                            TarefaFoco foco = new TarefaFoco(tarefaFinalizada, notaTlx, true, explicacao);
                            foco.exibirResumo();
                        } catch (CargaMentalExcedidaException e) {
                            System.out.println("\n[ALERTA CRÍTICO] " + e.getMessage());
                            System.out.println("--> Ação Recomendada: Bloqueio temporário. Risco de burnout (exaustão extrema).");
                        }
                    } else {
                        System.out.println("\n[ERRO] Tarefa não encontrada. Certifique-se de digitar o nome corretamente.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- CICLO CIRCADIANO E LUZ AZUL ---");
                    System.out.println("Sabia que na Estação Espacial os astronautas veem o nascer do sol a cada 90 minutos?");
                    System.out.println("Isso confunde o cérebro deles. Para resolver, a NASA usa luzes artificiais específicas");
                    System.out.println("para simular o dia e a noite da Terra, ajudando-os a dormir.");
                    System.out.println("Aqui na Terra, a luz azul do seu celular/PC tem o mesmo efeito negativo: ela engana seu");
                    System.out.println("cérebro achando que é dia, o que destrói a sua melatonina (hormônio do sono).");
                    System.out.println("-----------------------------------");

                    System.out.print("\nDeseja ativar o Filtro de Luz Azul do seu aparelho agora? (S/N): ");
                    String respostaFiltro = scanner.nextLine().toUpperCase();
                    boolean ativouFiltro = respostaFiltro.equals("S");

                    if (ativouFiltro) {
                        System.out.println("[SISTEMA] Filtro ativado! Sua tela agora emitirá luz quente para não atrapalhar seu sono.");
                    }

                    System.out.print("Quantas horas você dormiu na última noite? ");
                    int horasDormidas = scanner.nextInt();
                    scanner.nextLine();

                    LocalDateTime acordar = LocalDateTime.now();
                    LocalDateTime dormir = acordar.minusHours(horasDormidas);

                    RegistroSono sono = new RegistroSono(dormir, acordar, ativouFiltro);
                    sono.exibirResumo();
                    break;

                case 4:
                    System.out.println("\nDesligando Estação Terra. Bom descanso!");
                    sistemaAtivo = false;
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void exibirApresentacao() {
        System.out.println("==========================================================");
        System.out.println("        BEM-VINDO AO PROJETO ASTROHABIT");
        System.out.println("==========================================================");
        System.out.println("Por que os astronautas seguem protocolos tão rígidos no espaço?");
        System.out.println("Na Estação Espacial Internacional (ISS), eles lidam com alta");
        System.out.println("carga cognitiva e desregulação do ciclo claro/escuro.");
        System.out.println("");
        System.out.println("Nosso propósito aqui é mostrar que essas ferramentas são");
        System.out.println("essenciais para nós, na Terra. Hoje, muitas pessoas têm");
        System.out.println("dificuldade para dormir e poderiam usar filtros de luz azul");
        System.out.println("para auxiliar, igual aos astronautas.");
        System.out.println("");
        System.out.println("Além disso, o delay das notificações é algo muito útil");
        System.out.println("para não desfocar das atividades atuais do seu dia a dia.");
        System.out.println("");
        System.out.println("A ideia principal é que este sistema funcione como um");
        System.out.println("assistente pessoal para o seu dia a dia, aplicando esses");
        System.out.println("protocolos para transformar e melhorar os seus hábitos!");
        System.out.println("==========================================================\n");
        System.out.println("Pressione ENTER para iniciar o sistema...");
        try { System.in.read(); } catch (Exception e) {}
    }
}