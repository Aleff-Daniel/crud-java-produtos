# CRUD de Produtos em Java


Este é um projeto simples de sistema de cadastro de produtos em Java, utilizando entrada e saída de dados via console (terminal).


## Tecnologias utilizadas


- Java 17  
- VSCode  
- Git e GitHub


## Como executar o projeto


1. Clone o repositório:


```
git clone https://github.com/Aleff-Daniel/crud-java-produtos.git
```


2. Acesse a pasta do projeto:


```
cd crud-java-produtos
```


3. Compile todos os arquivos:


```
javac *.java
```


4. Execute o projeto


```
java Main
```


## Executar com arquivo .jar


Se preferir rodar o projeto usando o arquivo `.jar`, siga os passos abaixo:


1. Certifique-se que o Java está instalado na sua máquina.  
2. No terminal, execute o comando:


```
java -jar crud-produtos.jar
```


Isso irá iniciar o sistema via console com o menu interativo.


## Executar com script `.bat` (Windows)


Você pode automatizar a execução do projeto com um arquivo `.bat`, útil para quem utiliza o sistema operacional Windows:

1. Verifique se o arquivo `crud-produtos.jar` está na mesma pasta que o script.  


2. Execute o arquivo `executar.bat` com um duplo clique ou pelo terminal.


Conteúdo do arquivo `executar.bat`:


```
@echo off
java -jar crud-produtos.jar
pause
```


O comando `pause` serve para manter a janela do terminal aberta após a execução do programa, facilitando a leitura da saída exibida.


## Estrutura do projeto


```
├── Main.java  
├── Produto.java  
├── ProdutoService.java  
└── README.md
```


## Funcionalidades


- Cadastrar produto  
- Listar produtos  
- Buscar produto pelo nome  
- Remover produto


## Status


Projeto finalizado e funcional no console.