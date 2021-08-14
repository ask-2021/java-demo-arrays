public class Application {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 2;
        array[1] = 5;
        array[3] = 10;
        array[4] = 15;

        for (int index = 0 ; index < array.length ; index++) {

            System.out.println("The value in " +index +"th index is: " + array[index]);

        }
    }
}
