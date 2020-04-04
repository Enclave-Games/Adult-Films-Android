package org.enclave.adultfilms.di.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Provides;

public class AppModule
{
    private Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }
}