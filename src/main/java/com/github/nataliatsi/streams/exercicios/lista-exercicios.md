## **1. Básico - Manipulação de Coleções**

### **1.1 Filtrando elementos**

Dada uma lista de números inteiros, filtre apenas os números pares.

```java
List<Integer> numeros = List.of(10, 15, 20, 25, 30, 35, 40);

```

**Saída esperada:** `[10, 20, 30, 40]`

---

### **1.2 Convertendo Strings para maiúsculas**

Dada uma lista de nomes, converta todos para letras maiúsculas.

```java
List<String> nomes = List.of("ana", "bruno", "carla", "daniel");

```

**Saída esperada:** `[ANA, BRUNO, CARLA, DANIEL]`

---

### **1.3 Contando elementos que satisfazem uma condição**

Dada uma lista de palavras, conte quantas possuem mais de 5 caracteres.

```java
List<String> palavras = List.of("banana", "uva", "computador", "sol", "teclado");

```

**Saída esperada:** `3`

---

## **2. Intermediário - Transformações e Reduções**

### **2.1 Somar todos os valores de uma lista**

Dada uma lista de números, some todos os elementos usando `reduce()`.

```java
List<Integer> numeros = List.of(5, 10, 15, 20, 25);

```

**Saída esperada:** `75`

---

### **2.2 Encontrar o maior número da lista**

Usando `reduce()` ou `max()`, encontre o maior número da lista.

```java
List<Integer> numeros = List.of(3, 9, 7, 1, 12, 5);

```

**Saída esperada:** `12`

---

### **2.3 Juntar elementos em uma única String**

Dada uma lista de palavras, transforme-a em uma única string separada por vírgulas.

```java
List<String> palavras = List.of("Java", "Spring", "Docker", "Kubernetes");

```

**Saída esperada:** `"Java, Spring, Docker, Kubernetes"`

---

## **3. Avançado - Trabalhando com Objetos**

### **3.1 Filtrar objetos de uma lista**

Crie uma classe `Produto` com `nome` e `preco`. Filtre apenas os produtos que custam mais de R$50.

```java
List<Produto> produtos = List.of(
    new Produto("Mouse", 30),
    new Produto("Teclado", 80),
    new Produto("Monitor", 500),
    new Produto("Cadeira", 200)
);

```

**Saída esperada:** `Teclado, Monitor, Cadeira`

---

### **3.2 Agrupar elementos com Collectors.groupingBy()**

Agrupe os produtos por faixas de preço: abaixo de R$100, entre R$100 e R$300, acima de R$300.

```java
List<Produto> produtos = List.of(
    new Produto("Mouse", 30),
    new Produto("Teclado", 80),
    new Produto("Monitor", 500),
    new Produto("Cadeira", 200)
);

```

**Saída esperada:**

```json
{
    "abaixo_de_100": ["Mouse", "Teclado"],
    "entre_100_e_300": ["Cadeira"],
    "acima_de_300": ["Monitor"]
}

```

