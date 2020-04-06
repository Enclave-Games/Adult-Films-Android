package org.enclave.adultfilms.base;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BasePresenter
{
    private CompositeDisposable disposables = new CompositeDisposable();

    public void disposeAll() {
        disposables.clear();
    }
}
