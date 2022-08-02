package org.example.solutionstore.controllers;

import org.example.solutionstore.model.Solution;
import org.example.solutionstore.services.SolutionService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/solutions/")
public class SolutionRestController {
    private final SolutionService solutionService;

    public SolutionRestController(SolutionService solutionService) {
        this.solutionService = solutionService;
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Solution> deleteSolution(@PathVariable("id") Long solutionId) {
        return solutionService.deleteSolution(solutionId);
    }

}
