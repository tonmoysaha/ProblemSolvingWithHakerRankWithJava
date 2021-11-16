package string;

public class LongestCommonPrefixFaster {
    public static void main(String[] args) {
        String[] strs = {"flower","fkow"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String lowPref = "", firstString = strs[0];
        int arrayLength = strs.length, initialLoop = 0 , firstLength = firstString.length();
        boolean firstPre = false;
        if (arrayLength == 1) {
            return strs[0];
        }
        while (initialLoop < firstLength) {
            for (int i = 1; i < arrayLength; i++) {
                if (firstString.charAt(initialLoop) == strs[i].charAt(initialLoop)) {
                    firstPre = true;
                }else return lowPref;

            }
            if (firstPre) {
                lowPref += firstString.charAt(initialLoop);
                initialLoop++;
                firstPre = false;
            }else break;

        }
        return lowPref;
    }
}
