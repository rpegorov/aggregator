package com.rpegorov.aggregator.services.service.impl;

import com.rpegorov.aggregator.models.infra.ResultObject;
import com.rpegorov.aggregator.models.infra.SearchInfra;
import com.rpegorov.aggregator.models.infra.SearchResultInfra;
import com.rpegorov.aggregator.services.domain.interfaces.SearchInfraService;
import com.rpegorov.aggregator.services.service.interfaces.SearchServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchServicesImpl implements SearchServices {

    private final Map<String, SearchInfraService> map;

    @Override
    public List<String> searchPrices(int userId, String startPlace, String finishPlace) {
        return map.values().stream()
                .map(e -> e.search(userId, startPlace, finishPlace))
                .map(SearchInfra::getResult)
                .map(SearchResultInfra::getResult)
                .map(e -> e.get(0))
                .map(ResultObject::getPriceRub)
                .collect(Collectors.toList());
    }
}
