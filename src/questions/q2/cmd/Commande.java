package questions.q2.cmd;

import java.util.HashMap;
import java.util.Map;

public interface Commande {

    //tabCmd c'est une variable qui reference un objet de type Map<String, Commande>
    // le type declareé est à gauche, et le type instancié a droite
    // la methode containsKey() est appelé sur d'abord sur le type instancié

    public static final Map<String, Commande> tabCmd = new HashMap<>();

    public abstract  void exceute();

    public  abstract String getInfo();
}
