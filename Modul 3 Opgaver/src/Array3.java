import java.util.ArrayList;

public class Array3 {

    public static void main(String[] args) {

        ArrayList<Integer> cirkler = new ArrayList<>();

        cirkler.add(1);
        cirkler.add(3);
        cirkler.add(5);

        for(int i = 0; i< cirkler.size(); i++){
            System.out.println("Radius af cirkel " + cirkler.get(i) + " er: " + cirkler.get(i)*cirkler.get(i)*3.14);
        }






    }




}
