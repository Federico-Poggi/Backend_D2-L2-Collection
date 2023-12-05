package Classes;

import Interface.Printagenda;

import java.util.HashMap;
import java.util.Random;

abstract class Agenda implements Printagenda {
    /*---ATTRIBUTI---*/
    protected String numberPhone;
    protected String name;

    /*--FINE ATTRIBUTI--*/
    public Agenda(String cellPhone,String name){
        this.numberPhone=cellPhone;
        this.name=name;
    }



    @Override
    public void start() {

    }

    @Override
    public void printAgenda() {

    }

    @Override
    public void removeContact() {

    }

    @Override
    public HashMap<String, String> removeContct() {
        return null;
    }


}
