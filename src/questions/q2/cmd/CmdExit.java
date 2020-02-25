package questions.q2.cmd;

public class CmdExit implements Commande {

    @Override
    public void exceute() {
           System.exit(0);
    }

    @Override
    public String getInfo() {
        return "Cette commande permet de sortir du programme";
    }
}
