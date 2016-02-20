package layout;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public TextBasedQuestion(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_text_based_question, null);
        rb1 = (RadioButton)rootView.findViewById(R.id.Radio1);
        btnNext = (Button)rootView.findViewById(R.id.submitButton);
        correct = getArguments().getInt("message");
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // SharedPreferences.Editor = app.preferences.edit;
                if(rb1.isChecked()){
                    correct = correct +  1;
                }else{
                    correct =correct +  0;
                }
                Intent intent = new Intent(getActivity().getBaseContext(),
                        scoreActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("message1", correct);
                intent.putExtras(bundle);
                getActivity().startActivity(intent);
            }
        });


        return rootView;
    }

}
