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

        System.out.println();

        for(row=0; row<=3; row++){
            for(col=0; col<3-row; col++){
                System.out.print(" ");
            }
            for(col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //   *
        //  * *
        // * * *
        //* * * *

        System.out.println();

        for(row=0; row<3; row++){
            for(col=0; col<3-(row+1); col++){
                System.out.print("  ");
            }
            for(col=0; col<1; col++){
                System.out.print("* ");
            }
            if(row==0){
                System.out.println();
                continue;
            }
            for(col=0; col<2*(row-1)+1; col++){
                System.out.print("  ");
            }
            for(col=0; col<1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(row=1; row>=0; row--){
            for(col=0; col<3-(row+1); col++){
                System.out.print("  ");
            }
            for(col=0; col<1; col++){
                System.out.print("* ");
            }
            if(row==0){
                System.out.println();
                continue;
            }
            for(col=0; col<2*(row-1)+1; col++){
                System.out.print("  ");
            }
            for(col=0; col<1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //     *
        //   *   *
        // *       *
        //   *   *
        //     *      
    }
}