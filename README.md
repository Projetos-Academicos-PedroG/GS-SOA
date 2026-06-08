# 🚀 Projeto AstroHabit

## 📝 Motivação do Projeto
O AstroHabit nasceu da análise dos rigorosos protocolos de saúde e performance utilizados por astronautas na Estação Espacial Internacional (ISS). No espaço, fatores como a alta carga cognitiva, o isolamento e a desregulação do ciclo circadiano são desafios constantes.

Este sistema foi idealizado para ser uma representação de um produto real. A proposta atual é consolidar os protocolos de foco (Modo Órbita) e regulação de sono (Ciclo Circadiano) como pilares de uma solução mais ampla.

Visão de Futuro: O AstroHabit está estruturado para evoluir e integrar, em versões futuras, uma Inteligência Artificial de Suporte. Esta IA atuará como um copiloto do usuário, analisando padrões de produtividade e fadiga para oferecer recomendações personalizadas em tempo real, ajustando a rotina de forma dinâmica e proativa, transformando dados brutos em hábitos saudáveis de alta performance.

## 🧠 Funcionalidades Principais
* **Modo Órbita (Foco):** Protocolo de retenção de notificações para evitar interrupções durante tarefas críticas, garantindo foco total.
* **Protocolo NASA TLX:** Sistema de medição de carga mental que ajuda o usuário a monitorar sua exaustão cognitiva, prevenindo o esgotamento (burnout).
* **Ciclo Circadiano:** Educativo sobre os efeitos da luz azul e auxílio na regulação do ciclo de sono, comparando a experiência do usuário com os desafios enfrentados pelos astronautas.

## 🛠 Critérios Técnicos Aplicados
O projeto foi desenvolvido em **Java** utilizando os conceitos fundamentais de POO:

* **POO & Modelagem:** Uso de classes abstratas (`AtividadeEspacial`) e herança (`TarefaFoco`, `RegistroSono`) para estruturação do domínio.
* **Tratamento de Exceções:** Implementação de `CargaMentalExcedidaException` para tratar cenários críticos de estresse sem interrupção abrupta do sistema.
* **Lógica de Fluxo e Datas:** Manipulação precisa de `LocalDateTime` da API do Java para cálculos de ciclos de sono.
* **DTO (Data Transfer Object):** Estrutura organizada para garantir a segurança e organização dos dados entre camadas.
* **Modularização:** O código está organizado em pacotes (`domain`, `dto`, `exceptions`) para garantir organização e manutenibilidade.

## 💻 Como rodar
1. Certifique-se de ter o **JDK 17 ou superior** instalado.
2. Clone o repositório ou baixe os arquivos.
3. Abra o projeto no **IntelliJ IDEA**.
4. Certifique-se de que o sistema de build **Maven** está carregado.
5. Execute a classe `Main.java` localizada no pacote `com.astrohabit`.

## 👨‍💻 Autor
Andrey Nagata - Rm555339
Henrique Soubhia - Rm554493
Oliver Trindade - Rm554954
Pedro Gutierre - Rm555445
William Feng - Rm555132
