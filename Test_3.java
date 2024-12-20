class Test_3{
    public static void main(String args[]){
        // Printing patterns...!!
        
        int row, col;
        for(row=0; row<=3; row++){
            for(col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // *
        // * *
        // * * *
        // * * * *

        System.out.println();

        for(row=0; row<=3; row++){
            for(col=0; col<3-row; col++){
                System.out.print("  ");
            }
            for(col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //       *
        //     * *
        //   * * *
        // * * * *
            
    }
}