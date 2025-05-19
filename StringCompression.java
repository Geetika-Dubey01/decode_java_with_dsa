package strings;
public class StringCompression {
    public static void main(String[] args) {
        String s = "aaaaaaaggggggcccuuuuudehh";
        char[] arr = s.toCharArray();
        String ans = "";
        int i = 0, j = 0;
        while(j<arr.length) {
            if (arr[j] == arr[i]) j++;
            else {
                ans += arr[i];
//                ans.append(arr[i]);
                int len = j - i;
//                if(len>1)ans.append(len);
                if (len > 1) ans += len;
                i = j;
            }
        }
        ans += arr[i];
//        ans.append(arr[i]);
            int len = j-i;
            if (len>1) ans += len;
//        if(len>1)ans.append(len);
            for(i = 0; i<ans.length();i++){
                arr[i] = ans.charAt(i);
            }
//            return ans.length();
        System.out.println(ans.toString());
    }
}