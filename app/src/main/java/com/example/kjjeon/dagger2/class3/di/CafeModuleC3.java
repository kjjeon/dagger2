package com.example.kjjeon.dagger2.class3.di;

import com.example.kjjeon.dagger2.class3.cafe.Cafe;
import com.example.kjjeon.dagger2.class3.cafe.JennyCafe;

import dagger.Binds;
import dagger.Module;


/**
 * Created by kjjeon on 2018-03-19.
 */

@Module
public abstract class CafeModuleC3 {
    @Binds
    public abstract Cafe provideCafe(JennyCafe jennyCafe);

}
