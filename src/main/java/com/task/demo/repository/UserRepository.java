package com.task.demo.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.task.demo.entity.*;



@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
