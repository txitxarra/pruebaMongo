package com.txitxarra.aplimongo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
public class Favorite {

    @Field(value = "artist")
    private String artist;
    @Field(value = "food")
    private String food;
}
