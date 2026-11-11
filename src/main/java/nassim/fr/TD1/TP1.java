package nassim.fr.TD1;

public class TP1{

    public static int lastZero ( int[] x) {
        for ( int i = x.length-1 ; i >= 0  ; i--) {
            if ( x[i] == 0 ) {
                return i ;
            }
        }
        return -1;
    }
}
