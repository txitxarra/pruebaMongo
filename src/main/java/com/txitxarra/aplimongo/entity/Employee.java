package com.txitxarra.aplimongo.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@Document(collection = "Employees")
@AllArgsConstructor
public class Employee {

    @Id
    private String _id;
    @Field(value= "uuid")
    private String uuid;
    @Field(value = "name")
    private String name;
    @Field(value = "age")
    private Integer age;
    @Field(value = "phone")
    private Phone phone;
    @Field(value = "privileges")
    private String privileges;
    @Field(value = "favorites")
    private Favorite favorites;
    @Field(value = "finished")
    private List<Integer> finished;
    @Field(value = "badges")
    private List<String> badges;
    @Field(value = "points")
    private List<Point> points;
}
