package com.kino.hilt.inter;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@InstallIn(ActivityComponent.class)
@Module
public abstract class AnimalOtherModule {


    @Binds
    @BingCatAnimal
    public abstract IAnimal bindCatAnimal(CatAnimalImp cat);
}
