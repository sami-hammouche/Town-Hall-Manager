package modele;

import java.util.Date;

public class Citoyens {

    public int idUnique;
    public String nom;
    public String prenom;
    public Date dateNaissance;
    public Mairie mairie;

    public Citoyens(int id, String n, String p, Date dateN, Mairie mri) {
        this.idUnique = id;
        this.nom = n;
        this.prenom = p;
        this.dateNaissance = dateN;
        this.mairie = mri;
    }

    public String toString() {
        return "ID " + idUnique + " - " + prenom + " " + nom;
    }
}
