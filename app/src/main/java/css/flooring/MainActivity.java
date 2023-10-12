package css.flooring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextLength;
    private EditText editTextWidth;
    private Button buttonCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLength = findViewById(R.id.editTextLength);
        editTextWidth = findViewById(R.id.editTextWidth);
        buttonCalculate = findViewById(R.id.buttonCalculate);

        // Set a click listener for the button
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateArea();
            }
        });
    }

    private void calculateArea() {
        double length = Double.parseDouble(editTextLength.getText().toString());
        double width = Double.parseDouble(editTextWidth.getText().toString());
        double area = length * width;

        // Create an Intent to start ResultsActivity
        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("length", length);
        intent.putExtra("width", width);
        intent.putExtra("area", area);

        startActivity(intent);
    }
}