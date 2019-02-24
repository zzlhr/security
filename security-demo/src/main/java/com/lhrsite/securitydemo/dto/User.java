package com.lhrsite.securitydemo.dto;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class User {

    public interface UserSimpleView {}
    public interface UserDetailView extends UserSimpleView {}

    @JsonView(UserSimpleView.class)
    private Integer id;
    @JsonView(UserSimpleView.class)
    private String username;
    @JsonView(UserDetailView.class)
    private String password;
    @JsonView(UserSimpleView.class)
    private Date birthday;
}
