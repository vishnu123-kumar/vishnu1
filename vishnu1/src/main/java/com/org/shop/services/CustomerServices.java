package com.org.shop.services;

import com.org.shop.model.CustomerDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CustomerServices {


    public void create (@RequestBody CustomerDetails customerDetails);

    public void update (@RequestBody CustomerDetails customerDetails);

    public void deleteById (@PathVariable int id);

    public List<CustomerDetails> getAll();
}

