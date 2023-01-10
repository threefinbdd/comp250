class Numeric {

    public static void slide4() {
        System.out.println("Min Integer (2^31): " + Integer.MIN_VALUE);
        System.out.println("Max Integer (2^31): " + Integer.MAX_VALUE);
        System.out.println();
        System.out.println("Max Float(2^-149): " + Float.MIN_VALUE);
        System.out.println("Max Float(2^128): " + Float.MAX_VALUE);
        System.out.println();
        System.out.println("Max Double(2^-1074): " + Double.MIN_VALUE);
        System.out.println("Max Double(2^1024): " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("Max Integer+1:  " + (Integer.MAX_VALUE + 1));
        System.out.println();
    }

    public static void slide7() {
        int x = 5;
        System.out.println("Pre-Op Example");
        System.out.println("x = " + (++x));

        System.out.println();

        System.out.println("Post-Op Example");
        int y = 5;
        System.out.println("y = " + (y++));
        System.out.println();
    }

    public static void revisiting() {
        System.out.println("5" + "5");  		//  What’s the difference between
        System.out.println( 5 + 5 );         		//  these two lines?
        System.out.println( (double)5 + (double)5 );  	// how about this?
        System.out.println( (double)5 + 5 );  		// how about this?
    }

    public static void main(String[] args) {
        //revisiting();
        //slide4();
        //slide7();
    }
}