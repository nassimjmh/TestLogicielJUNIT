package nassim.fr.Triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {

    @Test
    void constructInvalid() {
        assertAll(
                () -> assertThrows(TriangleException.class, () -> new Triangle(1, 2, 3)),
                () -> assertThrows(TriangleException.class, () -> new Triangle(3, 1, 2)),
                () -> assertThrows(TriangleException.class, () -> new Triangle(1, 3, 2)),
                () -> assertThrows(TriangleException.class, () -> new Triangle(5, 1, 1)),
                () -> assertThrows(TriangleException.class, () -> new Triangle(-1, 2, 2)),
                () -> assertThrows(TriangleException.class, () -> new Triangle(0, 2, 2)),
                () -> assertThrows(TriangleException.class, () -> new Triangle(2, 0, 2)),
                () -> assertThrows(TriangleException.class, () -> new Triangle(2, 2, 0))
        );
    }
    /*
    Écris les tests de getType (équilatéral, isocèle, scalène) avant de coder la méthode, avec aussi
    les valeurs limites : isocèle sur chaque paire de côtés égaux (2,2,3), (2,3,2), (3,2,2).
    Pense à la comparaison de doubles (équilatéral avec 0.1+0.2 vs 0.3) si le sujet le demande,
    sinon note-le comme limite.
    */


}

