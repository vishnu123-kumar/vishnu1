package com.org.shop.controller;


import com.org.shop.model.CustomerDetails;
import com.org.shop.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/com")
public class Controller {
   @Autowired
    CustomerServices customerServices;

    @PostMapping("/create")
   public void create (@RequestBody CustomerDetails customerDetails){
        customerServices.create(customerDetails);
   }
   @PutMapping("/update")
    public void update (@RequestBody CustomerDetails customerDetails){
       customerServices.update(customerDetails);
    }
    @DeleteMapping("/delete/{Id}")
    public void deleteById (@PathVariable int id){
        customerServices.deleteById(id);
    }
    @GetMapping("/retrive")
    public List<CustomerDetails> getAll(){

        return getAll();
    }

}
