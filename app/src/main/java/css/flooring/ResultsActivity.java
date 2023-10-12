package css.flooring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        // Retrieve data from the intent
        double length = getIntent().getDoubleExtra("length", 0);
        double width = getIntent().getDoubleExtra("width", 0);
        double area = getIntent().getDoubleExtra("area", 0);

        TextView roomDetails = findViewById(R.id.textViewRoomDetails);
        TextView areaTextView = findViewById(R.id.textViewArea);

        // Display room details and area
        roomDetails.setText("Room Details: Length = " + length + " meters, Width = " + width + " meters");
        areaTextView.setText("Area: " + area + " square meters");
    }
}