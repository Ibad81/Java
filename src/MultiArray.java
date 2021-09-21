public class MultiArray {
    public static void main(String[] args) {
        int[][] number={{1,2,4,5,4},{2,1,54,2,4}};     //inizaliation of two array
//        int x=number[0][2];                             //Accessing the elements
//        System.out.println(x);
        for (int i = 0; i < number.length ; i++) {            // For loop to get the element
            for (int j = 0; j < number[i].length; j++) {
                System.out.println(number[i][j]);

            }

        }


    }
}
