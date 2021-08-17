package com.rpegorov.aggregator.controllers;

import com.rpegorov.aggregator.models.infra.SearchInfra;
import com.rpegorov.aggregator.services.service.interfaces.SearchServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SearchController {

    private final SearchServices searchServices;

    @GetMapping("/search")
    public List<String> search(@RequestParam("userId") int userId,
                                    @RequestParam("startPlace") String startPlace,
                                    @RequestParam("finishPlace") String finishPlace) {
        return searchServices.searchPrices(userId, startPlace, finishPlace);
    }
}
