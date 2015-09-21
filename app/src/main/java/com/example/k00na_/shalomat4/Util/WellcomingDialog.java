package com.example.k00na_.shalomat4.Util;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.k00na_.shalomat4.R;

/**
 * Created by k00na_ on 20.9.2015.
 */
public class WellcomingDialog extends DialogFragment {

    LayoutInflater mLayoutInflater;
    View v;
    TextView mTextView;


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        mLayoutInflater = getActivity().getLayoutInflater();
        v = mLayoutInflater.inflate(R.layout.wellcome_alert_dialog, null);

        mTextView = (TextView)v.findViewById(R.id.appDescriptionText);

        String nodata="Prelistaj skozi 1000+ vicev in najboljše deli s prijatlelji, YO!";

        mTextView.setText(Html.fromHtml(nodata));

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(v).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        return builder.create();
    }
}
