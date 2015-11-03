package security;

import org.springframework.security.core.GrantedAuthority;
import security.authority.Role;

import static security.authority.*;
/**
 * Created by Alexandru on 11/2/2015.
 */
public class AdminRoleAuthority implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return Role.ADMIN.toString();
    }
}
