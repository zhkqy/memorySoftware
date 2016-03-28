package numberletter.yilong.com.numberletter.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import numberletter.yilong.com.numberletter.R;
import numberletter.yilong.com.numberletter.model.CodingLookModel;

/**
 * Created by zhkqy on 16/3/28.
 * 编码查看adapter
 */
public class CodingLookAdapter extends BaseAdapter {

    CodingLookModel codingLookModel;
    Context mContext;


    ArrayList<Integer> codingImg = new ArrayList<Integer>();
    ArrayList<String> codingNickname = new ArrayList<String>();
    ArrayList<String> codingNumber = new ArrayList<String>();


    public CodingLookAdapter(CodingLookModel codingLookModel, Context context) {
        this.codingLookModel = codingLookModel;

        codingImg.clear();
        codingNickname.clear();
        codingNumber.clear();
        codingImg = codingLookModel.getCodingImgArraylist();
        codingNickname = codingLookModel.getCodingNickname();
        codingNumber = codingLookModel.getCodingNumber();

        this.mContext = context;
    }

    @Override
    public int getCount() {
        return codingLookModel.getCodingNickname().size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(mContext, R.layout.adapter_coding_look_layout, null);
            holder.nickname = (TextView) convertView.findViewById(R.id.coding_nickname);
            holder.coding_img = (ImageView) convertView.findViewById(R.id.coding_img);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.nickname.setText(codingNumber.get(position) + "  " + codingNickname.get(position));
        holder.coding_img.setBackgroundResource(codingImg.get(position));
        return convertView;
    }

    class ViewHolder {
        TextView nickname;
        ImageView coding_img;
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
