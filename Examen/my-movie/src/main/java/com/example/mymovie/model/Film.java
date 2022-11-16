package com.example.mymovie.model;

import io.swagger.annotations.ApiModelProperty;

public class Film {
    @ApiModelProperty(notes = "Titre du film",name="titre",required=true,value="test titre")
    private String titre;
    @ApiModelProperty(notes = "Réalisateur du film",name="realisateur",required=true,value="test realisateur")
    private String realisateur;
    @ApiModelProperty(notes = "Acteur principal du film",name="acteurPrincipal",required=true,value="test acteurPrincipal")
    private String acteurPrincipal;
    @ApiModelProperty(notes = "Date de sortie du film",name="dateSortie",required=true,value="test dateSortie")
    private String dateSortie;

    public Film(String titre, String realisateur, String acteurPrincipal, String dateSortie) {
        super();
        this.titre = titre;
        this.realisateur = realisateur;
        this.acteurPrincipal = acteurPrincipal;
        this.dateSortie = dateSortie;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public String getActeurPrincipal() {
        return acteurPrincipal;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", acteurPrincipal='" + acteurPrincipal + '\'' +
                ", dateSortie='" + dateSortie + '\'' +
                '}';
    }
}
