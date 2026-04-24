package com.example.atividade;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends  JpaRepository<User, Long>{
}
