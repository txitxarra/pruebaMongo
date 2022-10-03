package com.txitxarra.aplimongo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
public class Phone {

    @Field(value = "personal")
    private String personal;
    @Field(value = "work")
    private String work;
    @Field(value = "ext")
    private String ext;
}
