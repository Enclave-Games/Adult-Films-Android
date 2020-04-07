package org.enclave.adultfilms.utils;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.enclave.adultfilms.R;

import java.lang.ref.WeakReference;

public class FragmentUtil
{
    private static FragmentUtil instance;
    private static WeakReference reference;

    private FragmentUtil() {
        reference = new WeakReference<>(null);
    }

    public synchronized static FragmentUtil getInstance() {
        return instance;
    }

    public static void attachTo(Context context) {
        reference = new WeakReference<>(context);
    }

    public void addFragment(final int rootID, final Fragment fragment, final boolean backStack) {
        final AppCompatActivity app = (AppCompatActivity) reference.get();
        if (app == null) return;

        final FragmentTransaction transaction = app.getSupportFragmentManager().beginTransaction();

        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        //transaction.add((rootID == 0 ? R.id.activity_main_fragment_container : rootID), fragment, fragment.getTag());
        if (backStack) {
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }
}
