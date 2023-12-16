package com.Centum.NationalMart.dto;

import com.Centum.NationalMart.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class OrderRequest {
    private Customer Customer;

    public com.Centum.NationalMart.entity.Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(com.Centum.NationalMart.entity.Customer customer) {
        Customer = customer;
    }
}
