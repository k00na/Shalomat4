package org.development.k00na_.shalomat66.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.development.k00na_.shalomat66.R;

/**
 * Created by k00na_ on 31.10.2015.
 */
public class AddJokeDialog extends DialogFragment {


    public AddJokeDialog(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = getActivity().getLayoutInflater().inflate(R.layout.dialog_add_joke, container, false);




        return v;
    }
}
