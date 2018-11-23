package com.example.smallrui.fragment03;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class IndexActivity extends Activity {
    private RadioGroup mRadioGroupDialogType;
    private Button mButtonCreateDialog;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_index);
        mRadioGroupDialogType =(RadioGroup)findViewById(R.id.rad_dialog_type);
        mButtonCreateDialog = (Button)findViewById(R.id.btn_create_dialog);
        mButtonCreateDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(v.getContext(),"Button",Toast.LENGTH_LONG).show();
                int resId = mRadioGroupDialogType.getCheckedRadioButtonId();
                switch (resId){
                    case R.id.rad_dialog_alert:
                        Toast.makeText(v.getContext(),"alert",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rad_dialog_Date:
                        Toast.makeText(v.getContext(),"Date",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rad_dialog_Time:
                        Toast.makeText(v.getContext(),"Time",Toast.LENGTH_SHORT).show();
                        break;
                        default:
                            break;
                }
            }
        });
    }
}
