package Classes;
import Interface.GetNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Words implements GetNumber {
//    ----VARIABILI----
    Scanner scan=new Scanner(System.in);
    int number;
    static int numberToInsert;
    static String wordToInsert;
    public static String word;
    public static String[] words;

//    ----VARIABILI.FINE----
    public Words(){
    };
    public static void newStart(){
        Scanner scan=new Scanner(System.in);
        new Words().GetNumber();
        words=new String[numberToInsert];
        for (int i = 0; i <words.length; i++) {
            System.out.println("Inserisi una parola:");
            wordToInsert=scan.nextLine();
            words[i]=wordToInsert;
        }
        System.out.println(words.length);
    }


    @Override
    public String toString() {
        return "Words{" +
                "word='" + word + '\'' +
                '}';
    }

    @Override
    public void GetNumber(){
        try {
            System.out.println("Inserisci un numero intero:");
            numberToInsert= scan.nextInt();
            System.out.println(numberToInsert);
        }catch (InputMismatchException e){
            System.err.println("Errore tipo variabile");
        }
    }

    @Override
    public void GetString() {

    }



}
