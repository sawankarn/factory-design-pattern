package com.hcl.demo;

import com.hcl.demo.entity.Customer;
import com.hcl.demo.factory.CommunicationFactory;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        createCustomer().forEach(customer -> {
            new CommunicationFactory().getProcess(customer.getModeOfContact())
                    .process(customer);
        });
    }

    private static List<Customer> createCustomer(){
        List<Customer> customerList = new ArrayList<>();
        Customer c1 = new Customer("Sawan Kumar","Java","email","sawan@email.com","0123456789");
        Customer c2 = new Customer("Stuat Binny","Cricket","mobile","stuart@email.com","5721558662");
        Customer c3 = new Customer("Elon Musk","Crypto","email","elon@email.com","5856532489");
        Customer c4 = new Customer("Kristein Miller","Java","email","kristeing@email.com","1589645238");
        Customer c5 = new Customer("Sachin Tendulkar","Cricket","mobile","sachin@email.com","985624859");

        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        customerList.add(c5);

        return customerList;
    }
}
