package com.howoh.studyv2.studyv2_1.service;

import com.howoh.studyv2.studyv2_1.vo.User;

/**
 * Created by howoh on 2017-10-26.
 */

public class AuthService {

    private static final String TAG = AuthService.class.getSimpleName();

    private static User currentUser;

    public static String uid() {
        return currentUser.getUid();
    }

    public String email() {
        return currentUser.getEmail();
    }

    public String photoURL() {
        return currentUser.getPhotoURL();
    }

    public String name() {
        return currentUser.getName();
    }

    public String creationDate() {
        return currentUser.getCreationDate();
    }

    public String lastSignInDate() {
        return currentUser.getLastSignInDate();
    }

    public boolean authenticated() {
        return currentUser.isAuthenticated();
    }

    public static void setCurrentUser(User user) {
        currentUser = user;
    }
}
