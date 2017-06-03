package com.adawolfs.banca.orm;

import com.orm.SugarRecord;

/**
 * Created by adawolfs on 2/06/17.
 */

public class Services extends SugarRecord<Services> {

    String name;

    public Services(){

    }

    public Services(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
