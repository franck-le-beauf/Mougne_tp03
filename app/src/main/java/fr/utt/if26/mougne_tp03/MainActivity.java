package fr.utt.if26.mougne_tp03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView msg = null;
    Button btn = null;

    /**
     * Kikou
     * @author Adrian
      * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = (TextView) findViewById(R.id.message);
         msg.setText("Message androidas");

    }

    public void sendMessage(View view) {
        Log.d("ee","dd");
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
