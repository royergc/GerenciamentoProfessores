# Projeto de Férias 2 - Sistema de Gerenciamento de Professores

Esse sistema desenvolvido em Java visa implementar um “Sistema de Gerenciamento de Professores”.
O tema é baseado na ideia de que uma determinada escola deseja realizar o controle dos seus professores.
O sistema é um projeto educacional e visa praticar os seguintes conceitos básicos da linguagem Java:

- Classes e Objetos;
- Heranças;
- Polimorfismo;
- Interfaces.

### Requisitos

Atualmente, os conteúdos são divididos por semanas onde um ou dois professores podem ministrar as aulas e cada turma tem duração de 12 meses (52 semanas).      
Sempre que dois professores dividirem os conteúdos da semana, um professor ficará com as segundas e terças e o outro com as quartas, quintas e sextas.      
Para isso, deve-se desenvolver um sistema que faça a gestão das turmas e dos professores.     
Lembrando que as turmas podem ter conteúdos iguais, por exemplo:
- Turma A na semana do dia 03/01/2022 até 07/01/2022 terá C#
- Turma B na semana do dia 03/01/2022 até 07/01/2022 terá C#     

A turma possui os seguintes atributos:
- Identificação
- Nome da turma
- Quantidade de alunos
- Assuntos (poderá ser um array ou uma classe)
- Data de início das aulas

Os docentes possuem os seguintes atributos:
- Identificação
- Nome do docente
- Turma atendida atualmente

O sistema também deverá armazenar um histórico das turmas, informando qual docente ministrou as aulas e quais semanas.      

O sisetema deverá apresentar o seguinte menu:     
1. Cadastrar turma
2. Cadastrar docentes
3. Definir docentes para uma determinada turma
4. Listar turmas com seus respectivos assuntos, docentes e semanas
5. Listar todos os docentes
6. Listar um docente e suas semanas de aula já definidas
7. Sair

