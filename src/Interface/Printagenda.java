package Interface;

import javax.naming.Name;
import java.util.HashMap;

public interface Printagenda {
    void printAgenda();
    void removeContact();
    HashMap<String,String> removeContct();
    void start();
}
