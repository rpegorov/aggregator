package com.rpegorov.aggregator.models.infra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchInfra {

    private String jsonrpc;
    private SearchResultInfra result;
    private int id;
}
