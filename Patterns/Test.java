
// pattern
/* 

 */

class Main{
    public static void main(String[] args) {
        // pattern1( 4);
        // pattern2(5);
        // pattern3(4);
        // pattern4(4);
        pattern5(4);
    }
/*  pattern1   
        * 
        * *
        * * *
        * * * *
 */    static void pattern1(int n){
        for (int row =1; row <= n; row ++){
            // for every row, run the col
            for(int col =1; col<= row; col ++){
                System.out.print("* ");
            }
            // When one row is printed, we need to add a newline
            System.out.println( );
        }
    }
/*  pattern2   
        * * * *
        * * * *
        * * * *
        * * * *
 */   static void pattern2(int n){
         for(int row =1; row<=n; row++){
             // for every row, run the col
             for(int col=1; col<=n; col++){
                 System.out.print("* ");
                }
            // when one row is printed, we need to add a new line
             System.out.println( );
            }
        }
/*  pattern3 
        * * * *
        * * * 
        * * 
        * 
 */ static void pattern3(int n){
    for(int row = n; row >=1; row--){
        for (int col = row; col>=1; col--){
            System.out.print("* ");
        }
        System.out.println( );
    }
 }
 /*  pattern4   
        1
        1 2 
        1 2 3 
        1 2 3 4
 */   static void pattern4(int n){
         for(int row =1; row<=n; row++){
             // for every row, run the col
             for(int col=1; col<=row; col++){
                 System.out.print( col);
                }
            // when one row is printed, we need to add a new line
             System.out.println( );
            }
        }
/*  pattern5   
        * 
        * *
        * * *
        * * * *
        * * *
        * *
        * 
 */    static void pattern5(int n){
        for (int row = 0; row < 2 *n; row++){
            int totalColInrow = row > n ? 2 * -row: row;
            for(int col =0; col< totalColInrow; col++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }        

}