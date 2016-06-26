public class Main {
   public static void main(String args[]) {
      String str = "this is Java";//this statemnet prints
      System.out.println("Hello ");// says hello
      System.out.println(removeCharAt(str, 3));
      
   }
   public static String removeCharAt(String s, int pos) {
   System.out.println("Hello ");// says hello
      return s.substring(0, pos) + s.substring(pos + 1);//substring
   }
}
