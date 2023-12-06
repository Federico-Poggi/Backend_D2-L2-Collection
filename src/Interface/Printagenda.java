package Interface;

import javax.naming.Name;
import java.util.HashMap;

public interface Printagenda {
    public void printAgenda();
    public default void removeContact(){};
    HashMap<String,String> removeContct();

}
