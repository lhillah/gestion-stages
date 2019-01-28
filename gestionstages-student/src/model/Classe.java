package model;

import contrat.Etudiant;
import contrat.Filiere;
import contrat.Niveau;

import java.util.Set;

public final class Classe implements contrat.Classe {

    private final Niveau niveau;
    private final Filiere filiere;
    private final String annee;
    private final Set<contrat.Etudiant> etudiants;


    public Classe(Niveau niveau, Filiere filiere, String annee) {
        this.niveau = null;
        this.filiere = null;
        this.annee = null;
        this.etudiants = null;
    }


    @Override
    public Niveau getNiveau() {
        return null;
    }

    @Override
    public String getAnnee() {
        return null;
    }

    @Override
    public Filiere getFiliere() {
        return null;
    }

    @Override
    public Set<Etudiant> getEtudiants() {
        return null;
    }

    @Override
    public boolean addEtudiants(Etudiant etu) {
        return false;
    }

    @Override
    public boolean removeEtudiant(Etudiant etu) {
        return false;
    }
}
