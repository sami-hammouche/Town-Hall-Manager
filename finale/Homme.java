package modele;

import java.util.Date;

public class Homme extends Citoyens {

    public Homme(int id, String n, String p, Date dateN, Mairie mri) {
        super(id, n, p, dateN, mri);
    }

    public String toString() {
        return "Homme - " + super.toString();
    }
}
