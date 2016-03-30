package numberletter.yilong.com.numberletter.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.logging.Handler;

import numberletter.yilong.com.numberletter.R;
import numberletter.yilong.com.numberletter.model.CodingLookModel;

/**
 * Created by zhkqy on 16/3/30.
 */
public class NumberCodingDialog extends Dialog {
    ImageView img;
    CodingLookModel codingLookModel;
    ArrayList<Integer> codingImg = new ArrayList<Integer>();
    ArrayList<String> codingNumber = new ArrayList<String>();

    String num;

    public NumberCodingDialog(Context context, String num) {
        super(context, R.style.Theme_at_her);
        this.num = num;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.dialog_number_coding_layout);
        img = (ImageView) findViewById(R.id.number_coding_img);
        codingLookModel = new CodingLookModel();
        codingImg.clear();
        codingNumber.clear();
        codingImg = codingLookModel.getCodingImgArraylist();
        codingNumber = codingLookModel.getCodingNumber();

        int position = -1;
        for (int x = 0; x < codingNumber.size(); x++) {
            if (num.equals(codingNumber.get(x))) {
                position = x;
               break;
            }
        }
        if (position != -1) {
            int i = codingImg.get(position);
            img.setBackgroundResource(i);
        }
    }



    @Override
    public void dismiss() {
        super.dismiss();
        if (img != null) {
            img.setImageBitmap(null);
        }
    }
}
