package modele;

import java.util.Date;

public class Mariage extends EvenementCivil {

    public Homme homme;
    public Femme femme;
    public Mairie mairie;
    public Divorce divorce;

    public Mariage(Date dateE, String l, Homme h, Femme f, Mairie mri) {
        super(dateE, l);
        this.homme = h;
        this.femme = f;
        this.mairie = mri;
        this.divorce = null;
    }

    public String toString() {
        String etat = (divorce == null) ? "en cours" : "divorce";
        return "Mariage a " + lieu + " - " + homme.nom + " et " + femme.nom + " (" + etat + ")";
    }
}
