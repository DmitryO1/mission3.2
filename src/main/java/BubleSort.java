/**
 * Created by Dmitry on 09.11.2016.
 */
public class BubleSort {

public static int [] sort(int [] a){
    boolean check = true;
    while (check)
    for(int i=1;i<a.length;i++) {
        check = false;
        if (a[i-1] > a[i]) {
            int temp = a[i];
            a[i] = a[i-1];
            a[i-1] = temp;
            check=true;
        }
    }
    return a;
}
}
