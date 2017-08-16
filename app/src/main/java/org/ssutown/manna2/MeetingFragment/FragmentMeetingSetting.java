package org.ssutown.manna2.MeetingFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ssutown.manna2.Fragment.FragmentHome;
import org.ssutown.manna2.R;

public class FragmentMeetingSetting extends Fragment {
    TextView textView;

    public static FragmentMeetingSetting newInstance(String text){
        FragmentMeetingSetting fragmentMeetingSetting=new FragmentMeetingSetting();
        Bundle bundle=new Bundle();
        bundle.putString("text",text);
        fragmentMeetingSetting.setArguments(bundle);
        return fragmentMeetingSetting;
    }
    @Nullable @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_meeting_setting,container,false);
        textView= (TextView) view.findViewById(R.id.textView);
        textView.setText(getArguments().getString("text"));


        return view;
    }



}