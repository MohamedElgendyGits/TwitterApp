package com.android.twitterapp.base.injector;

import android.content.Context;
import android.support.annotation.NonNull;

import com.android.twitterapp.home.model.HomeRepository;
import com.android.twitterapp.home.model.repo.cloud.HomeRemoteDataSource;
import com.android.twitterapp.login.model.LoggedUserRepository;
import com.android.twitterapp.login.model.repo.local.LoggedUserLocalDataSource;

/**
 * Created by Mohamed Elgendy.
 */

public class Injection {

    /**
     * Enables injection of mock implementations for
     * {@link LoggedUserRepository} at compile time. This is useful to isolate the dependencies.
     */
    public static LoggedUserRepository provideLoggedUserRepository(@NonNull Context context) {
        return LoggedUserRepository.getInstance(LoggedUserLocalDataSource.getInstance(context));
    }

    /**
     * Enables injection of mock implementations for
     * {@link HomeRepository} at compile time. This is useful to isolate the dependencies.
     */
    public static HomeRepository provideHomeRepository() {
        return HomeRepository.getInstance(HomeRemoteDataSource.getInstance());
    }
}
