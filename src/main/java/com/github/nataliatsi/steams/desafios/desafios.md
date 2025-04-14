## **1. Avançado - Trabalhando com Operações Paralelas**

### **1.1 (A) Executando operações em paralelo**

Use `parallelStream()` para somar uma lista grande de números e medir a diferença de desempenho.

```java
List<Integer> numeros = IntStream.rangeClosed(1, 10_000_000).boxed().collect(Collectors.toList());

```

Compare a execução com `stream().reduce()` e `parallelStream().reduce()`.