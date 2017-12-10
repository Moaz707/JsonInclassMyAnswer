package nyc.muaadh_melhi_develpoer.json_lesson_jose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String jsonString = Constants.input;
        List<Model> dataList = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray messageArray = jsonObject.getJSONArray("message");

            for (int i = 0; i < messageArray.length(); i++) {
                Model model = new Model();
                String m = (String) messageArray.get(i);
                model.setMessage(m);
                //add the model Object to the datalist
                dataList.add(model);
            }
            Log.d(TAG, "datalistSize: "+dataList.size());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        RecyclerView recyclerView=findViewById(R.id.recycle01);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),3,GridLayoutManager.VERTICAL,false);
        DataAdapter adapter=new DataAdapter(dataList);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);


    }


}