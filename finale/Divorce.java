package modele;

import java.util.Date;

public class Divorce {

    public Date dateDivorce;
    public Mariage mariage;

    public Divorce(Date dd, Mariage m) {
        this.dateDivorce = dd;
        this.mariage = m;
    }

    public String toString() {
        return "Divorce - " + mariage.homme.nom + " et " + mariage.femme.nom;
    }
}
