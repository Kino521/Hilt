package com.kino.hilt.construct;

import javax.inject.Inject;

public class Car {
    @Inject
    Engine mEngine;
    @Inject
    public Car() {
    }

    public void start() {
        mEngine.run();
    }

}
