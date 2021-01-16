public class Reverse {
    //DSA
    static String reverse( String str){
          //TERMINATION CASE
          if(str.length()== 1){
              return String.valueOf(str.charAt(0));
          }
          //small Problem

         return reverse(str.substring(1)) +  str.charAt(0);
    }
    public static void main(String[] args) {
   System.out.println (reverse("DSA"));
    }
    
}
