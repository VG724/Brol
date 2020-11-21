package millionsqvpsp;

/**
 *
 * @author P.G.
 */
public class Tirage {

    private final Etoiles etoiles;
    private final Numeros numeros;
    private String nom ;

    public Tirage() {
        this.etoiles = new Etoiles();
        this.numeros = new Numeros();
        this.nom = "TIRAGE OFFICIEL" ;
        etoiles.drawEtoiles();
        numeros.drawNumeros();
    }
    
    public Tirage(String nom, int n1, int n2, int n3, int n4, int n5, int e1, int e2) {
        this.etoiles = new Etoiles();
        this.numeros = new Numeros();
        this.nom = "TIRAGE OFFICIEL" ;
        setNom(nom);
        SetNumero(n1, n2, n3, n4, n5, e1, e2);
    }

    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }
       
    private void SetNumero(int n1, int n2, int n3, int n4, int n5, int e1, int e2) {
        numeros.setNumeros(n1, n2, n3, n4, n5);
        etoiles.setEtoiles(e1, e2);
    }
    
    public void draw(){
        etoiles.drawEtoiles();
        numeros.drawNumeros();
    }
    
    public boolean areSame(Tirage tirageTocompTirage){
       return etoiles.areEtoilesSame(tirageTocompTirage.getEtoiles()) && numeros.areNumeroSame(tirageTocompTirage.getNumeros());
    }

    public Etoiles getEtoiles() {
        return etoiles;
    }

    public Numeros getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return "EM de " + nom + "!  Grille : " + numeros.toString() + "et "+ etoiles.toString();
    }
    
    
    

}
