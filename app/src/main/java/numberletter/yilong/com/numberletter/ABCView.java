package numberletter.yilong.com.numberletter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zhkqy on 16/3/15.
 * a-z 字母随机显示类
 */
public class ABCView extends FrameLayout implements View.OnClickListener {

    Context mContext;
    int currentPos = 0;
    ArrayList<String> listabc = new ArrayList<String>();


    public ABCView(Context context) {
        super(context);
        init(context);
    }

    public ABCView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }


    TextView one, two, three, nextLetter;

    private void init(Context context) {
        this.mContext = context;
        View v = View.inflate(mContext, R.layout.view_abc_layout, null);

        one = (TextView) v.findViewById(R.id.one);
        two = (TextView) v.findViewById(R.id.two);
        three = (TextView) v.findViewById(R.id.three);
        nextLetter = (TextView) v.findViewById(R.id.next_letter);
        nextLetter.setOnClickListener(this);
        listabc.clear();
        listabc = StringUtils.getabcData();
        resetABCdata();
        nextLetter();
        addView(v);

    }

    void setDatas(String oneStr, String twoStr, String threeStr) {
        one.setText(oneStr);
        two.setText(twoStr);
        three.setText(threeStr);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.next_letter) {
            nextLetter();
        }
    }

    private void nextLetter() {
        String a = "", b = "", c = "";
        for (int x = 0; x < 3; x++) {
            if (currentPos <= listabc.size() - 1) {
                if (x == 0) {
                    a = listabc.get(currentPos);
                } else if (x == 1) {
                    b = listabc.get(currentPos);
                } else if (x == 2) {
                    c = listabc.get(currentPos);
                }
                currentPos++;
            } else {
                x--;
                currentPos = 0;
                resetABCdata();
            }
        }
        setDatas(a, b, c);
    }

    public void resetABCdata() {
        Collections.shuffle(listabc);
    }
}
