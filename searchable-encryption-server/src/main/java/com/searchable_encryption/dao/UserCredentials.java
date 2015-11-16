package com.searchable_encryption.dao;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by Alexandru on 11/2/2015.
 */
@Entity
public class UserCredentials implements Serializable {

    private String username;
    private Long userId;
    private boolean isValid;
    private GrantedAuthority userAuthority;
}
