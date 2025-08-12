package Exercicios.exercicio_6_1;

import java.util.Arrays;
import java.util.Scanner;

import Exercicios.exercicio_6_1.calc.Operation;

public class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    System.out.println("Informe o numero da operaçao que deseja realizar (1 = sum, 2 = subtraction)");
    int operationOption = scanner.nextInt();

    while (operationOption > 2 || operationOption < 1) {
      System.out.println("Escolha uma opçao válida (1 = sum, 2 = subtraction)");
      operationOption = scanner.nextInt();
    }

    var selectedOperation = Operation.values()[operationOption - 1];
    System.out.println("Informe os números que serao usados separados por vírgula (ex.: 1,2,3,4)");
    var numbers = scanner.next();

    var numberArray = Arrays.stream(numbers.split(",")).mapToLong(Long::parseLong).toArray();

    scanner.close();

    var result = selectedOperation.getOperationCallback().exec(numberArray);
    var operationToShow = numbers.replaceAll(",", " " + selectedOperation.getSignal() + " ");

    System.out.printf("O resultado da operaçao %s: %s", operationToShow, result);
  }
}