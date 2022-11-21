package com.snehashis.hpgas.Dao;

import com.snehashis.hpgas.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao  extends JpaRepository<Customer, Integer> {

}
