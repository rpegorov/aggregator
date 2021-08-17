package com.rpegorov.aggregator.services.domain.interfaces;


import com.rpegorov.aggregator.models.infra.SearchInfra;

public interface SearchInfraService {

    SearchInfra search(int userId, String startPlace, String finishPlace);
}
