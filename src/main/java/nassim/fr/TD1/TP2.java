package nassim.fr.TD1;

public class TP2 {
    public static int oddOrPos(int[] x) {
        int count = 0 ;
        for( int i = 0 ; i < x.length; i++) {
            if( Math.abs(x[i])%2 == 1 || x [i] > 0 ) {
                count++;
            }
        }
        return count ;
    }

}
