package millionsqvpsp;

/**
 *
 * @author P.G.
 */
public class Etoiles {

    private int e1;
    private int e2;

    public Etoiles() {
        e1 = -1;
        e2 = -1;
    }

    public void setEtoiles(int et1, int et2) {
        e1 = et1;
        e2 = et2;
    }

    public int getEtoile(int numberOFEtoile) {
        if (numberOFEtoile != 1 && numberOFEtoile != 2) {
            throw new IllegalArgumentException("bad number");
        }
        return numberOFEtoile == 1 ? e1 : e2;
    }

    public boolean areEtoilesSame(Etoiles etoilesToCompare) {
        return (etoilesToCompare.getEtoile(1) == e1 || etoilesToCompare.getEtoile(1) == e2) && (etoilesToCompare.getEtoile(2) == e1 || etoilesToCompare.getEtoile(2) == e2);
    }
    
    public void drawEtoiles(){
        e1 = Utils.tirerEntierAuHasard(1, 12);
        e2 = Utils.tirerEntierAuHasard(1, 12);
        while(e1 == e2){
           e2 = Utils.tirerEntierAuHasard(1, 12); 
        }
    }

    @Override
    public String toString() {
        return "Etoiles le " + e1 + " et le " + e2 + " !";
    }

}
