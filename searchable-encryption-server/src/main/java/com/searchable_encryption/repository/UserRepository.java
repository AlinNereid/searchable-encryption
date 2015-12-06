package com.searchable_encryption.repository;

/**
 * Created by Alexandru on 11/3/2015.
 */
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

}
