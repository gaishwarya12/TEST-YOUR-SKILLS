package com.example.admin.testyourskills;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;

public class ED2 extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
        if (avqn1.total4==3) {
            builder2.setTitle("Bravo!!")
                    .setMessage("Your Total Score is: " + avqn1.total4)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            avqn1.total4=0;
                            Intent i = new Intent(getActivity(), SelectCategory.class);
                            startActivity(i);
                        }
                    });
        } else if (avqn1.total4 == 2) {
            builder2.setTitle("Good!")
                    .setMessage("Your Total Score is: " +avqn1.total4)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            avqn1.total4=0;
                            Intent i = new Intent(getActivity(), SelectCategory.class);
                            startActivity(i);

                        }
                    });
        } else {
            builder2.setTitle("Better Luck Next Time!")
                    .setMessage("Your Total Score is: " +avqn1.total4)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            avqn1.total4=0;
                            Intent i = new Intent(getActivity(), SelectCategory.class);
                            startActivity(i);
                        }
                    });
        }
        return builder2.create();
    }
}
