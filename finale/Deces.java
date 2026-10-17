package modele;

import java.util.Date;

public class Deces extends EvenementCivil {

    public Citoyens citoyen;
    public Mairie mairie;

    public Deces(Date dateE, String l, Citoyens c, Mairie mri) {
        super(dateE, l);
        this.citoyen = c;
        this.mairie = mri;
    }

    public String toString() {
        return "Deces a " + lieu + " - " + citoyen.prenom + " " + citoyen.nom;
    }
}
