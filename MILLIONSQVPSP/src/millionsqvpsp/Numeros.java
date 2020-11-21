package millionsqvpsp;

/**
 *
 * @author P.G.
 */
public class Numeros {

    private final int[] numeros;

    public Numeros() {
        numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = -1;
        }
    }

    public void setNumeros(int n1, int n2, int n3, int n4, int n5) {
        numeros[0] = n1;
        numeros[1] = n2;
        numeros[2] = n3;
        numeros[3] = n4;
        numeros[4] = n5;
    }

    public int getNumero(int numberOfNumero) {
        if (numberOfNumero < 0 || numberOfNumero > 4) {
            throw new IllegalArgumentException("bad number");
        }
        return numeros[numberOfNumero];
    }

    public boolean areNumeroSame(Numeros numerosToCompare) {
        boolean verification = true;
        for (int i = 0; i < 5 && verification; ++i) {
            boolean numeroOK = false;
            for (int j = 0; j < 5; ++j) {
                if (numerosToCompare.getNumero(j) == this.numeros[i]) {
                    numeroOK = true;
                }
            }
            verification = numeroOK;
        }
        return verification;
    }

    public void drawNumeros() {
        for (int i = 0; i < numeros.length; ++i) {
            boolean same = true ;
            do {
                same = false;
                numeros[i] = Utils.tirerEntierAuHasard(1, 50);
                for (int j = 0; j < i; ++j) {
                    if (numeros[i] == numeros[j]) {
                        same = true;
                    }
                }
            } while (same);
        }
    }

    @Override
    public String toString() {
        return "Numeros : " + numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3] + " " + numeros[4] + " ";
    }

}
