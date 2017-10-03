
//The program return args in reverse position

public class ReverseEcho {
    public static void main(String[  ] args) {
        // Loop from the last argument to the first one
        for(int i = args.length-1; i >= 0; i--) {
            // Print out  argument i
            System.out.print(args[i]);
            // Add a space at the end of each argument
            System.out.print(" ");
        }
        // End of the line
        System.out.println( );
    }
}

