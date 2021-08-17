package com.rpegorov.aggregator.models.iway;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Method {

    GET_PRICE("GetPrice");

    private final String name;
}
