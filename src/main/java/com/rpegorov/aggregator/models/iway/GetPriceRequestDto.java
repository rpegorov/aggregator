package com.rpegorov.aggregator.models.iway;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetPriceRequestDto {

    private int userID;
    private String currency;

    @Builder.Default
    private String lang = "ru";

    private String startPlaceAuditID;
    private String finishPlaceAuditID;
}
