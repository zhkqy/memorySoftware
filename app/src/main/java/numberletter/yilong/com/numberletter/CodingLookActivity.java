package numberletter.yilong.com.numberletter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import numberletter.yilong.com.numberletter.adapter.CodingLookAdapter;
import numberletter.yilong.com.numberletter.model.CodingLookModel;

/**
 * 编码查看类
 */

public class CodingLookActivity extends Activity {

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_look_layout);

        gridView = (GridView) findViewById(R.id.grid);
        CodingLookAdapter lookAdapter = new CodingLookAdapter(new CodingLookModel(),this);
        gridView.setAdapter(lookAdapter);
        lookAdapter.notifyDataSetChanged();
    }
}