package nassim.fr.TD1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.Collection;
import nassim.fr.TD1.TP1;


public class TP1Test {

    @ParameterizedTest
    @MethodSource("data")
    void test(int[] input,int expected){
        assertEquals(expected, TP1.lastZero(input));
    }

    @Test
    void nullPointerException(){
        assertThrows(NullPointerException.class,
                () -> TP1.lastZero(null));
    }

    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                { new int[] {0,1,0}, 2},
                { new int[] {0}, 0 },
                { new int[] {1,1,0,1,1,1},2},
                { new int[] {1,1,1,0},3},
                { new int[] {1,1,1,1}, -1},
                { new int[] {}, -1}
        });
    }

}
