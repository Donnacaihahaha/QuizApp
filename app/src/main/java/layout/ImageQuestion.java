package layout;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.appple.quizapp.R;

public class ImageQuestion extends Fragment {
    int correct =0;
    public ImageQuestion(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private EditText tv;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {

        Button btnNext;

        View rootView = inflater.inflate(R.layout.fragment_image_question, null);
        tv =(EditText)rootView.findViewById(R.id.userAnswer);
        btnNext = (Button) rootView.findViewById(R.id.nextButton);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = tv.getText().toString();
                if(!userInput.matches("")){
                    if(userInput.matches("WHITE HOUSE")){
                        correct = 1;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putInt("message", correct);
                TextBasedQuestion testBasedQuestion = new TextBasedQuestion();
                testBasedQuestion.setArguments(bundle);
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, testBasedQuestion)
                        .addToBackStack(null)
                        .commit();

            }
        });
        return rootView;
    }

}
