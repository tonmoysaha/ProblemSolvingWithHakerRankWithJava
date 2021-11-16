package array;

public class FirstBadVersionRecursion {
    public static void main(String[] args) {
        int n =789689797, bad =7777799 , l = 1, e=n;
        System.out.println(search(bad, l, e));
    }

    public static int search(int bad, int l, int e) {
        int mid = (l + e) / 2;
        if (l <= e) {
            if (bad == mid) {
                return bad;
            }
            if (bad < mid) {
                return search(bad,l, mid-1);
            } else {
                return search(bad, mid+1, e);
            }
        }
        return -1;
    }
}
