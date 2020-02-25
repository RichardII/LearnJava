package questions.q2.cmd;

import java.lang.Override;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdLS implements Commande {

    @Override
    public void exceute() {

        String s = null;

        try {

            Process p = Runtime.getRuntime().exec("ls -alp");


            BufferedReader stdInput = new BufferedReader(new
                    InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }

    @Override
    public String getInfo() {
        return "Cette commande excute ls linux";
    }
}
