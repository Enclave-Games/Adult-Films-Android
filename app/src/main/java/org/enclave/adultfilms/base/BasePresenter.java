package org.enclave.adultfilms.base;

import io.reactivex.disposables.CompositeDisposable;
import moxy.MvpPresenter;


public abstract class BasePresenter<V extends BaseView> extends MvpPresenter<V>
{
    protected CompositeDisposable disposables = new CompositeDisposable();

    public void disposeAll() {
        disposables.clear();
    }
}
