# Resumo do Projeto: Jogo de Adivinhação

Este projeto consiste em um programa Java que simula um jogo de adivinhação. O programa gera aleatoriamente um número entre 0 e 100 e desafia o usuário a adivinhar esse número em até 5 tentativas.

https://www.loom.com/share/471c4999426e44048be49fff0136bf1d?sid=46b52252-2aa6-4f25-bcf7-84eaf033b435


**Funcionalidades Principais:**

1. **Geração de Número Aleatório:**
   - Utilizamos a classe `Random` para gerar um número aleatório no intervalo de 0 a 100. A sintaxe utilizada foi `new Random().nextInt(100)`.

2. **Entrada de Dados do Usuário:**
   - Utilizamos a classe `Scanner` para obter os dados inseridos pelo usuário, ou seja, suas tentativas de adivinhar o número gerado.

3. **Contagem de Tentativas:**
   - Utilizamos uma variável para contar as tentativas do usuário, garantindo que ele tenha até 5 chances para acertar o número.

4. **Loop de Tentativas:**
   - Implementamos um loop para controlar as tentativas do usuário. Enquanto ele não acertar o número ou não exceder o limite de 5 tentativas, o loop continuará executando.

5. **Feedback ao Usuário:**
   - A cada tentativa, o programa fornece feedback ao usuário informando se o número digitado é maior ou menor do que o número gerado aleatoriamente.

6. **Instrução Break:**
   - Utilizamos a instrução `break` para interromper o loop caso o usuário acerte o número ou exceda o limite de tentativas.

Este projeto proporciona uma experiência interativa e desafiadora ao usuário, incentivando-o a utilizar sua habilidade de adivinhação para alcançar o objetivo dentro do número limitado de tentativas. É uma ótima oportunidade para praticar conceitos básicos de lógica de programação em Java e interação com o usuário através de entrada e saída de dados.

https://www.loom.com/share/471c4999426e44048be49fff0136bf1d?sid=46b52252-2aa6-4f25-bcf7-84eaf033b435
