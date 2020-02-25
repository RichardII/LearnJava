package questions.q2.cmd;

import javax.swing.*;

public class CmdByeBye implements Commande {


    @Override
    public void exceute() {
        System.out.println("bye bye");
    }

    @Override
    public String getInfo() {
        return  "cette commande affiche bye bye";
    }
}
