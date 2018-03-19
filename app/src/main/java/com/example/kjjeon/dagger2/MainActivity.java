package com.example.kjjeon.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kjjeon.dagger2.class2.Class2Run;
import com.example.kjjeon.dagger2.class3.Class3Run;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Class2Run class2Run = new Class2Run();
        class2Run.run();

        Class3Run class3Run = new Class3Run();
        class3Run.run();

    }
}
