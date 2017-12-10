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


        try {
            JSONObject jsonObject = new JSONObject(Constants.input);
            JSONObject messageAObj = jsonObject.getJSONObject("message");
            JSONArray array = messageAObj.names();
            List<Breed> breeds = new ArrayList<>();

            for (int i = 0; i < array.length(); i++) {
                Breed breed = new Breed(array.get(i).toString());
                breeds.add(breed);
                JSONArray classesArray = (JSONArray) messageAObj.get(breed.getName());

                String[] classesNames = new String[classesArray.length()];

                for (int j = 0; j < classesArray.length(); j++) {
                    classesNames[j] = classesArray.get(j).toString();
                }
                breed.setClasses(classesNames);
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }


    }


}