package ru.peach.hosting.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@Data
public class User {

    @JsonProperty("fullname")
    private String fullname;

    @JsonProperty("email")
    @NotNull
    private String email;

    @JsonProperty("password")
    @NotNull
    private String password;

    @JsonProperty("date")
    private String date;

    @JsonProperty("team")
    private String team;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("isTeacher")
    private boolean isTeacher;

}
