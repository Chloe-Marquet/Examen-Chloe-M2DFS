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


@Api(value = "Swagger2RestFilmController", tags = {"REST Apis related to Film Entity!!!!"})
@RestController
public class FilmController {



    List<Film> films = new ArrayList<Film>();
    {
        films.add(new Film("Film 1", "Chloe", "Toto", "2020"));
        films.add(new Film("Film 2", "Chloe", "Titi", "2021"));
        films.add(new Film("Film 3", "Alex", "L'autruche", "2020"));
        films.add(new Film("Film 4", "Alex", "La montagne", "2019"));
    }


    @ApiOperation(value = "Get list of Films in the System ", response = Film.class, tags = "getFilms")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })


    @RequestMapping(value = "/films")
    public List<Film> getFilms() {
        return films;
    }


    @ApiOperation(value = "Get specific Film in the System ", response = Film.class, tags = "getFilm")
    @RequestMapping(value = "/film/{titre}")
    public Film getFilm(@PathVariable(value = "titre") String titre) {
        return films.stream().filter(x -> x.getTitre().equalsIgnoreCase(titre)).collect(Collectors.toList()).get(0);
    }


    @ApiOperation(value = "Get specific Film By Date de sortie in the System ", response = Film.class, tags = "getFilmByYear")
    @RequestMapping(value = "/filmByYear/{year}")
    public List<Film> getFilmByYear(@PathVariable(value = "year") String year) {
        System.out.println("Searching Film in year : " + year);
        List<Film> filmsByYear = films.stream().filter(x -> x.getDateSortie().equalsIgnoreCase(year))
                .collect(Collectors.toList());
        System.out.println(filmsByYear);
        return filmsByYear;
    }
}
