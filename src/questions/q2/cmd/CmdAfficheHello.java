package questions.q2.cmd;

public  class CmdAfficheHello implements Commande {


    @Override
    public void exceute() {

        System.out.println("Hello World !");

    }

    @Override
    public String getInfo() {
        return "Cette commande affiche Hello Wolrd";
    }


}
