package Classes;
import Interface.GetNumber;

import java.util.*;

public class Words implements GetNumber {
                                /*-----VARIABILI-----*/
    Scanner scan=new Scanner(System.in);
    int number;
    static int numberToInsert;
    static String wordToInsert;
    public static String word;
    public static String[] words;

                                /*-----VARIABILI-FINE------*/
    public Words(){
    };
     public static void newStart(){
        Scanner scan=new Scanner(System.in);
        new Words().GetNumber();
        words=new String[numberToInsert];
        Set<String> paroleSet=new HashSet<>();
        List<String> dupli=new ArrayList<>();
        for (int i = 0; i <words.length; i++) {
            System.out.println("Inserisi una parola:");
            wordToInsert=scan.nextLine();
            words[i]=wordToInsert;
            boolean added=paroleSet.add(wordToInsert);
            if(!added) {
                System.out.println("La parola " + wordToInsert + " è gia nelle'elenco");
                dupli.add(wordToInsert);
            }

        }
        System.out.println(paroleSet);
        if(!dupli.isEmpty()) {
            System.out.println("Le parole doppie sono : " + dupli.size());
            System.out.println("i doppioni sono: "+ dupli);
        }else{
            System.err.println("Il set non ha doppioni");
        }

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




}
