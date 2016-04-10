package numberletter.yilong.com.numberletter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

import numberletter.yilong.com.numberletter.dialog.NumberCodingDialog;

/**
 * Created by zhkqy on 16/3/15.
 * 随机1-100数字类
 */
public class NumberView extends FrameLayout implements View.OnClickListener {

    Context mContext;
    private TextView num;
    private TextView next;
    ArrayList<Integer> listNum = new ArrayList<Integer>();
    int radom = 10;
    int b = 9;


    public NumberView(Context context) {
        super(context);
        init(context);
    }


    public NumberView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }


    private void init(Context context) {
        this.mContext = context;
        View v = View.inflate(mContext, R.layout.view_number_layout, null);

        num = (TextView) v.findViewById(R.id.num);
        next = (TextView) v.findViewById(R.id.next);
        next.setOnClickListener(this);
        num.setOnClickListener(this);
        showNextNumber();
        addView(v);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next:
                showNextNumber();
                break;

            case R.id.num:
                NumberCodingDialog dialog = new NumberCodingDialog(mContext, radom + "");
                dialog.show();
                break;
            default:
                break;
        }
    }

    public void resetNumber() {
        listNum.clear();
        for (int i = 0; i < 100; i++) {
            listNum.add(i);
        }
        Collections.shuffle(listNum);
        num.setText(listNum.get(0) + "");
    }

    int currentPos = 0;

    public void showNextNumber() {

        if (currentPos < listNum.size() - 1) {
            radom = listNum.get(currentPos);
            currentPos++;
        } else {
            resetNumber();
            currentPos = 0;
        }
        num.setText(radom + "");
    }

}
