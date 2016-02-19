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
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.appple.quizapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TextBasedQuestion.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TextBasedQuestion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TextBasedQuestion extends Fragment {

    Button btnNext;
    RadioButton rb1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rb1 = (RadioButton)getView().findViewById(R.id.Radio1);
        btnNext = (Button)getView().findViewById(R.id.submitButton);
        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor = app.preferences.edit;
                if(rb1.isChecked()){
                    editor.putInt("answer_Value1", 1);
                }else{
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
        return inflater.inflate(R.layout.fragment_text_based_question, container, false);
    }

}
