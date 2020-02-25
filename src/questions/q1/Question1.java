package questions.q1;

public class Question1 {

    public static void main(String[] toto)  {

        //int[]  tableau = new int[] {1, 2 , 4, 54, 32};

        int[]  tableau = new int[10];

        for(int i = 0; i < tableau.length ; i++)
        {
            tableau[i] = (int)(Math.random()*10);
        }

        for(int i = 0; i < tableau.length ; i++)
        {
            System.out.println(tableau[i]);;;;;;;;;;;;;;;
        }

        System.out.println("----------------------------------------");

        for( int el : tableau) {

            System.out.println(el);
        }


    }
}
