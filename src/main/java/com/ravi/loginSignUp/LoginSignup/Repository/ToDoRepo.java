package com.ravi.loginSignUp.LoginSignup.Repository;

import com.ravi.loginSignUp.LoginSignup.Entity.ToDoEntity;
import com.ravi.loginSignUp.LoginSignup.Entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class
ToDoRepo  {
    @PersistenceContext
    EntityManager entityManager;

    public void save(ToDoEntity toDoEntity) {
        entityManager.persist(toDoEntity);

    }
    public List<ToDoEntity> findByUseriId() {

        TypedQuery<ToDoEntity> toDoDetails=entityManager.createQuery("select u from ToDoEntity u", ToDoEntity.class);

        return toDoDetails.getResultList();
    }


}
