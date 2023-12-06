package Classes;


import Interface.Printagenda;
import java.util.*;

public class Contatto extends Agenda implements Printagenda{
    static Map<String,String> agendaMap=new HashMap<>();
    boolean conoscente;
    public Contatto(){}
    public Contatto(String cellPhone,String name, boolean conoscente){
        super(cellPhone,name);
        this.conoscente=conoscente;
    }

    public static void randomPhoneNumber(){
        Random rand=new Random();
        String prefixItalia="+39";
        String firstBlock=String.format("%03d", rand.nextInt(1000));
        String secondBlock=String.format("%03d",rand.nextInt(1000));
        String thirdBlock=String.format("%03d",rand.nextInt(10000));
        String numberTot=prefixItalia + " " + firstBlock+ " "+secondBlock+" "+thirdBlock;
        System.out.println(numberTot);//mi crea numeri casuali con prefisso italiano
        Contatto.numberPhone = numberTot;
    }
    public static void insertName(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Inserisci nome nuovo contatto:");
        Contatto.name= scan.nextLine();
    }


    public static void start() {
        Scanner scan = new Scanner(System.in);
        //creo un agenda con chiave=name,e valore=numero di telefono
        boolean confirm = false;
        String remAdd;
        agendaMap.put("Gionni","+393339993900");
        System.out.println("Add Contatto o Remove Contatto?\t Scrive ADD o REM");
        remAdd = scan.nextLine().toUpperCase();
        if (remAdd.equals("ADD")) {
            do {
                insertName();
                System.out.println("Nome: " + name);
                System.out.println("Numero di telefono:");
                randomPhoneNumber();
                System.out.println("Stai inserendo, è corretto?:" + name + " " + numberPhone);
                System.out.println("Confermi: SI/NO");
                String yesNo = scan.nextLine().toUpperCase();
                if (yesNo.equals("SI")) {
                    agendaMap.put(name, numberPhone);
                    System.out.println("CONTACT SAVED");
                }
                if (!choice()) {
                    confirm = true;
                }
            } while (!confirm);
            Contatto contatto = new Contatto();
            contatto.printAgenda();
        }
        else{
            System.out.println("Inserisci nome della persona da eliminare:");
            String name= scan.nextLine();
            agendaMap.remove(name);
            new Contatto().printAgenda();
        }
    }

    /*---Funzione scelta---*/
    static boolean choice(){
        System.out.println("Vuoi inserire un altro contatto: inserisci  SI/NO");
        Scanner scanner=new Scanner(System.in);
        String choice=scanner.nextLine().toUpperCase();
        return choice.equals("SI");
    }
    @Override
    public void printAgenda() {
        System.out.println(agendaMap);
    }

    @Override
    public HashMap<String, String> removeContct() {
        return null;
    }


}
