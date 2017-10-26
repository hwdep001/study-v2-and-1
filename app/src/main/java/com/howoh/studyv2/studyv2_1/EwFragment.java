package com.howoh.studyv2.studyv2_1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by howoh on 2017-10-26.
 */

public class EwFragment extends Fragment {

    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3"} ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.ew_fragment, container, false);

//        ArrayAdapter ad = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, LIST_MENU);
//        ListView lv = (ListView) v.findViewById(R.id.info_content1_list);
//        lv.setAdapter(ad);

        return v;
    }
}
