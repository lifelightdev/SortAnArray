import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortAnArrayTest {

    @Test
    public void SortAnArrayEmptyTest(){

        int[] list = {152, 5, 596, 63} ;
        int[] result = {5, 63, 152, 596} ;
        assertArrayEquals(SortAnArray.getSortAnArray(list),result);

    }
}
