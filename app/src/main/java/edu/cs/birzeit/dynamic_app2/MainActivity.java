package edu.cs.birzeit.dynamic_app2;

import androidx.appcompat.app.AppCompatActivity;
import edu.cs.birzeit.dynamic_app2.model.Car;
import edu.cs.birzeit.dynamic_app2.model.CarModel;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edtResult;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        edtResult = findViewById(R.id.edtResult);
    }

    public void btnShow_Click(View view) {
        String type = spinner.getSelectedItem().toString();
        CarModel model = new CarModel();
        ArrayList<Car> result = model.getCarsByType(type);
        String msg = "";
        if(!result.isEmpty()){
            for(Car c : result){
                msg += "Model = " + c.getModel() + ", Year = " + c.getYear() + "\n";
            }
        }
        else{
            msg = "No cars found";
        }
        edtResult.setText(msg);
    }
}