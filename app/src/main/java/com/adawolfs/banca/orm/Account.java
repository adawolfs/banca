package com.adawolfs.banca.orm;

import com.orm.SugarRecord;

/**
 * Created by adawolfs on 2/06/17.
 */

public class Account extends SugarRecord<Account> {
    User user;
    String number;
    Double balance;

    public Account(){}

    public Account(User user, String number, Double balance){
        this.user = user;
        this.number = number;
        this.balance = balance;
    }
}
