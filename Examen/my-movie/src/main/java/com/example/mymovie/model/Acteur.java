package com.example.mymovie.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Acteur {
    @ApiModelProperty(notes = "Nom de l'acteur",name="nom",required=true,value="test nom")
    private String nom;
    @ApiModelProperty(notes = "Date de naissance de l'acteur",name="dateNaissance",required=true,value="test dateNaissance")
    private String dateNaissance;
    @ApiModelProperty(notes = "Filmographie de l'acteur",name="filmographie",required=true,value="test filmographie")
    private String filmographie;

    public Acteur(String nom, String dateNaissance, String filmographie) {
        super();
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.filmographie = filmographie;
    }

    public String getNom() {
        return nom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getFilmographie() {
        return filmographie;
    }

    @Override
    public String toString() {
        return "Acteur{" +
                "nom='" + nom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", filmographie='" + filmographie + '\'' +
                '}';
    }
}
