package fr.utt.if26.mougne_tp03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView msg = null;

    /**
     * Kikou
     * @author Adrian
     * @see textview
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = (TextView) findViewById(R.id.message);
      //  msg.setText("Message androidas");
    }
}
