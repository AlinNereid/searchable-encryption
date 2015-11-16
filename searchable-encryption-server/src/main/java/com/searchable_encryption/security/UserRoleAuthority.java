package com.searchable_encryption.security;

import org.springframework.security.core.GrantedAuthority;
import com.searchable_encryption.security.authority.Role;

/**
 * Created by Alexandru on 11/2/2015.
 */
public class UserRoleAuthority implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return Role.USER.toString();
    }
}
