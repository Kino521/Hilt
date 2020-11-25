package com.kino.hilt.inter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 *  动物行为接口
 *
 */
public interface IAnimal {

    void run();

    void eat();
}

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface BingDagAnimal{}

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface BingCatAnimal {}
