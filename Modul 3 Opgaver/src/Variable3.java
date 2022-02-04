public class Variable3 {


    public static void main(String[] args) {

      double[] ugedage = {21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9};

      for(int i = 0; i < ugedage.length ; i++) {
          if (i!=6) {
              System.out.println(ugedage[i+1]-ugedage[i]);
          } else {
              System.out.println(ugedage[0]-ugedage[6]);
              break;
          }
      }







    }


}



