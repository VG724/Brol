package millionsqvpsp;

/**
 *
 * @author P.G.
 */
public class Utils {
     public static int tirerEntierAuHasard(int valMin, int valMax) {
        return valMin + (int) (Math.random() * ((valMax - valMin) + 1));
    }
}
