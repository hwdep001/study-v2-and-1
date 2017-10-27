package com.howoh.studyv2.studyv2_1.service;

import com.howoh.studyv2.studyv2_1.vo.User;

/**
 * Created by howoh on 2017-10-26.
 */

public class AuthService {

    private static final String TAG = AuthService.class.getSimpleName();

    public static User currentUser;
    public static String uid;
    public static String email;
    public static String name;
    public static String photoURL;
    public static String creationDate;
    public static String lastSignInDate;
    public static boolean authenticated;

    public static void setCurrentUser(User user) {
        currentUser = user;
        uid = user.getUid();
        email = user.getEmail();
        name = user.getName();
        photoURL = user.getPhotoURL();
        creationDate = user.getCreationDate();
        lastSignInDate = user.getLastSignInDate();
        authenticated = user.isAuthenticated();
    }
}
