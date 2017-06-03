package com.adawolfs.banca.orm;

import com.orm.SugarRecord;

/**
 * Created by adawolfs on 2/06/17.
 */

public class Card extends SugarRecord<Card> {
    User user;
    String number;

    Double amount;

    public Card(User user, String number, Double amount){
        this.user = user;
        this.number = number;
        this.amount = amount;
    }
}
