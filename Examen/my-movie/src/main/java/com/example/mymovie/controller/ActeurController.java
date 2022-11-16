package com.example.mymovie.controller;

import com.example.mymovie.model.Acteur;
import com.example.mymovie.model.Film;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Api(value = "Swagger2RestActeurController", tags = {"REST Apis related to Acteur Entity!!!!"})
@RestController
public class ActeurController {
    List<Acteur> acteurs = new ArrayList<Acteur>();
    {
        acteurs.add(new Acteur("Chloe", "13/11/1991", "Toto"));
        acteurs.add(new Acteur("Alex", "02/06/2010", "L'autruche, La montagne"));
        acteurs.add(new Acteur("Nico", "31/05/1957", "Titi"));
        acteurs.add(new Acteur("Jean", "23/08/1989", "Null"));
    }


    @ApiOperation(value = "Get list of Acteurs in the System ", response = Acteur.class, tags = "getActeurs")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })


    @RequestMapping(value = "/acteurs")
    public List<Acteur> getActeurs() {
        return acteurs;
    }


    @ApiOperation(value = "Get specific Acteur in the System ", response = Acteur.class, tags = "getActeur")
    @RequestMapping(value = "/acteur/{nom}")
    public Acteur getActeur(@PathVariable(value = "nom") String nom) {
        return acteurs.stream().filter(x -> x.getNom().equalsIgnoreCase(nom)).collect(Collectors.toList()).get(0);
    }


    @ApiOperation(value = "Get specific Acteur By Film in the System ", response = Acteur.class, tags = "getActeurByFilm")
    @RequestMapping(value = "/acteurByFilm/{film}")
    public List<Acteur> getActeurByYear(@PathVariable(value = "film") String film) {
        System.out.println("Searching Acteur in film : " + film);
        List<Acteur> acteurByFilm = acteurs.stream().filter(x -> x.getFilmographie().equalsIgnoreCase(film))
                .collect(Collectors.toList());
        System.out.println(acteurByFilm);
        return acteurByFilm;
    }
}
