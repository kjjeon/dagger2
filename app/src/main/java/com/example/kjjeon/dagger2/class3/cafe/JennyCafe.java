package com.example.kjjeon.dagger2.class3.cafe;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by kjjeon on 2018-03-19.
 */

public class JennyCafe implements Cafe{

    private String name = "JennyCafe";
    private CoffeeMachine machine;

    @Inject
    public JennyCafe(){
    }


    public JennyCafe(CoffeeMachine machine){
        this.machine = machine;
    }

    @Override
    public void welcome(){
        Log.d("TAG","Welcome " + name);
    }
}
