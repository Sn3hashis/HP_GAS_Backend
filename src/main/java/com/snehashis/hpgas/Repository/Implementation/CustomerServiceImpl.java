package com.snehashis.hpgas.Repository.Implementation;

import com.snehashis.hpgas.Dao.CustomerDao;
import com.snehashis.hpgas.Entity.Customer;
import com.snehashis.hpgas.Repository.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDao customerDao;

    public List<Customer> getAllCustomer(){
        return  customerDao.findAll();
    }

    public Optional<Customer> addNewCustomer(Customer newCustomer){
        customerDao.save(newCustomer);

        return  customerDao.findById(newCustomer.getId());

    }
}
