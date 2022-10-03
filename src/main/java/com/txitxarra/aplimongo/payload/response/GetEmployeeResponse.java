package com.txitxarra.aplimongo.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetEmployeeResponse {

    @JsonProperty
    private String name;
    @JsonProperty
    private Integer age;
    @JsonProperty
    private PhoneResponse phone;
    @JsonProperty
    private String privileges;
    @JsonProperty
    private FavoriteResponse favorites;
    @JsonProperty
    private List<Integer> finished;
    @JsonProperty
    private List<String> badges;
    @JsonProperty
    private List<PointResponse> points;
    @JsonProperty
    private String uuid;
}
