package numberletter.yilong.com.numberletter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.number_adc_train).setOnClickListener(this);
        findViewById(R.id.numer_look).setOnClickListener(this);
        findViewById(R.id.erjinzhi).setOnClickListener(this);
        findViewById(R.id.puke).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.numer_look:
                startActivity(new Intent(this, CodingLookActivity.class));
                break;
            case R.id.number_adc_train:
                startActivity(new Intent(this, NumberAndLetterPractiseActivity.class));
                break;
            case R.id.erjinzhi:
                Toast.makeText(this, "功能暂未开发", Toast.LENGTH_SHORT).show();
                break;
            case R.id.puke:
                Toast.makeText(this, "功能暂未开发", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
