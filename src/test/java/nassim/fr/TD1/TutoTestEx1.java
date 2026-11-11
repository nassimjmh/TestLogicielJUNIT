package nassim.fr.TD1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.Collection;
import nassim.fr.TD1.TP1;

public class TutoTestEx1 {


    @ParameterizedTest // data-driven test
    @MethodSource("data")
    void test(int[] input, int expected) {
        assertEquals(expected, TP1.lastZero(input));
    }

    // methode de fabrique a etre mentionnee par @MethodSource
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new int[]{0, 1, 0}, 2 }, // input, expected
                { new int[]{1, 2, 3}, -1 },
                { new int[]{0}, 0 }
        });
    }
}

