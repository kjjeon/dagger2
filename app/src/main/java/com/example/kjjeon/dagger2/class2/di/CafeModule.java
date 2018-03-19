package com.example.kjjeon.dagger2.class2.di;

import com.example.kjjeon.dagger2.class2.cafe.Cafe;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kjjeon on 2018-03-19.
 */

@Module
public class CafeModule {
    private String name;

    public CafeModule(){
    }
    public CafeModule(String name){
        this.name = name;
    }

    @Singleton
    @Provides
    Cafe provideCafe(){
        if(name == null || name.isEmpty())  return new Cafe();
        else return new Cafe(name);
    }

}
