package org.example;

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

public interface GestionEnseignant{
      public void ajouterEnseignant(Enseignant e);
      public boolean rechercherEnseignant (Enseignant e);
      public boolean rechercherEnseignant (int id);
      public void supprimerEnseignant (Enseignant e);
      public void displayEnseignants();
   }

