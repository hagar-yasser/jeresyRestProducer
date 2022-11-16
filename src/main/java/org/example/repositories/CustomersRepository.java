package org.example.repositories;

import org.example.models.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomersRepository {
    public static Map<String, Customer> customersMap;
    static{
        customersMap=new HashMap<String, Customer>();
        customersMap.put("id1",new Customer("id1",13,"firstName1","lastName1"));
        customersMap.put("id2",new Customer("id2",13,"firstName2","lastName2"));
        customersMap.put("id3",new Customer("id3",13,"firstName2","lastName2"));
        customersMap.put("id4",new Customer("id4",13,"firstName4","lastName4"));

    }
}
