package millionsqvpsp;

/**
 *
 * @author P.G
 */
public class MILLIONSQVPSP {

    private static Tirage[] joueurs;
    private static Tirage DRAW;

    public static void main(String[] args) {
        joueurs = new Tirage[6];
        joueurs[0] = new Tirage("JOUEUR1", 1, 2, 3, 4, 5, 1, 2);
        joueurs[1] = new Tirage("JOUEUR2", 6, 7, 8, 9, 10, 3, 4);
        joueurs[2] = new Tirage("JOUEUR3", 11, 12, 13, 14, 15, 5, 6);
        joueurs[3] = new Tirage("JOUEUR4", 16, 17, 18, 19, 20, 7, 8);
        joueurs[4] = new Tirage("JOUEUR5", 21, 22, 23, 24, 25, 9, 10);
        joueurs[5] = new Tirage("JOUEUR6", 46, 47, 48, 49, 50, 11, 12);

        int tirage = 1;
        DRAW = new Tirage();
        for (int i = 0; i < 6; i++) {
            System.out.println(joueurs[i]);
        }
        boolean gagnant = false;
        while (!gagnant) {
            for (int i = 0; i < 6; ++i) {
                if (DRAW.areSame(joueurs[i])) {
                    gagnant = true;
                    System.out.println("NOTRE GAGNANT au " + tirage + "ème tirage EST : " + joueurs[i].getNom());
                }
            }
            if (!gagnant) {
                ++tirage;
                DRAW = new Tirage();
            }
        }

        System.out.println(DRAW);
    }
}
