package com.rpegorov.aggregator.services.service.interfaces;

import java.util.List;

public interface SearchServices {

    List<String> searchPrices(int userId, String startPlace, String finishPlace);
}
