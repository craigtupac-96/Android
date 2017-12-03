package eu.craigspace.simpleform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "What this does??";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // this method is called at button click because we assigned the name to the
    // "OnClick" property of the button
    public void onClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = (EditText) findViewById(R.id.inputValue);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        if(message.equals("")){
            Toast.makeText(this, "No name entered",
                    Toast.LENGTH_LONG).show();
            return;
        }
        else {
            startActivity(intent);
        }

    }

}
