package com.example.kjjeon.dagger2.class2.di;

import com.example.kjjeon.dagger2.class2.cafe.Cafe;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kjjeon on 2018-03-19.
 */

@Singleton //cafeComponent와 연결되는 Module의 에서 scope를 사용 하려면 여기에 정의 해주어야 한다. CafeModule에서 @Singleton을 사용하기 때문에 선언(sample2)
@Component(modules = CafeModule.class)
public interface CafeComponent {
    //provison method (sample2)
    Cafe cafe();

    // CafeMoudle 생성자에서 매개변수를 받아서 생성 할 경우 아래와 같이 정의 해서 사용 하면 된다. (sample3)
    @Component.Builder
    interface Builder {
        Builder cafeModule(CafeModule cafeModule);
        CafeComponent build();
    }
}
