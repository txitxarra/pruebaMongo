package com.txitxarra.aplimongo.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class FavoriteResponse {

    @JsonProperty
    private String artist;
    @JsonProperty
    private String food;
}
