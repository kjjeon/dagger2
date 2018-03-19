package com.example.kjjeon.dagger2.class2.di;

import com.example.kjjeon.dagger2.class2.cafe.Cafe2;
import com.example.kjjeon.dagger2.class2.cafe.CoffeeMachine;


import dagger.Component;

/**
 * Created by kjjeon on 2018-03-19.
 */

@Cafe2Scope
@Component(modules = Cafe2Module.class)
public interface Cafe2Component {
    //provison method
    Cafe2 cafe2();

    CoffeeMachine coffeeMachine();
}
