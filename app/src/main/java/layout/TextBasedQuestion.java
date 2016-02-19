package layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.appple.quizapp.R;
import com.example.appple.quizapp.scoreActivity;


public class TextBasedQuestion extends Fragment {


    RadioButton rb1;
    Button btnNext;
    int correct = 0;
    /*public interface onSomeEventListener {
        public void someEvent(int s);
    }

    onSomeEventListener someEventListener;

    public void onAttach(ImageQuestion activity) {
        //super.onAttach(activity);
        try {
            someEventListener = (onSomeEventListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onSomeEventListener");
        }
    }*/
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public TextBasedQuestion(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_text_based_question, null);
        btnNext = (Button)getView().findViewById(R.id.submitButton);
        rb1 = (RadioButton)getView().findViewById(R.id.Radio1);
        btnNext = (Button)getView().findViewById(R.id.submitButton);
        //final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        correct = getArguments().getInt("message");
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // SharedPreferences.Editor = app.preferences.edit;
                if(rb1.isChecked()){
                    //   editor.putInt("answer_Value1", 1);
                    //someEventListener.someEvent(1);
                    correct = 1;
                }else{
                    //   editor.putInt("answer_Value", 0);
                   // someEventListener.someEvent(0);
                    correct = 0;
                }
                // editor.commit();

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getBaseContext(),
                        scoreActivity.class);
                intent.putExtra("message1", correct);
                getActivity().startActivity(intent);

            }
        });

        return rootView;
    }

}
