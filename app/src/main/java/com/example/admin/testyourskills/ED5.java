package com.example.admin.testyourskills;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;

public class ED5 extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
        if (cloqn1.total7==3) {
            builder2.setTitle("Bravo!!")
                    .setMessage("Your Total Score is: " + cloqn1.total7)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            cloqn1.total7=0;
                            Intent i = new Intent(getActivity(), SelectCategory.class);
                            startActivity(i);
                        }
                    });
        } else if (cloqn1.total7 == 2) {
            builder2.setTitle("Good!")
                    .setMessage("Your Total Score is: " + cloqn1.total7)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            cloqn1.total7=0;
                            Intent i = new Intent(getActivity(), SelectCategory.class);
                            startActivity(i);

                        }
                    });
        } else {
            builder2.setTitle("Better Luck Next Time!")
                    .setMessage("Your Total Score is: " + cloqn1.total7)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            cloqn1.total7=0;
                            Intent i = new Intent(getActivity(), SelectCategory.class);
                            startActivity(i);
                        }
                    });
        }
        return builder2.create();
    }

}
