package com.hcl.demo.communication;

import com.hcl.demo.entity.Customer;
import com.hcl.demo.repository.Communication;

public class MobileCommunication implements Communication {
    @Override
    public void process(Customer customer) {
        System.out.println(customer.getName()+": send SMS to "+customer.getMobile());
    }
}
