package com.example.kjjeon.dagger2.class2.cafe;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by kjjeon on 2018-03-19.
 */

public class Cafe2 {
    private String name = "Cafe2";
    private CoffeeMachine coffeeMachine;

    @Inject
    public Cafe2(CoffeeMachine machine){
        coffeeMachine = machine;
    }

    public CoffeeMachine getMachine(){
        return coffeeMachine;
    }

    public void welcome(){
        Log.d("TAG","Welcome " + name + " Cafe!!");
    }
}
