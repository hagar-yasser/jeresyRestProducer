package org.example.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.models.Customer;
import org.example.repositories.CustomersRepository;

import java.util.Map;

@Path("/")
public class CustomerServiceController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getAllCustomers")
    public Map<String, Customer> getAll(){
        return CustomersRepository.customersMap;
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/createCustomer/{id}")
    public Response addCustomer(@PathParam("id") String id, Customer customer){


        if(CustomersRepository.customersMap.containsKey(id)){
            return Response.status(400,"id already exists").build();
        }
        if(customer==null){
            return Response.status(400,"empty customer cannot be added").build();
        }
        CustomersRepository.customersMap.put(id,customer);
        return Response.status(200,"Customer Created successfully").build();

    }
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/updateCustomer/{id}")
    public Response updateCustomer(@PathParam("id") String id, Customer customer){
        if(!CustomersRepository.customersMap.containsKey(id)){
            return Response.status(400,"id doesn't exist").build();
        }
        if(customer==null){
            return Response.status(400,"Cannot update to an empty customer").build();
        }
        CustomersRepository.customersMap.put(id,customer);
        return Response.status(200,"Customer updated successfully").build();
    }
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/deleteCustomer/{id}")
    public Response deleteCustomer(@PathParam("id") String id){
        if(!CustomersRepository.customersMap.containsKey(id)){
            return Response.status(400,"id doesn't exist").build();
        }
        CustomersRepository.customersMap.remove(id);
        return Response.status(200,"Customer Deleted successfully").build();

    }
}
