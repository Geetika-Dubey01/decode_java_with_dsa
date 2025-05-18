package strings;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        String s = "raghav";
        char[] ch =  s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.println(ele);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder();
    }
}