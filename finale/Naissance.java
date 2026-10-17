package modele;

import java.util.Date;

public class Naissance extends EvenementCivil {

    public Homme homme;
    public Femme femme;
    public Mairie mairie;

    public Naissance(Date dateE, String l, Homme h, Femme f, Mairie mri) {
        super(dateE, l);
        this.homme = h;
        this.femme = f;
        this.mairie = mri;
    }

    public String toString() {
        return "Naissance a " + lieu + " - pere : " + homme.nom + ", mere : " + femme.nom;
    }
}
