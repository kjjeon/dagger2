package com.example.kjjeon.dagger2.class2;

import android.util.Log;

import com.example.kjjeon.dagger2.class2.cafe.Cafe;
import com.example.kjjeon.dagger2.class2.cafe.Cafe2;
import com.example.kjjeon.dagger2.class2.cafe.CoffeeMachine;
import com.example.kjjeon.dagger2.class2.di.Cafe2Component;
import com.example.kjjeon.dagger2.class2.di.CafeComponent;
import com.example.kjjeon.dagger2.class2.di.CafeModule;
import com.example.kjjeon.dagger2.class2.di.DaggerCafe2Component;
import com.example.kjjeon.dagger2.class2.di.DaggerCafeComponent;


/**
 * Created by kjjeon on 2018-03-19.
 */

public class Class2Run {

    public void run (){
        //sample1
        CafeComponent cafeComponent1 = DaggerCafeComponent.builder().build();
        CafeComponent cafeComponent2 = DaggerCafeComponent.builder().build();
        Log.d("TAG","cafeComponent는 build 될때 마다 다른 오브젝트를 넘겨 준다.  비교 ->" + cafeComponent1.equals(cafeComponent2));

        //sample2
        Cafe cafe1 = cafeComponent1.cafe();
        Cafe cafe2 = cafeComponent1.cafe();
        Log.d("TAG","cafeModule에 있는 provideCafe 위에 @Singleton 선언 하면 항상 같은 Cafe 오브젝트를 던져준다." +
                " 단 같은 CafeComponentC3 build 에서 호출해야한다. 비교 ->" +
                cafe1.equals(cafe2));

        //sample3  CafeComponentC3 에서 @Component.Builder를 이용하면 CafeModuleC3 매개변수를 전달 하여 생성 할 수 있다.
        DaggerCafeComponent.builder().cafeModule(new CafeModule("Jenny")).build().cafe().welcome();

        //sample3
        Cafe2Component cafe2Component1 =  DaggerCafe2Component.builder().build();
        Cafe2 cafe2Obj1 = cafe2Component1.cafe2();
        Cafe2 cafe2Obj2 = cafe2Component1.cafe2();

        Log.d("TAG","cafe2 Module에 있는 provideCafe2 위에 @Cafe2Scope 선언 하면 커스텀 스코프 끼리는 항상 같은 Cafe2 오브젝트를 던져준다." +
                " 단 같은 Cafe2Component build 에서 호출해야한다. 비교 ->" +
                cafe2Obj1.equals(cafe2Obj2));


        CoffeeMachine machine1 = cafe2Component1.coffeeMachine();
        CoffeeMachine machine2 = cafe2Component1.coffeeMachine();
        Log.d("TAG","그러나 provideCoffeeMachine은 @Cafe2Scope 선언 하지 않았기 때문에 계속 새로 생성된다. 비교 ->" +
                machine1.equals(machine2));
    }

}
