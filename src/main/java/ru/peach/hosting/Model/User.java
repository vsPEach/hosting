package ru.peach.hosting.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class User {

    @JsonProperty("fullname")
    private String fullname;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("date")
    private String date;

    @JsonProperty("group")
    private String group;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("isTeacher")
    private boolean isTeacher;

}
