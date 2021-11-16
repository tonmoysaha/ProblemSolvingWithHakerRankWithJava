package string;

public class LongestCommonStringPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","fkow"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String lowPref = "";
        if (strs.length == 1) {
            return strs[0];
        }
        String firstString = strs[0];
        for (int j = 0; j < firstString.length(); j++) {
            boolean firstPre = false;
            for (int i = 1; i < strs.length; i++) {
                if (j < strs[i].length() && firstString.charAt(j) == strs[i].charAt(j)) {
                    firstPre = true;
                }else {
                    return lowPref;
                }
            }
            if (firstPre) {
                lowPref += firstString.charAt(j);
            }else {
                break;
            }
        }
        return lowPref;
    }
}
