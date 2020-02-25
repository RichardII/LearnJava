package questions.q2.cmd;

import java.util.Map;
import java.util.Set;

public class CmdHelp implements Commande {



    @Override
    public void exceute() {

        Set<String> ensembleKey = tabCmd.keySet();

        for(String el : ensembleKey)
        {
            System.out.println(el+ " : "+ tabCmd.get(el).getInfo());
        }

    }

    @Override
    public String getInfo() {
        return "Cette commande affiche cette aide";
    }


}
