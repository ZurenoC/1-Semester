import java.util.HashMap;

public class Branches3 {


    public static void main(String[] args) {



       /* for (double i = -5 ; i <= 40 ; i+=0.5){
            double toFahrenheit = 32 + 9/5*i;
            System.out.println(toFahrenheit);
        }

       */

      /* for(double i = 40; i >= -5 ; i-=0.5){
           double toFahrenheit = 32 + 9/5*i;
           System.out.println(toFahrenheit);
       }
      */

      /* double[] triangle = {1, 3, 5};
      for (int i = 0 ; i <= 2; i++){
          System.out.println(triangle[i]*triangle[i]*3.14);
      }
      */


        HashMap<Integer, String> months = new HashMap<>();

        months.put(1,"Januar");
        months.put(2,"Februar");
        months.put(3,"Marts");
        months.put(4,"April");
        months.put(5,"Maj");
        months.put(6,"Juni");
        months.put(7,"Juli");
        months.put(8,"August");
        months.put(9,"September");
        months.put(10,"Oktober");
        months.put(11,"Novenber");
        months.put(12,"December");


        for (int i = 1 ; i <= 12; i++){
            System.out.println(months.get(i));
        }


    }
}
