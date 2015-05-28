package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.epicmyanmar.jr.eduvoter.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heinhtetaung on 5/29/15.
 */
public class Tab1Adapter extends BaseAdapter{


    Context mContext;
    List<String> datalist = new ArrayList<>();
    public Tab1Adapter(Context context, List<String> dl){
        datalist = dl;
        mContext = context;
    }

    @Override
    public int getCount() {
        return datalist.size();
    }

    @Override
    public Object getItem(int position) {
        return datalist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder vh;
        if(convertView == null){
            vh = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_tab1_layout, parent, false);
            vh.tv_title = (TextView) convertView.findViewById(R.id.tab1_custom_title);
            vh.tv_description = (TextView) convertView.findViewById(R.id.tab1_custom_description);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }

        vh.tv_title.setText("Title");
        vh.tv_description.setText("Description");

        return convertView;
    }

    public class ViewHolder{
        TextView tv_title, tv_description;
    }

}
