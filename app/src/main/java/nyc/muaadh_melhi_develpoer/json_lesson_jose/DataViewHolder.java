package nyc.muaadh_melhi_develpoer.json_lesson_jose;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by c4q on 12/10/17.
 */

class DataViewHolder extends RecyclerView.ViewHolder {
    public DataViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(Model model) {

        TextView dataView = itemView.findViewById(R.id.data_text);
        dataView.setText(model.getMessage());


    }
}
