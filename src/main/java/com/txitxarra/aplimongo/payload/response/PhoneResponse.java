package com.txitxarra.aplimongo.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class PhoneResponse {
    @JsonProperty
    private String personal;
    @JsonProperty
    private String work;
    @JsonProperty
    private String ext;
}
