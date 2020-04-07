package org.enclave.adultfilms.base;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;


@StateStrategyType(AddToEndStrategy.class)
public interface BaseView extends MvpView
{
    void showLoading();

    void hideLoading();

    void showError();
}
