public class Fact{

    static int fact(int n){
        if (n == 1){
            return 1;
        }
        int smallResult = fact(n-1);
        return n * smallResult;

    }

    public static void main ( String [] args){
        System.out.println( fact(5));
    }
} 