package com.example.kjjeon.dagger2.class2.di;

import com.example.kjjeon.dagger2.class2.cafe.Cafe2;
import com.example.kjjeon.dagger2.class2.cafe.CoffeeMachine;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kjjeon on 2018-03-19.
 */

@Module
public class Cafe2Module {

    @Cafe2Scope
    @Provides
    Cafe2 provideCafe2(CoffeeMachine machine){
       return new Cafe2(machine);
    }

    @Provides
    CoffeeMachine provideCoffeeMachine() {
        return new CoffeeMachine();
    }
}
