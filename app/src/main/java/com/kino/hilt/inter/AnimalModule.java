package com.kino.hilt.inter;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class AnimalModule {
    @Binds
    public abstract IAnimal bindImpl(AnimalImpl animal);
}
