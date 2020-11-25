package com.kino.hilt.inter;

import android.util.Log;

import javax.inject.Inject;

public class AnimalImpl implements IAnimal{

    @Inject
    public AnimalImpl() {
    }

    @Override
    public void run() {
        Log.w("HILT","跑起来");
    }

    @Override
    public void eat() {
        Log.w("HILT","吃起来");
    }
}
