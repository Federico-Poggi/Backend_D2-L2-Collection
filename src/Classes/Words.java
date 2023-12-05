package Classes;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Words{
    int number;
    String word;
    public Words(int number, String word){
        this.number=number;
        this.word=word;
    }
    public static void getNumber(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Inserisci un intero:\n");
        int numWord=scan.nextInt();
        System.out.println("Inserisci " +numWord+" parole");
        Set<Words> words= new HashSet<>();
        String word;
        for (int i = 0; i<numWord; i++) {
            System.out.println("Ancora " + numWord + " parole");
            word = scan.nextLine();
            Words words1 =new Words(i , word);
            words.add(words1);
        }




        System.out.println(words.toString());
        System.out.println("Fatto");
    }

    @Override
    public String toString() {
        return "Words{" +
                "word='" + word + '\'' +
                '}';
    }
}
