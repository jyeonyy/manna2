package org.ssutown.manna2.MeetingFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ssutown.manna2.R;

public class FragmentNotice extends Fragment {
    TextView textView;

    public static FragmentNotice newInstance(String text){
        FragmentNotice fragmentNotice=new FragmentNotice();
        Bundle bundle=new Bundle();
        bundle.putString("text",text);
        fragmentNotice.setArguments(bundle);
        return fragmentNotice;
    }
    @Nullable @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_notice,container,false);
        textView= (TextView) view.findViewById(R.id.textView);
        textView.setText(getArguments().getString("text"));


        return view;
    }



}