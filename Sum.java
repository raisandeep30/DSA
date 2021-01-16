public class Sum {
     static int sumOfDigits(int num, int sum){
        //Termination case
        if(num==0){
            return sum;
        }
        //Processing Logic
        int digit = num % 10;
        sum+=digit;
        num = num/10;             //small problem
        return sumOfDigits(num, sum);          //recursion 

    }
    public static void main(String[] args) {
        int result = sumOfDigits(123, 0);
        System.out.println(result);
    }
    
}
