package com.adawolfs.banca.orm;

import com.orm.SugarRecord;

/**
 * Created by adawolfs on 2/06/17.
 */

public class Loan extends SugarRecord<Loan> {
    User user;
    Double balance;

    public Loan(){}

    public Loan(User user, Double balance){
        this.user = user;
        this.balance = balance;
    }
}
