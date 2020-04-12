package org.enclave.adultfilms.di;

import org.enclave.adultfilms.di.module.AppModule;
import org.enclave.adultfilms.di.module.NetworkModule;
import org.enclave.adultfilms.ui.fragment.home.HomeFragment;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {AppModule.class,
           NetworkModule.class})
public interface DaggerComponent
{
    void inject(HomeFragment homeFragment);
}
