public class Main {

    public static void main(String[] args) {

        final int[] radiuses = {1, 3, 5};
        final double pi = 3.14;

        for(int r: radiuses){
            System.out.println("r="+r+" -> area = "+(pi*r*r));
        }
    }
}
