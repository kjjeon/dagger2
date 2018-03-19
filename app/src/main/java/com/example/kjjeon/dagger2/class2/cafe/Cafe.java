package com.example.kjjeon.dagger2.class2.cafe;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by kjjeon on 2018-03-19.
 */

public class Cafe {
    private String name = "unknow";

    @Inject
    public Cafe(){}

    public Cafe(String name){ this.name = name; }

    public void welcome(){
        Log.d("TAG","Welcome " + name + " Cafe!!");
    }
}
