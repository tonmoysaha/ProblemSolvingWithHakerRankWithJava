package string;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String[] strs = {"flower","fkow"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String lowPref = "";
        String maxPref = "";
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
                    lowPref = "";
                    break;
                }
            }
            if (firstPre) {
                lowPref += firstString.charAt(j);
            }
            if (lowPref.length() > maxPref.length()){
                maxPref =  lowPref;
            }
        }
        return maxPref;
    }
}
