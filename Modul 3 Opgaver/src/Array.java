public class Array {


    public static void main(String[] args) {


        int[] array = {1, 2, 3, 7, 1, 600, 2, 5, 8, 2, 9, 19, 100, 2, 1, 3};
        int n = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]>n){
                n=array[i];
            }
            else
                continue;
        }
        System.out.println(n);

    }
}
