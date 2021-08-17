package com.rpegorov.aggregator.models.infra;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchResultInfra {

    @JsonProperty("Result")
    private List<ResultObject> result;

    @JsonProperty("ItemCount")
    private String itemCount;

    @JsonProperty("BlockCount")
    private String blockCount;
}
