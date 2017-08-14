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

public class FragmentIntegrated extends Fragment {
    TextView textView;

    public static FragmentHome newInstance(String text){
        FragmentHome fragmentHome=new FragmentHome();
        Bundle bundle=new Bundle();
        bundle.putString("text",text);
        fragmentHome.setArguments(bundle);
        return fragmentHome;
    }
    @Nullable @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_integrated,container,false);
        textView= (TextView) view.findViewById(R.id.textView);
        textView.setText(getArguments().getString("text"));


        return view;
    }



}
