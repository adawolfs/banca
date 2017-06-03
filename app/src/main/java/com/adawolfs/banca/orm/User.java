package com.adawolfs.banca.orm;

import com.orm.SugarRecord;

/**
 * Created by adawolfs on 2/06/17.
 */

public class User extends SugarRecord<User> {
    String name;
    String password;

    public User(){

    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }
}
