package org.enclave.adultfilms.view;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.customview.widget.ViewDragHelper;

public class CardDragger extends ViewDragHelper.Callback
{


    @Override
    public boolean tryCaptureView(@NonNull View child, int pointerId)
    {
        return false;
    }
}
