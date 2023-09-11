package com.example.petback.oauth2.dto;


import lombok.Getter;
import com.example.petback.user.entity.User;
import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name = user.getUsername();
        this.email = user.getEmail();
        this.picture = user.getImageUrl();
    }
}
