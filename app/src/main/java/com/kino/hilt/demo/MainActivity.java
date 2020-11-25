package com.kino.hilt.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kino.hilt.construct.Car;
import com.kino.hilt.inter.AnimalImpl;
import com.kino.hilt.inter.CatAnimalImp;
import com.kino.hilt.inter.DogAnimalImp;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

/**
 * <p>
 *     依赖项定义：类通常需要引用其他类。例如，Car 类可能需要引用 Engine 类。这些必需类称为依赖项
 *     实现依赖项注入可为您带来以下优势：
 *     重用代码
 *     易于重构
 *     易于测试
 * </p>
 *
 *
 */
@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Inject
    AnimalImpl animal;

    @Inject
    CatAnimalImp cat;

    @Inject
    DogAnimalImp dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        car.start();
        animal.eat();
        animal.run();
        cat.run();
        cat.eat();
        dog.run();
        dog.eat();
    }
}