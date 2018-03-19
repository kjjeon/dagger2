package com.example.kjjeon.dagger2.class3.di;

import com.example.kjjeon.dagger2.class3.cafe.Cafe;

import dagger.Component;

/**
 * Created by kjjeon on 2018-03-19.
 */

@Component(modules = CafeModuleC3.class)
public interface CafeComponentC3 {
    //provison method (sample2)
    Cafe cafe();
}
