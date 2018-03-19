package com.example.kjjeon.dagger2.class3;

import com.example.kjjeon.dagger2.class3.di.DaggerCafeComponentC3;

/**
 * Created by kjjeon on 2018-03-19.
 */

public class Class3Run {

    public void run (){
        DaggerCafeComponentC3.builder().build().cafe().welcome();
    }
}
