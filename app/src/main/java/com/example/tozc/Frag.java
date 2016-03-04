package com.example.tozc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Administrator on 2016/2/28.
 */
public class Frag extends Fragment implements View.OnClickListener{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.item_frag,null);
        Button btn = (Button) view.findViewById(R.id.btn_frag);
        btn.setOnClickListener(this);
       //WebView webView= (WebView) view.findViewById(R.id.wv_frag);
       // webView.loadUrl("http://www.baidu.com");
        return view;
    }

    @Override
    public void onClick(View v) {
        getActivity().startActivity(new Intent(getActivity(),SlidingActivity.class));
    }
}
