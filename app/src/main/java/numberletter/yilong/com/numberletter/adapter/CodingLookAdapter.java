package numberletter.yilong.com.numberletter.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import numberletter.yilong.com.numberletter.model.CodingLookModel;

/**
 * Created by zhkqy on 16/3/28.
 * 编码查看adapter
 */
public class CodingLookAdapter extends BaseAdapter {

    CodingLookModel codingLookModel;

    public CodingLookAdapter(CodingLookModel codingLookModel) {
        this.codingLookModel = codingLookModel;
    }

    @Override
    public int getCount() {
        return codingLookModel.getCodingNickname().size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
