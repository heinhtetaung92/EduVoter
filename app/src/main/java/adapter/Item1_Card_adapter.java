package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.epicmyanmar.jr.eduvoter.R;

import java.util.List;

import model.VoteRules;

/**
 * Created by jr on 5/29/15.
 */
public class Item1_Card_adapter extends ArrayAdapter {

    Context context;
    List<VoteRules> mList;

    public Item1_Card_adapter(Context _context,List<VoteRules> lstmenu){
        super(_context, R.layout.item1_card_item,lstmenu);
        this.context=_context;
        this.mList=lstmenu;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if(convertView!=null){
            vh=(ViewHolder) convertView.getTag();
        }else{
            vh=new ViewHolder();
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView=inflater.inflate(R.layout.item1_card_item, parent, false);
            vh.tv_header = (TextView) convertView.findViewById(R.id.tv_header);
            vh.tv_description = (TextView) convertView.findViewById(R.id.tv_description);
            convertView.setTag(vh);
        }

        vh.tv_header.setText(mList.get(position).getHeader());
        vh.tv_description.setText(mList.get(position).getDescription());
        return convertView;
    }

    static class ViewHolder{
        TextView tv_header,tv_description;
    }
}
