# Programmazione ad Oggetti - Laboratorio 02
## Esercizio 3 - multifile compilation

#### Compilazione da multipli percorsi

1. Si posizioni il terminale nella directory che contiene `src`
2. Si compilino, con un solo comando, i file `Calculator.java` e `UseCalculator.java` dentro bin, tenendo presente che:
  - La classe `Calculator` è stata fornita in un esercizio precedente
  - È proibito spostare i file forniti
  - È possibile passare più file a `javac` semplicemente elencandoli ||  javac -d bin ../../00-codeorg/src/Calculator.java UseCalculator.java
3. Si esegua `UseCalculator`
java -cp ../bin UseCalculator
