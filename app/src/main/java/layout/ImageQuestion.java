package layout;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.appple.quizapp.R;

public class ImageQuestion extends Fragment {
int correct;
    public ImageQuestion(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        //this.activity = activity;
    }
    /*public interface onSomeEventListener {
        public void someEvent(int s);
    }

    onSomeEventListener someEventListener;

    public void onAttach(ImageQuestion activity) {
        super.onAttach(activity);
        try {
            someEventListener = (onSomeEventListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onSomeEventListener");
        }
    }
    */
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {

        Button btnNext;

        //Fragment frag;
        //FragmentTransaction fragTransaction;

        btnNext = (Button)getView().findViewById(R.id.submitButton);
        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer = "WHITE HOUSE";
                TextView tv;
                tv =(TextView)getView().findViewById(R.id.textView1);
                //SharedPreferences.Editor = app.preferences.edit;
                if (tv.getText().toString().equals(answer)) {
                  // someEventListener.someEvent(1); //editor.putInt("answer_Value", 1);
                    correct = 1;
                } else {
                  //  someEventListener.someEvent(0);// editor.putInt("answer_Value", 0);
                    correct = 0;
                }

              //  editor.commit();

            }
        });
        // Inflate the layout for this fragment
        //frag = new TextBasedQuestion();
        Bundle bundle = new Bundle();
        bundle.putInt("message", correct);
        TextBasedQuestion testBasedQuestion = new TextBasedQuestion();
        testBasedQuestion.setArguments(bundle);
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new TextBasedQuestion())
                .addToBackStack(null)
                .commit();

        View rootView = inflater.inflate(R.layout.fragment_image_question, null);
        return rootView;
    }

}
