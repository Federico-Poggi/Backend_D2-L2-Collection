package Classes;

import Interface.Printagenda;

import java.util.HashMap;

public abstract class Agenda {
    /*---ATTRIBUTI---*/
    protected static String numberPhone;
    protected static String name;

    /*--FINE ATTRIBUTI--*/

    public Agenda(){};
    public Agenda(String cellPhone,String name){
        Agenda.numberPhone=cellPhone;
        Agenda.name =name;
    }






}
