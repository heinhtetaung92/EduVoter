package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.epicmyanmar.jr.eduvoter.R;

import java.util.List;

/**
 * Created by jr on 5/29/15.
 */
public class Cardview_Adapter extends ArrayAdapter {
    Context context;
    List<String> mMenulist;
    public Cardview_Adapter(Context _context, List<String> lstmenu) {

        super(_context, R.layout.custom_card_item,lstmenu);
        this.context=_context;
        this.mMenulist=lstmenu;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;

        if(convertView!=null){
            vh=(ViewHolder) convertView.getTag();

        }else{
            vh=new ViewHolder();
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView=inflater.inflate(R.layout.custom_card_item, parent, false);
            vh.txt_menuitem = (TextView) convertView.findViewById(R.id.tv_customcard);
            convertView.setTag(vh);
        }

        vh.txt_menuitem.setText(mMenulist.get(position));

        return convertView;
    }

    static class ViewHolder{
        TextView txt_menuitem;
    }
}
