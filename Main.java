import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Variavéis
    int x = 123;
    double y = 3.14;
    boolean z = true;
    char simbolo = '@';

    // troca de variáveis

    String nome = "Gabs";
    String lastName = "Silva";
    String reserv;

    reserv = nome;
    nome = lastName;
    lastName = reserv;
    System.out.println("Name " + nome);
    System.out.println("Sobrenome " + lastName);

    // Arrays
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;
    System.out.println("Inteiros: " + numbers[0]);

    // Array de Strings
    String[] names = new String[5];
    names[0] = "Gabs";
    names[1] = "Maria";
    names[2] = "Pedro";
    names[3] = "Caique";
    names[4] = "Marcelo";
    System.out.println("String: " + names[0]);

    // Array de booleanos
    boolean[] booleans = new boolean[5];
    booleans[0] = true;
    booleans[1] = false;
    booleans[2] = true;
    booleans[3] = false;
    booleans[4] = true;
    System.out.println("Booleano: " + booleans[0]);

    // Array de caracteres
    char[] symbols = new char[5];
    symbols[0] = '@';
    symbols[1] = '#';
    symbols[2] = '$';
    symbols[3] = '%';
    symbols[4] = '&';
    System.out.println("Symbols " + symbols[0]);

    // Array de doubles
    double[] numbersDouble = new double[5];
    numbersDouble[0] = 1.0;
    numbersDouble[1] = 2.0;
    numbersDouble[2] = 3.0;
    numbersDouble[3] = 4.0;
    numbersDouble[4] = 5.0;
    System.out.println("Double number" + numbersDouble[0]);

    // Loop Array
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    // Loop Array com forEach
    for (char symbol : symbols) {
      System.out.println(symbol);
    }

    // 2D Array - Outside
    int[][] numbers2D = new int[3][3];
    numbers2D[0][0] = 1;
    numbers2D[0][1] = 2;
    numbers2D[0][2] = 3;
    numbers2D[1][0] = 4;
    numbers2D[1][1] = 5;
    numbers2D[1][2] = 6;
    numbers2D[2][0] = 7;
    numbers2D[2][1] = 8;
    numbers2D[2][2] = 9;
    System.out.println("2D ARRAY: " + numbers2D[0][0]);

    // 2D String Array - Inside
    String[][] cars = {
        { "Camaro", "Mustang", "Ferrari", "Porsche", "Lamborghini" },
        { "Fiat", "Volkswagen", "Ford", "Chevrolet", "Honda" }
    };

    // Loop 2D Array

    for (int i = 0; i < numbers2D.length; i++) {
      for (int j = 0; j < numbers2D[i].length; j++) {
        System.out.println(numbers2D[i][j]);
      }
    }

    // Loop cars 2D Array
    for (int i = 0; i < cars.length; i++) {
      for (int j = 0; j < cars[i].length; j++) {
        System.out.println("For: " + cars[i][j]);
      }
    }

    // Loop cars 2D Array
    for (String[] car : cars) {
      for (String carName : car) {
        System.out.println("For each:" + carName);
      }
    }

    // String methods
    String name = "Gabs";
    System.out.println("Name charAt: " + name.charAt(0));
    boolean resultName = name.equals("Gabs");
    System.out.println(resultName);
    int position = name.indexOf("a");
    System.out.println("Position: " + position);
    String replace = name.replace("Gabs", "Gabi");
    System.out.println("Replace: " + replace);
    String trim = name.trim();
    System.out.println("Trim: " + trim);

    /*
     * Wrapper classes
     * can be used with collections (ArrayList, HashMap, etc)
     * 
     * Boolean
     * Character
     * Integer
     * Double
     * String
     * 
     */

    /*
     * Primitive
     * 
     * boolean
     * char
     * int
     * double
     */
  }
}