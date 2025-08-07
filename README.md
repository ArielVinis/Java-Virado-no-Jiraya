# Maratona Java Virado no Jiraya

## 📚 Resumo dos Conteúdos Estudados

Este projeto contém os estudos realizados durante o curso "Maratona Java Virado no Jiraya". 
Deixo aqui um registro detalhado de todos os tópicos abordados para uma consulta futura.

---

## 🎯 **Tipos Primitivos e Variáveis**

### Conceitos Estudados:
- **Declaração de variáveis**: Convenções de nomenclatura e sintaxe
- **Tipos primitivos**: `int`, `double`, `char`, `boolean`, `long`
- **Strings**: Manipulação de texto
- **Casting**: Conversão entre tipos de dados
- **Tamanho em memória**: Entendimento do espaço ocupado por cada tipo

### Exemplo Prático:
```java
String nome = "Ariel";
int idade = 27;
double peso = 68.5;
char sexo = 'M';
boolean doadorOrgao = false;
```

---

## 🔧 **Operadores**

### Tipos de Operadores Estudados:

#### **Aritméticos**
- Adição (`+`), subtração (`-`), multiplicação (`*`), divisão (`/`), módulo (`%`)

#### **Relacionais**
- Igual (`==`), diferente (`!=`), maior (`>`), menor (`<`), maior ou igual (`>=`), menor ou igual (`<=`)

#### **Lógicos**
- AND (`&&`), OR (`||`), NOT (`!`)
- Tabela verdade e comportamento dos operadores

#### **Unários**
- Incremento (`++`), decremento (`--`)
- Negação (`!`)

#### **Atribuição**
- Atribuição simples (`=`) e compostas (`+=`, `-=`, `*=`, etc.)

### Exemplo Prático:
```java
boolean isAutorizadoComprarBebida = idade >= 18;
if (!isAutorizadoComprarBebida) {
    System.out.println("Não autorizado");
}
```

---

## 🎮 **Estruturas Condicionais**

### Conceitos Estudados:

#### **if/else**
- Estrutura básica de decisão
- Condições simples e compostas
- Uso de operadores lógicos

#### **else if**
- Múltiplas condições encadeadas
- Estrutura hierárquica de decisões

#### **Operador Ternário**
- Sintaxe compacta: `condição ? valor_se_verdadeiro : valor_se_falso`

#### **Switch Case**
- Estrutura para múltiplas opções
- Uso de `break` e `default`
- Aplicação em menus e seleções

### Exemplo Prático:
```java
if (isAutorizadoComprarBebida) {
    System.out.println("Autorizado a comprar bebida alcoólica");
} else {
    System.out.println("Não autorizado a comprar bebida alcoólica");
}
```

---

## 🔄 **Estruturas de Repetição**

### Tipos de Loops Estudados:

#### **while**
- Loop com condição no início
- Executa enquanto a condição for verdadeira

#### **do-while**
- Loop com condição no final
- Executa pelo menos uma vez

#### **for**
- Loop com inicialização, condição e incremento
- Ideal para iterações com índice

#### **Controle de Fluxo**
- `break`: Sai do loop imediatamente
- `continue`: Pula para a próxima iteração

### Exemplo Prático:
```java
// While para condições
while (count < 10) {
    System.out.println(++count);
}

// For para índices
for (int i = 0; i < 10; i++) {
    System.out.println("For " + i);
}
```

---

## 📦 **Arrays**

### Conceitos Estudados:

#### **Arrays Unidimensionais**
- Declaração e inicialização
- Acesso por índice
- Tamanho fixo e limites

#### **Arrays Multidimensionais**
- Matrizes (arrays de arrays)
- Acesso bidimensional

#### **Padrões de Arrays**
- Inicialização direta
- Arrays de referência

#### **foreach**
- Iteração simplificada
- Sintaxe: `for (tipo elemento : array)`

### Exemplo Prático:
```java
// Array unidimensional
int[] idades = new int[3];
idades[0] = 21;
idades[1] = 15;
idades[2] = 11;

// Foreach
for (int idade : idades) {
    System.out.println(idade);
}
```

---

## 🛡️ **Tratamento de Exceções**

### Conceitos Estudados:

#### **try-catch**
- Captura de exceções
- Múltiplos blocos catch
- Hierarquia de exceções

#### **finally**
- Bloco sempre executado
- Limpeza de recursos

#### **Tipos de Exceções**
- `ArrayIndexOutOfBoundsException`
- `NumberFormatException`
- `Exception` genérica

### Exemplo Prático:
```java
try {
    double valor = Double.parseDouble(args[0]);
    System.out.println(valor);
} catch (Exception e) {
    System.out.println("Erro: " + e.getMessage());
} finally {
    System.out.println("Obrigado!");
}
```

---

## 🏗️ **Métodos**

### Conceitos Estudados:
- **Sintaxe de métodos**: Declaração, parâmetros, retorno
- **Métodos estáticos**: Uso de `static`
- **Métodos de instância**: Comportamento orientado a objetos
- **Sobrecarga**: Múltiplos métodos com mesmo nome

---

## 🎯 **Orientação a Objetos (Início)**

### Conceitos Iniciais:
- **Classes**: Definição de estrutura de dados
- **Atributos**: Propriedades da classe
- **Objetos**: Instâncias de classes
- **Encapsulamento**: Controle de acesso aos dados

### Exemplo Prático:
```java
public class Estudante {
   public String nome;
   public int idade;
   public char sexo;
}
```

---

## 📁 **Estrutura do Projeto**

```
src/
├── Main.java
└── ProjetoAulas/
    ├── Arrays/
    ├── Comentários_Erros_e_TryCatch/
    ├── EstruturasCondicionais/
    ├── EstruturasDeRepeticao/
    ├── Metodos/
    ├── Operadores/
    └── Orientacao_a_objetos/
        └── Classes/
            ├── dominio/
            └── test/
```

---

## 🎓 **Status do Aprendizado**

✅ **Concluído:**
- Tipos primitivos e variáveis
- Operadores (aritméticos, lógicos, relacionais, unários)
- Estruturas condicionais (if, else if, switch, ternário)
- Estruturas de repetição (while, do-while, for, break, continue)
- Arrays (unidimensionais, multidimensionais, foreach)
- Tratamento de exceções (try-catch-finally)
- Introdução a métodos
- Fundamentos de Orientação a Objetos

🔄 **Em Progresso:**
- Orientação a Objetos (conceitos avançados)

---

## 💡 **Dicas para Consulta**

- Use este README como referência rápida
- Cada pasta contém exemplos práticos dos conceitos
- Os comentários nos códigos explicam o funcionamento
- Mantenha este registro atualizado conforme avança no curso

---

*Projeto de estudos do curso "Maratona Java Virado no Jiraya"*
