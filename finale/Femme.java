package modele;

import java.util.Date;

public class Femme extends Citoyens {

    public Femme(int id, String n, String p, Date dateN, Mairie mri) {
        super(id, n, p, dateN, mri);
    }

    public String toString() {
        return "Femme - " + super.toString();
    }
}
