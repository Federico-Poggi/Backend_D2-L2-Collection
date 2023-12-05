package Classes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumeriInteri {
    int number;
    String word;
    public NumeriInteri(int number, String word){
        this.number=number;
        this.word=word;
    }

    public static void getNumber(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Inserisci un intero:\n");
        int numWord=scan.nextInt();
        System.out.println("Inserisci " +numWord+" parole");
        Set<String> words=new HashSet<String>();
        int count=0;
        for (int i=0; i<numWord;i++){
            System.out.println("Ancora " + numWord + " parole");
            String word=scan.nextLine();
            words.add(word);
            System.out.println(words);
            count++;}
        System.out.println("Fatto");
    }
}
