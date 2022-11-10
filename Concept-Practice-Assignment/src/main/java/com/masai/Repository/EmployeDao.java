package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Emoployee;
@Repository
public interface EmployeDao extends JpaRepository<Emoployee, Integer> {

}
