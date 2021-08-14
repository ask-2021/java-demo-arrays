public class Application {

    public static void main(String[] args) {

        int[] array = new int[5];
//        array[0] = 2;
//        array[1] = 5;
//        array[3] = 10;
//        array[4] = 15;

        for (int index = 0 ; index < array.length ; index++) {
            array[index] = (int)(Math.random()*1000);
            System.out.println("The value in " +index +"th index is: " + array[index]);

        }

        // for each loop

        for (int var : array){
            System.out.println(var);
        }

        // printing array values in reverse order

        for (int index = array.length-1 ; index>=0 ; index-- ){
            System.out.println("The value in " +index +"th index is: " + array[index]);
        }
    }
}
