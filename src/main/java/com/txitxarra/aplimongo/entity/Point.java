package com.txitxarra.aplimongo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
public class Point {

    @Field(value = "points")
    private Integer points;
    @Field(value = "bonus")
    private Integer bonus;

}