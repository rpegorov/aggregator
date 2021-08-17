package com.rpegorov.aggregator.models.iway;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {

    @Builder.Default
    private String jsonrpc = "2.0";

    private String method;
    private GetPriceRequestDto params;

    @Builder.Default
    private int id = 1;

}
