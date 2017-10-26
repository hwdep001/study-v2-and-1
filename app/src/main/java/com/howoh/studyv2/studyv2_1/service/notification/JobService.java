package com.howoh.studyv2.studyv2_1.service.notification;

import android.util.Log;

import com.firebase.jobdispatcher.JobParameters;

/**
 * Created by howoh on 2017-10-26.
 */

public class JobService extends com.firebase.jobdispatcher.JobService {

    private static final String TAG = "JobService";

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.d(TAG, "Performing long running task in scheduled job");
        // TODO(developer): add long running task here.
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}