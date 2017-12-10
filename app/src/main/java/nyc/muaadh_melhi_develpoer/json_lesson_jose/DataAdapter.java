package nyc.muaadh_melhi_develpoer.json_lesson_jose;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by c4q on 12/10/17.
 */

class DataAdapter  extends RecyclerView.Adapter<DataViewHolder>{
    List<Model> list=new ArrayList<>();

    public DataAdapter(List<Model> list) {
        this.list = list;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_holder,parent,false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        holder.bind(list.get(position),position);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
