import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by Dmitry on 08.11.2016.
 */
public class BubleSortTests {
@Test//Positive #1
    public void sortList(){

    assertArrayEquals(new int[]{0,1},BubleSort.sort(new int[]{0,1}));
    System.out.println("Positive test has been passed '#1'");
}
@Test//Postive #2
    public void unsortedList() throws Exception{
    assertArrayEquals(new int[]{0,1},BubleSort.sort(new int[]{1,0}));
    System.out.println("Positive test has been passed '#2'");
}
@Test//Positive #3
    public void unsortedListLength3() throws Exception{
        assertArrayEquals(new int[]{0,1,2},BubleSort.sort(new int[]{0,2,1}));
    System.out.println("Positive test has been passed '#3'");
}
@Test//Positive #4
    public void unsortedListLength4() throws Exception{
        assertArrayEquals(new int[]{0,1,2},BubleSort.sort(new int[]{2,1,0}));
    System.out.println("Positive test has been passed '#4'");
}
    @Test(expected = AssertionError.class)//Negative #1
    public void unsortedListLengthLongLegth(){
        assertArrayEquals(new int[]{0,1,2},BubleSort.sort(new int[]{2,1,0,4}));
        System.out.println("Negative test has been passed '#4'");
    }
}
