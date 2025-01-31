public class patternsquations {

    public static void main(String[] args) {
        //1. Solid Pattern (row=4, colomn=5)

        for (int i = 1; i <= 4; i++){ //  outer loop(rows)
                inner loop(colums)
            for(int j = 1; j <= 5; j++){
                System.out.print("*"); // not use println
            }
            System.out.println("*");
        }


        //2. Hollow box pattern

        for(int i = 1; i <= 4; i++) { // inner loop(rows)
            //  inner loop(colums)
            for(int j = 1; j <= 5; j++){
                if(i == 1 || j == 1 || i == 4 || j == 5){
                    System.out.print("*");
                } else{
                    System.out.print(" ");            
                }
            } System.out.println();
        } 



        //3. Half pyramid

        for (int i = 1; i <= 4; i++){ //  outer loop(rows)
            // inner loop(colums)
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // 4. Invert Half Pyramid
        for (int i = 4; i >= 1; i--){ //  outer loop(rows)
            // inner loop(colums)
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        
        // 5. Inverted half pyramid (rotated by 180 degree)
        int n = 4;

        // outer loop
        for(int i = 1; i <= n; i++){
            // inner loop for space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            // another inner loop for star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        } 

        // 6. Half pyramid with number
        int n = 5;

        for (int i = 1; i <= n; i++){ //  outer loop(rows)
            // inner loop(colums)
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // 7. Invert Half Pyramid with numbers
        int n = 5;

        //  outer loop
        for (int i = 1; i <= n; i++){ 
            // inner loop
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // 8. Floyds Triangle
        int n = 5;
        int num = 1;

        //  outer loop
        for (int i = 1; i <= n; i++){ 
            // inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        // 9. On & Off pattern in half pyramid
        int n = 5;

        //  outer loop
        for (int i = 1; i <= n; i++){ 
            // inner loop
            for(int j = 1; j <= i; j++){
                int sum = j+i;
                if (sum % 2 == 0){ //Even
                    System.out.print("1 ");
                }
                else{ //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
    }

}
