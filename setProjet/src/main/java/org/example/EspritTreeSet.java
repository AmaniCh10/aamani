package org.example;

import java.util.HashSet;
import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant{
    TreeSet<Enseignant> tree=new TreeSet<>();

    @Override
    public void ajouterEnseignant(Enseignant e) {
        tree.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return tree.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for(Enseignant e:tree){
            if(e.getId()==id)
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        System.out.println(tree.remove(e));
    }

    @Override
    public void displayEnseignants() {
        for(Enseignant e:tree){
            System.out.println(e);
        }
    }
}

