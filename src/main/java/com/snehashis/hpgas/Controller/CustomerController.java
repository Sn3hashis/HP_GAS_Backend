package com.snehashis.hpgas.Controller;

import com.snehashis.hpgas.Entity.Customer;
import com.snehashis.hpgas.Repository.Implementation.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;

    @GetMapping("/customer")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
    @PostMapping("/customer")
    public void addNewCustomer(@RequestBody Customer newCustomer){
         customerService.addNewCustomer(newCustomer);

    }

}
