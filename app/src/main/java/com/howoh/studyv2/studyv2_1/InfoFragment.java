package com.howoh.studyv2.studyv2_1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.howoh.studyv2.studyv2_1.service.AuthService;
import com.howoh.studyv2.studyv2_1.vo.User;

/**
 * Created by howoh on 2017-10-26.
 */

public class InfoFragment extends Fragment {

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.info_fragment, container, false);
        initText();
        return v;
    }

    private void initText() {
        User currentUser = AuthService.currentUser;
        TextView uidText = (TextView) v.findViewById(R.id.info_content1_uid_text);
        TextView emailText = (TextView) v.findViewById(R.id.info_content1_email_text);
        TextView nameText = (TextView) v.findViewById(R.id.info_content1_name_text);
        TextView CreationDateText = (TextView) v.findViewById(R.id.info_content1_cd_text);
        TextView authStateText = (TextView) v.findViewById(R.id.info_content1_auth_text);

        uidText.setText(currentUser.getUid());
        emailText.setText(currentUser.getEmail());
        nameText.setText(currentUser.getName());
        CreationDateText.setText(currentUser.getCreationDate());

        if(currentUser.isAuthenticated()) {
            authStateText.setText("승인");
            authStateText.setTextColor(ContextCompat.getColor(getActivity(), R.color.secondary));
        } else {
            authStateText.setText("대기");
            authStateText.setTextColor(ContextCompat.getColor(getActivity(), R.color.danger));
        }

    }

}
