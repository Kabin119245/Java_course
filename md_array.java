public class md_array {
    public static void main(String[] args) {
        int nums[][] = new int [3][4];
        //initially all values are 0;
        //display all values

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                //assigning random values
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
         
    }
}
