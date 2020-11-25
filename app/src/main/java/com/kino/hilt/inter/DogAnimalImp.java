package com.kino.hilt.inter;


import android.util.Log;

import javax.inject.Inject;

public class DogAnimalImp implements IAnimal{
    @Inject
    public DogAnimalImp() {

    }

    @Override
    public void run() {
        Log.d("HILT","狗狗跑起来了");
    }

    @Override
    public void eat() {
        Log.d("HILT","狗狗爱吃骨头");
    }
}
