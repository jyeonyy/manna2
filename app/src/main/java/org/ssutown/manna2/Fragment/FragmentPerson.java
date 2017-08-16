package org.ssutown.manna2.Fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ssutown.manna2.MaterialCalendar_Person.MaterialCalendarFragment;
import org.ssutown.manna2.R;


public class FragmentPerson extends Fragment {

    public static FragmentPerson newInstance(String text){
        FragmentPerson fragmentPerson=new FragmentPerson();
        Bundle bundle=new Bundle();
        bundle.putString("text",text);
        fragmentPerson.setArguments(bundle);
        return fragmentPerson;
    }
    @Nullable @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_person,container,false);
        if (savedInstanceState == null) {
            getActivity().getFragmentManager().beginTransaction().add(R.id.main_container1, new MaterialCalendarFragment()).commit();
        }

        Context context = this.getActivity();

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        // 제목셋팅
            alertDialogBuilder.setTitle("계정 연동");

            // AlertDialog 셋팅
            alertDialogBuilder
                    .setMessage("\n캘린더 일정을 불러올 수 있습니다.\n\n 하나의 계정을 연결할 수 있습니다. \n \n\n 연동하고 싶은" +
                            " 계정을 선택하세요.")
                    .setCancelable(false)
                    .setPositiveButton("구글",
                            new DialogInterface.OnClickListener() {
                                    public void onClick(
                                            DialogInterface dialog, int id) {// 프로그램을 종료한다
//                                        Intent intent = new Intent(getActivity(), OutlookTest.class);
//                                        startActivity(intent);
                                            //여기에 나헤언니가 작업한 구글 로그인 창 띄우면 됨
                                  }
                                })
                     .setNegativeButton("아웃룩",
                             new DialogInterface.OnClickListener() {
                                    public void onClick(
                                            DialogInterface dialog, int id) {
                                     // 다이얼로그를 취소한다
                                        Intent intent = new Intent(getActivity(), OutlookLogin.class);
                                        startActivity(intent);

                                 }
                                });

        // 다이얼로그 생성
        AlertDialog alertDialog = alertDialogBuilder.create();

        // 다이얼로그 보여주기
        alertDialog.show();


        return view;
    }




}
