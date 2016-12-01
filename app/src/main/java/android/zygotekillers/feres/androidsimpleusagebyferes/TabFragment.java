package android.zygotekillers.feres.androidsimpleusagebyferes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.app.ProgressDialog;

import android.support.v4.app.Fragment;

/**
 * Created by feres on 28/11/2016.
 */

public class TabFragment extends Fragment implements View.OnClickListener {


    private Button anonymous_login;
    private ProgressDialog mProgressDialog;


    public TabFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_layout, null);

        anonymous_login = (Button) rootView.findViewById(R.id.anonymous_login);
        anonymous_login.setOnClickListener(this);


    return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.anonymous_login){

            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();

            showProgressDialog();
        }

    }


    public void showProgressDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(getContext());
            mProgressDialog.setCancelable(false);
            mProgressDialog.setMessage("Loading...");
        }

        mProgressDialog.show();
    }

    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }



}
