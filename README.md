# 🚀 Projeto AstroHabit

## 📝 Motivação do Projeto
O **AstroHabit** nasceu da análise dos rigorosos protocolos de saúde e performance utilizados por astronautas na Estação Espacial Internacional (ISS). No espaço, fatores como a alta carga cognitiva, o isolamento e a desregulação do ciclo circadiano (devido ao nascer do sol a cada 90 minutos) são desafios constantes que impactam a missão.

Nosso propósito é trazer essa tecnologia de "estação espacial" para o dia a dia na Terra. O AstroHabit atua como um assistente pessoal, aplicando protocolos espaciais para melhorar os hábitos, regular o sono e aumentar o foco dos usuários através de ferramentas práticas.

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
