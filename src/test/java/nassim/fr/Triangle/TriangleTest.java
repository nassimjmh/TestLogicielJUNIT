package nassim.fr.Triangle;

import nassim.fr.Triangle.Triangle;
import nassim.fr.Triangle.TriangleException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {

    @Test
    void constructTest(){
        assertThrows(TriangleException.class,
                () -> new Triangle(1,2,3));
        assertThrows(TriangleException.class,
                () -> new Triangle(0,1,0));
    }
}

