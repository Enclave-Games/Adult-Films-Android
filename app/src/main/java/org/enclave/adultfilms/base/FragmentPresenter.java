package org.enclave.adultfilms.base;

import moxy.MvpAppCompatFragment;

public abstract class FragmentPresenter extends MvpAppCompatFragment
{
    protected abstract BasePresenter getPresenter();

    @Override
    public void onDetach() {
        if(getPresenter() != null) {
            getPresenter().disposeAll();
        }

        super.onDetach();
    }
}
