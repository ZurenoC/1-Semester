public class BranchesPrimtal {

    public static void main(String[] args) {

        //skal checke alle tal fra 1 - 1000 for om de er primtal
        //Skal printe hvis det er et primtal


        for (int i = 1; i <= 15; i++) {
            if(i%2==1){
                if(i%3!=2){
                    System.out.println(i);
                }
                else if(i%3!=1){
                    System.out.println(i);
                }
                else continue;
            } else continue;

        }
    }}