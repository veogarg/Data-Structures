package Arrays;
import java.util.*;

class ArrayLi {
    public static void main(String[] args) {
        int n  = 5;
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
        for (int i=1; i<=n; i++) 
                arrli.add(i);
        System.out.println(arrli);
    }
}
