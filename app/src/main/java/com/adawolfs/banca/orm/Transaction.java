package com.adawolfs.banca.orm;

import com.orm.SugarRecord;

/**
 * Created by adawolfs on 2/06/17.
 */

public class Transaction extends SugarRecord<Transaction> {
    
    User user;
    String description;
    Double amount;

    public Transaction(){}

    public Transaction(User user, String description, Double amount){
        this.user = user;
        this.description = description;
        this.amount = amount;
    }
}
