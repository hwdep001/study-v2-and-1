//package com.howoh.studyv2.studyv2_1.service;
//
//import android.content.Intent;
//import android.support.annotation.NonNull;
//import android.util.Log;
//import android.widget.Toast;
//
//import com.google.android.gms.auth.api.Auth;
//import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
//import com.google.android.gms.common.ConnectionResult;
//import com.google.android.gms.common.api.GoogleApiClient;
//import com.google.android.gms.common.api.ResultCallback;
//import com.google.android.gms.common.api.Status;
//import com.google.firebase.auth.FirebaseAuth;
//import com.howoh.studyv2.studyv2_1.LoginActivity;
//import com.howoh.studyv2.studyv2_1.R;
//
///**
// * Created by howoh on 2017-10-25.
// */
//
//public class AuthService implements
//        GoogleApiClient.OnConnectionFailedListener {
//
//    private static final String TAG = LoginActivity.class.getSimpleName();
//    private static final int RC_SIGN_IN = 9001;
//
//    // [START declare_auth]
//    private FirebaseAuth mAuth;
//    // [END declare_auth]
//
//    GoogleApiClient mGoogleApiClient;
//
//
//    private static AuthService uniqueInstance;
//
//    private AuthService() {
//        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestIdToken(getString(R.string.default_web_client_id))
//                .requestEmail()
//                .build();
//
//        mGoogleApiClient = new GoogleApiClient.Builder(this)
//                .enableAutoManage(this /* FragmentActivity */, this /* OnConnectionFailedListener */)
//                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
//                .build();
//
//        mAuth = FirebaseAuth.getInstance();
//    }
//
//    public static synchronized AuthService getInstance() {
//        if(uniqueInstance == null) {
//            uniqueInstance = new AuthService();
//        }
//        return uniqueInstance;
//    }
//
//
//
//
//    private Intent getSignInIntent() {
//        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
////        startActivityForResult(signInIntent, RC_SIGN_IN);
//        return signInIntent;
//    }
//
//    private void signOut() {
//        // Firebase sign out
//        mAuth.signOut();
//
//        // Google sign out
//        Auth.GoogleSignInApi.signOut(mGoogleApiClient).setResultCallback(
//                new ResultCallback<Status>() {
//                    @Override
//                    public void onResult(@NonNull Status status) {
//                        updateUI(null);
//                    }
//                });
//    }
//
//
//
//    @Override
//    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
//        // An unresolvable error has occurred and Google APIs (including Sign-In) will not
//        // be available.
//        Log.d(TAG, "onConnectionFailed:" + connectionResult);
////        Toast.makeText(this, "Google Play Services error.", Toast.LENGTH_SHORT).show();
//    }
//
//
//
//
//}
