package array;

public class FirstBadVersion {
    public static void main(String[] args) {
        int n =5, bad =2 , l = 1, e=n;
        System.out.println(search(n, bad));
    }

    public static int search(int n,int bad) {
        int l =1, e =n;
        while (l < e) {
            int mid = (l + e) / 2;
            if (bad == mid) {
                return bad;
            }
            if (bad < mid) {
                e=mid;
            } else {
                l=mid+1;
            }
        }
        return -1;
    }
}
