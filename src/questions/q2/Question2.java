package questions.q2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import questions.q2.cmd.*;


public class Question2 {




    public Question2() {

        Commande cmdHello = new CmdAfficheHello();
        Commande cmdLs = new CmdLS();
        Commande cmdExit = new CmdExit();
        Commande cmdBye = new CmdByeBye();
        Commande help = new CmdHelp();

        Commande.tabCmd.put("help",help);
        Commande.tabCmd.put("cmdbye", cmdBye);
        Commande.tabCmd.put("cmdhello", cmdHello);
        Commande.tabCmd.put("cmdls", cmdLs);
        Commande.tabCmd.put("cmdexit", cmdExit);
    }


    public static void main(String[] beau) {

        new Question2();


        String prompt = "inviteCmd> ";


        while (true) {

            System.out.print(prompt);

            Scanner scan = new Scanner(System.in);


            String cmd = scan.nextLine();

            // Analyse syntaxique de la cmd

            if (Commande.tabCmd.containsKey(cmd) ) {

                Commande cmd2 = Commande.tabCmd.get(cmd);
                cmd2.exceute();


            } else {
                System.out.println("Désolé mais votre comande n'existe pas");
            }
        }

    }


}
