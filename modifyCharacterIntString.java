package strings;
public class modifyCharacterIntString {
    public static void main(String[] args) {
        String s = "hello";
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}