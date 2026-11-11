package nassim.fr.TD1;

import nassim.fr.TD1.TP1;
import nassim.fr.TD1.TP2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TP2Test {

    @Test
    void NullPointerException(){
        assertThrows(NullPointerException.class,
                ()-> TP2.oddOrPos(null));
    }

    @ParameterizedTest
    @MethodSource("data")
    void testParam(int[] input, int output){
        assertEquals(output,TP2.oddOrPos(input));
    }
    public static Collection<Object> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{-3,-2,0,1,4}, 3},
                {new int[]{},0},
                {new int[]{1,2,3,4,-2,-4,-3},5},
                {new int[]{1,2,3},3}
        });
    }
}
