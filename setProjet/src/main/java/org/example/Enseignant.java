package org.example;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Enseignant implements Comparator<Enseignant>{
    public int id;
    public String nom;
    public String prenom;


    @Override
    public int compare(Enseignant o1, Enseignant o2) {
        return o1.compareTo(o2);
    }

    public int compareTo(Enseignant o) {
        return o.id-this.id;
    }

    public boolean equals(Object obj) {
            if(obj==this)
                return true;

            if(obj==null) return false;

            if(obj.getClass()!=this.getClass())
                return false;

            Enseignant pe=(Enseignant) obj;
            if(pe.id==id)
                return true;
            return false;
        }
    public int hashCode(){
        return id+nom.hashCode()+prenom.hashCode();
    }


    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }  public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    public Enseignant(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
