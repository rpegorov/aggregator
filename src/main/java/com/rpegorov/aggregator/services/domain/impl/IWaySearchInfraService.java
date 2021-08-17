package com.rpegorov.aggregator.services.domain.impl;

import com.rpegorov.aggregator.models.infra.SearchInfra;
import com.rpegorov.aggregator.models.iway.GetPriceRequestDto;
import com.rpegorov.aggregator.models.iway.RequestDto;
import com.rpegorov.aggregator.services.domain.interfaces.SearchInfraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

import static com.rpegorov.aggregator.services.domain.impl.IWaySearchInfraService.BEAN_NAME;

@Service(BEAN_NAME)
@RequiredArgsConstructor
public class IWaySearchInfraService implements SearchInfraService {

    public static final String BEAN_NAME = "search-iway";

    private static final RestTemplate REST_TEMPLATE = new RestTemplate();

    @Override
    public SearchInfra search(int userId,
                              String startPlace,
                              String finishPlace) {
        RequestDto body = RequestDto.builder()
                .method("GetPrice")
                .params(GetPriceRequestDto.builder().userID(userId)
                        .currency("RUB")
                        .startPlaceAuditID(startPlace)
                        .finishPlaceAuditID(finishPlace)
                        .build())
                .build();

        HttpEntity<RequestDto> request = new HttpEntity<>(body);
        return REST_TEMPLATE.postForObject(
                "http://sandbox.iway.io/rpc",
                request,
                SearchInfra.class);
    }
}
