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
    }
}