package io.mohona.footballmatch.resources;

import io.mohona.footballmatch.models.LeaguePosition;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/getStanding")
public class FoootballMatchResource {

    @RequestMapping(path="/{countryName}/{leagueName}/{teamName}",method= RequestMethod.GET)
    public List<LeaguePosition> getStanding(@PathVariable("countryName")  String countryName, @PathVariable("leagueName") String leagueName, @PathVariable("teamName") String teamName)
    {
        return Collections.singletonList(new LeaguePosition("C01","Sapient","L01","Football League","T01","Team1","1"));
    }
}
