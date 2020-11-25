package com.kino.hilt.construct;

import android.util.Log;

import javax.inject.Inject;

/**
 * Inject ,依赖组件， 为依赖项，在此示例中，Car 类依赖于拥有 Engine 类的一个实例才能运行
 * 从构造函数的图标上可以看到依赖关系
 */
public class Engine {

    @Inject
    public Engine() {
    }

    public void run(){
        Log.d("HILT"," this car is running");
    }
}
