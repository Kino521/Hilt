package com.kino.hilt.inter;

import android.util.Log;

import javax.inject.Inject;

/**
 * 猫的实现
 */
public class CatAnimalImp implements IAnimal{

    @Inject
    public CatAnimalImp() {
    }

    @Override
    public void run() {
        Log.d("HILT","猫猫跑起来了");
    }

    @Override
    public void eat() {
        Log.d("HILT","毛毛爱吃鱼");
    }
}
