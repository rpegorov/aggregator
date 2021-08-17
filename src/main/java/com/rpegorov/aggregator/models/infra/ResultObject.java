package com.rpegorov.aggregator.models.infra;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultObject {

    @JsonProperty("PriceRUB")
    private String priceRub;
}
