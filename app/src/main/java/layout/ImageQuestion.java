package layout;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.appple.quizapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ImageQuestion.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ImageQuestion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ImageQuestion extends Fragment {
    TextView tv;
    Button btnNext;
    String answer = "WHITE HOUSE";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tv =(TextView)getView().findViewById(R.id.textView1);
        btnNext = (Button)getView().findViewById(R.id.submitButton);
        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor = app.preferences.edit;
                if (tv.equals(answer)) {
                    editor.putInt("answer_Value", 1);
                } else {
                    editor.putInt("answer_Value", 0);
                }
                editor.commit();

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_image_question, container, false);
    }

}
