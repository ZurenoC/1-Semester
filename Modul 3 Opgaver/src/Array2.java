public class Array2 {

    public static void main(String[] args) {


        int size = 27;

        int[] array = new int[31];

        for(int i = 0; i < array.length; i++){
            array[i] = 3*i;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
