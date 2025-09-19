# Atividade Prática: Interfaces em Java (Ada Tech)

Este repositório contém a resolução de uma atividade proposta pela *Ada Tech, focada em aplicar e aprofundar os conhecimentos sobre o uso de **Interfaces* na linguagem Java. O projeto é dividido em 5 cases práticos que exploram diferentes cenários e vantagens do uso de interfaces no design de software orientado a objetos.

## 🎯 Objetivo

O objetivo desta atividade é solidificar os conceitos teóricos de interfaces através da implementação de soluções para problemas práticos, demonstrando a importância de abstrações e "contratos" para a criação de um código flexível, extensível e de baixo acoplamento.

## 📦 Cases de Estudo

A atividade é composta por 5 desafios que abordam diferentes aspectos das interfaces.

### 1. Interface de Animais
- *Desafio:* Foi criada uma interface Animal com um método emitirSom(). Esta interface foi implementada pelas classes Cachorro e Gato. O programa principal cria uma lista de animais e invoca o método emitirSom() para cada um, demonstrando o polimorfismo.
- *Pergunta:* O que acontece se você adicionar mais animais diferentes no futuro?
- *Resposta:* A grande vantagem da interface é a extensibilidade. Para adicionar um novo animal (ex: Pato), basta criar a classe Pato implementando a interface Animal. O restante do código que percorre a lista e chama emitirSom() não precisa de *nenhuma alteração*, pois ele depende da abstração (Animal) e não das implementações concretas (Cachorro, Gato).

### 2. Interface de Formas Geométricas
- *Desafio:* Foi definida uma interface Forma com o método calcularArea(), implementada pelas classes Quadrado e Circulo. Uma classe Desenho foi criada para agrupar uma lista de formas (usando composição) e calcular a área total de seus componentes.
- *Pergunta:* Por que é interessante usar composição em Desenho em vez de herança?
- *Resposta:* Utiliza-se composição porque a relação é de "tem-um" (HAS-A) e não "é-um" (IS-A). Um Desenho *tem* formas geométricas, mas ele *não é* uma forma geométrica. A herança seria conceitualmente incorreta e limitaria a flexibilidade da classe Desenho.

### 3. Interface de Pagamentos
- *Desafio:* Criou-se uma interface Pagamento com o método pagar(double valor). As classes CartaoCredito, Pix e Dinheiro implementam essa interface, cada uma com sua lógica. O programa simula o pagamento de um produto usando essas diferentes estratégias.
- *Pergunta:* Por que é mais flexível usar uma interface nesse caso do que criar apenas uma classe Pagamento com vários if/else?
- *Resposta:* O uso da interface segue o *Princípio do Aberto/Fechado (Open/Closed Principle)*. Com a interface, podemos adicionar novas formas de pagamento (ex: Boleto, Criptomoeda) sem alterar o código já existente que processa o pagamento. Uma classe com if/else precisaria ser modificada a cada nova forma de pagamento, tornando o sistema mais rígido e propenso a erros.

### 4. Interface de Veículos
- *Desafio:* Foi criada uma interface Veiculo com os métodos acelerar() e frear(). Foi adicionado também um método default chamado ligarMotor(). As classes Carro e Moto utilizam diretamente a implementação padrão, enquanto a classe Bicicleta sobrescreve o método para um comportamento específico.
- *Pergunta:* Como o uso de default ajuda a evitar duplicação de código nas classes?
- *Resposta:* O método default permite fornecer uma implementação padrão diretamente na interface. Isso evita que todas as classes que implementam a interface tenham que reescrever o mesmo código para um comportamento comum (como Carro e Moto ligando o motor). Apenas as classes com comportamento excepcional (como Bicicleta) precisam sobrescrevê-lo.

### 5. Interface de Notificações
- *Desafio:* Uma interface Notificacao com o método enviarMensagem(String mensagem) foi criada e implementada pelas classes Email e SMS. O programa principal é capaz de enviar uma mesma mensagem por diferentes canais de notificação de forma transparente.
- *Pergunta:* Qual a vantagem de usar interface se no futuro você quiser adicionar WhatsApp ou Push Notification?
- *Resposta:* A vantagem é a mesma do case de Animais e Pagamentos: *extensibilidade e baixo acoplamento*. Para adicionar a notificação por WhatsApp, basta criar uma classe NotificacaoWhatsApp que implementa Notificacao. O código que envia as mensagens não precisa saber que essa nova opção existe; ele continuará funcionando perfeitamente, apenas tratando a nova classe como mais uma Notificacao.

## 🛠️ Tecnologias Utilizadas
* *Linguagem:* Java
* *JDK:* 21
* *IDE:* IntelliJ IDEA

## 🚀 Como Executar o Projeto
1.  Clone o repositório: git clone https://github.com/IgorAgiani/atividade-ada-1.git
2.  Navegue até o diretório do projeto.
3.  Compile os arquivos Java: javac *.java (ou compile pela sua IDE).
4.  Execute a classe principal que contém o método main.
