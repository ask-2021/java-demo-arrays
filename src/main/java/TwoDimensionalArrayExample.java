public class TwoDimensionalArrayExample {

    public void creating2DArray(){
        int[][] myArray = new int[2][3];

        for(int i = 0; i< myArray.length; i++){
            for(int j =0; j< myArray[i].length; j++){
                myArray[i][j] = (int)(Math.random()*1000);
                System.out.println("The value at myArray[" +i +"][" +j +"] is " + myArray[i][j]);
                //System.out.println(myArray[i][j]);
            }

        }
    }
}
