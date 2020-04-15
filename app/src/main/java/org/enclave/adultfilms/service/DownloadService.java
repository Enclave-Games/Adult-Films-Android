package org.enclave.adultfilms.service;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.Context;
import android.os.Build;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import org.enclave.adultfilms.BuildConfig;
import org.enclave.adultfilms.R;


public class DownloadService extends IntentService
{
    private static final int NOTIFICATION_ID = 1;
    private NotificationManager notificationManager;
    private NotificationCompat.Builder notificationBuilder;

    public DownloadService() {
        super("DownloadService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationBuilder = getNotificationBuilder()
                              .setContentTitle(getApplicationContext().getString(R.string.download_txt))
                              .setSmallIcon(R.drawable.ic_launcher_foreground);
    }

    private NotificationCompat.Builder getNotificationBuilder()
    {
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            return new NotificationCompat.Builder(this);
        }
        else {
            String channel_id = "download_channel";

            if(notificationManager.getNotificationChannel(channel_id) == null) {
                NotificationChannel notificationChannel =
                        new NotificationChannel(channel_id,
                                getApplicationContext().getString(R.string.download_video_service),
                                NotificationManager.IMPORTANCE_LOW);

                notificationManager.createNotificationChannel(notificationChannel);
            }
            return new NotificationCompat.Builder(this, channel_id);
        }
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        startForeground(NOTIFICATION_ID, notificationBuilder.build());
        return START_STICKY;
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        notificationBuilder.notify();
    }

}
