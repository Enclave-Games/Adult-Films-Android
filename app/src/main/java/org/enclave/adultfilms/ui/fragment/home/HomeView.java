package org.enclave.adultfilms.ui.fragment.home;

import org.enclave.adultfilms.base.BaseView;
import org.enclave.adultfilms.model.redtube.Video;

import java.util.List;

import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;


@StateStrategyType(AddToEndStrategy.class)
public interface HomeView extends BaseView
{
    void showVideos(List<Video> videos);

    void openVideo(String url);
}
