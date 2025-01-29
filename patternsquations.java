public class patternsquations {

    public static void main(String[] args) {
        // // Solid Pattern (row=4, colomn=5)

        // for (int i = 1; i <= 4; i++){ //  outer loop(rows)
                // inner loop(colums)
        //     for(int j = 1; j <= 5; j++){
        //         System.out.print("*"); // not use println
        //     }
        //     System.out.println("*");
        // }


        // Hollow box pattern

        // for(int i = 1; i <= 4; i++) { // inner loop(rows)
        //     //  inner loop(colums)
        //     for(int j = 1; j <= 5; j++){
        //         if(i == 1 || j == 1 || i == 4 || j == 5){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");            
        //         }
        //     } System.out.println();
        // } 



        // Half piramid

        for (int i = 1; i <= 4; i++){ //  outer loop(rows)
            // inner loop(colums)
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }

}