package Classes;

import java.util.*;

public class RandomList {
    Random rand=new Random();
    static int numberToRandomize;

    public static void listToRand(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Inserisci quanti numeri vuoi randomizzare: ");
        numberToRandomize= scan.nextInt();
        List<Integer> randomList=getListRandomInt(numberToRandomize);
        printList(randomList);
        System.err.println("finito");
        /*------FUNZIONE DUE-------*/
        List<Integer> revertedList=revertedList(randomList);
        System.out.println("I numeri invertiti sono:\n");
        printList(revertedList);
        /*------FUNZIONE TRE-------*/
        boolean bool;
        System.out.println("Inserisci true o false:");
        bool=scan.nextBoolean();
        List<Integer> oddEvenPosition=oddEven(randomList,bool);
        printList(oddEvenPosition);
    }

    static List<Integer> getListRandomInt(int num){
        Random rand=new Random();
        List <Integer> numList= new ArrayList<>();
        for (int i = 0; i < num; i++) {
            numList.add(rand.nextInt(1,100));
        }
        Collections.sort(numList);
        return numList;
    }

    static List<Integer> revertedList(List<Integer> arr){
        List<Integer> revertedListItem=new ArrayList<>();
        int maxArrLenght=arr.size();
        for (int i=0; i<arr.size();i++){
            int index=maxArrLenght-i;
            revertedListItem.add(arr.get(index-1));
        }
        revertedListItem.addAll(arr);
        return revertedListItem;
    }

    static List<Integer> oddEven(List<Integer> intlist, boolean value){
        List<Integer> oddEvenList=new ArrayList<>();
        int maxValue=intlist.size();
        for (int i = 0; i < maxValue; i++) {
            int result=i%2;
            if(value){
                if(result==0){
                    System.out.println("il valore in posizione: "+ i + " è " + intlist.get(i) );
                    oddEvenList.add(intlist.get(i));
                }
            }else{
                if (result!=0) {
                    System.out.println("il valore in posizione: " + i + " è " + intlist.get(i));
                    oddEvenList.add(intlist.get(i));
                }
            }
        }
        return oddEvenList;
    }

    static void printList(List<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
