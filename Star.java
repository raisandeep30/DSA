public class Star {

   static void  printStar (int noOfStars){
        if(noOfStars ==0){
        
        System.out.println();
        return;

        }
        System.out.print("*");
          printStar(noOfStars - 1);   
        }




        static void pattern (int noOfRows , int noOfStars){
          if (noOfRows == 0){
              return;
          }
          printStar(noOfStars);
          noOfStars = noOfStars +1;
          pattern(noOfRows-1, noOfStars);



        }



    public static void main(String[] args) {
        pattern(5,1);
    }
    
}
