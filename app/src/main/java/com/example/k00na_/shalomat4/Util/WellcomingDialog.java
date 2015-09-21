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
    TextView secondDescriptionText;


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        mLayoutInflater = getActivity().getLayoutInflater();
        v = mLayoutInflater.inflate(R.layout.wellcome_alert_dialog, null);

        mTextView = (TextView)v.findViewById(R.id.appDescriptionText);
        secondDescriptionText = (TextView)v.findViewById(R.id.secondDescriptionText);

        String nodata="S to aplikacijo lahko: " +
                "\n" +
                "<br/>&#8226; brskaš vice po kategorijah"
                +

                "\n" + "<br/>&#8226; pošlješ vic prijateljem,"
                +
                 "\n" + "<br/>&#8226; shraniš najboljše vice v posebno mapo,"
                +
                "\n" + "<br/>&#8226; kopiraš posamezen vic in ga objaviš na Facebook-u. "

                ;



        mTextView.setText(Html.fromHtml(nodata));

        secondDescriptionText.setText("Z veseljem sprejemam tudi ideje/predloge za izboljšavo. ");

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(v).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        return builder.create();
    }
}
