package nadiatests;

/**
 * Created with IntelliJ IDEA.
 * User: nadhami
 * Date: 9/13/17
 * Time: 12:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class Java8Examples {

       public static void main(String args[]) {
           String str= new String("quick brown fox jumps over the lazy dog");
           System.out.println(str);
           System.out.println("String str starts with quick: "+str.startsWith("quick"));
           System.out.println("String str starts with brown: "+str.startsWith("brown"));
           System.out.println("substring of str(starting from 6th index) has brown prefix: "
                +str.startsWith("brown", 6));
           System.out.println("substring of str(starting from 6th index) has quick prefix: "
                +str.startsWith("quick", 6));
           System.out.println("String str ends with dog: "+str.endsWith("dog"));


    }
}
