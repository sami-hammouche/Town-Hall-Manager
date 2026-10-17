package modele;

import java.util.Vector;

public class Mairie {

    public int idUnique;

    public Vector<Citoyens> list_citoyens = new Vector<Citoyens>();
    public Vector<Naissance> list_naissance = new Vector<Naissance>();
    public Vector<Mariage> list_mariage = new Vector<Mariage>();
    public Vector<Deces> list_deces = new Vector<Deces>();
    public Vector<Divorce> list_divorce = new Vector<Divorce>();

    public Mairie(int id) {
        this.idUnique = id;
    }

    public void ajoutCitoyen(Citoyens c) {
        this.list_citoyens.add(c);
    }

    public void ajoutNaissance(Naissance n) {
        this.list_naissance.add(n);
    }

    public void ajoutMariage(Mariage m) {
        this.list_mariage.add(m);
    }

    public void ajoutDeces(Deces d) {
        this.list_deces.add(d);
    }

    public void ajoutDivorce(Divorce d) {
        this.list_divorce.add(d);
    }

    public Citoyens chercherCitoyen(int id) {
        for (Citoyens c : list_citoyens) {
            if (c.idUnique == id) {
                return c;
            }
        }
        return null;
    }

    public Vector<Naissance> chercherNaissance(String lieu) {
        Vector<Naissance> resultat = new Vector<Naissance>();
        for (Naissance n : list_naissance) {
            if (n.lieu.equalsIgnoreCase(lieu)) {
                resultat.add(n);
            }
        }
        return resultat;
    }

    public Vector<Mariage> chercherMariage(String lieu) {
        Vector<Mariage> resultat = new Vector<Mariage>();
        for (Mariage m : list_mariage) {
            if (m.lieu.equalsIgnoreCase(lieu)) {
                resultat.add(m);
            }
        }
        return resultat;
    }

    public Vector<Deces> chercherDeces(String lieu) {
        Vector<Deces> resultat = new Vector<Deces>();
        for (Deces d : list_deces) {
            if (d.lieu.equalsIgnoreCase(lieu)) {
                resultat.add(d);
            }
        }
        return resultat;
    }

    public Vector<Divorce> chercherDivorce(int idCitoyen) {
        Vector<Divorce> resultat = new Vector<Divorce>();
        for (Divorce d : list_divorce) {
            if (d.mariage.homme.idUnique == idCitoyen || d.mariage.femme.idUnique == idCitoyen) {
                resultat.add(d);
            }
        }
        return resultat;
    }

    public Mariage chercherMariageParCitoyen(int idCitoyen) {
        for (Mariage m : list_mariage) {
            if (m.homme.idUnique == idCitoyen || m.femme.idUnique == idCitoyen) {
                return m;
            }
        }
        return null;
    }
}
