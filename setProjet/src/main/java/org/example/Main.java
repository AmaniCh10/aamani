package org.example;

public class Main {
    public static void main(String[] args) {
        Enseignant e1=new Enseignant(1,"aman","chamakh");
        Enseignant e2=new Enseignant(1,"aman","chamakh");
        Enseignant e3=new Enseignant(2,"nom3","chamakh");
        Enseignant e4=new Enseignant(3,"aman","chamakh");


        EspritHashset eh=new EspritHashset();
        eh.ajouterEnseignant(e1);
        eh.ajouterEnseignant(e2);
        eh.ajouterEnseignant(e3);
        eh.ajouterEnseignant(e4);
        eh.displayEnseignants();
        System.out.println(eh.rechercherEnseignant(1));
    }

}