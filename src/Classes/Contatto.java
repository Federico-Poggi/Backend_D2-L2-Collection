package Classes;


import Interface.Printagenda;

import java.util.HashMap;
import java.util.Random;

public class Contatto extends Agenda implements Printagenda {
    boolean conoscente;

    public Contatto(String cellPhone,String name, boolean conoscente){
        super(cellPhone,name);
        this.conoscente=conoscente;
    }

    public static String randomPhoneNumber(){
        Random rand=new Random();
        String prefixItalia="+39";
        String firstBlock=String.format("%03d", rand.nextInt(1000));
        String secondBlock=String.format("%03d",rand.nextInt(1000));
        String thirdBlock=String.format("%03d",rand.nextInt(10000));
        String numberTot=prefixItalia + " " + firstBlock+ " "+secondBlock+" "+thirdBlock;
        System.out.println(numberTot);
        return numberTot;
    }

    @Override
    public void start() {
        super.start();
        randomPhoneNumber();
    }
}
