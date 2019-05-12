package bonzai.com.cddigict.Activities;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import bonzai.com.cddigict.R;

public class Singup extends AppCompatActivity {

    Button btnAccept,btnCancel;
    TextInputEditText tiNombre,tiApellido,tiMail,tiPass,tiPass2,tiPhone, tiState, tiCity;
    Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        btnAccept=findViewById(R.id.btnAccept);
        btnCancel=findViewById(R.id.btnCancel);

        tiNombre=findViewById(R.id.tiNombre);
        tiApellido=findViewById(R.id.tiLast);
        tiMail=findViewById(R.id.tiMail);
        tiPass=findViewById(R.id.tiPass1);
        tiPass2=findViewById(R.id.tiPass2);
        tiPhone=findViewById(R.id.tiPhone);
        tiCity=findViewById(R.id.tiCity);
        tiState=findViewById(R.id.tiState);

        spinner=findViewById(R.id.spType);







        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();


            }
        });
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!validateName()|| !validateLast()|| !validateMail()|| !validateCity()|| !validatePass1()||

                        !validatePass2()|| !validatePhone()|| !validateState()|| !validateTwoPass()){


                }else   {
                    Toast.makeText(getApplicationContext(),validateSpinner(),Toast.LENGTH_LONG).show(); return;



                }

            }
        });



    }


    @Override
    public void onBackPressed() {


        return;
    }


    public boolean validateMail() {
        String emailInput = tiMail.getText().toString().trim();
        if (emailInput.isEmpty()) {
            tiMail.setError("Campo vacio");
            return false;
        } else {

            tiMail.setError(null);
            return true;
        }


    }
    public boolean validateName() {
        String emailInput = tiNombre.getText().toString().trim();
        if (emailInput.isEmpty()) {
            tiNombre.setError("Campo vacio");
            return false;
        } else {

            tiNombre.setError(null);
            return true;
        }


    }

    public boolean validateLast() {
        String emailInput = tiApellido.getText().toString().trim();
        if (emailInput.isEmpty()) {
            tiApellido.setError("Campo vacio");
            return false;
        } else {

            tiApellido.setError(null);
            return true;
        }


    }
    public boolean validatePass1() {
        String emailInput = tiPass.getText().toString().trim();
        if (emailInput.isEmpty()) {
            tiPass.setError("Campo vacio");
            return false;
        } else {

            tiPass.setError(null);
            return true;
        }


    }
    public boolean validatePass2() {
        String emailInput = tiPass2.getText().toString().trim();
        if (emailInput.isEmpty()) {
            tiPass2.setError("Campo vacio");
            return false;
        } else {

            tiPass2.setError(null);
            return true;
        }


    }

    public boolean validatePhone() {
        String emailInput = tiPhone.getText().toString().trim();
        if (emailInput.isEmpty()) {
            tiPhone.setError("Campo vacio");
            return false;
        } else {

            tiPhone.setError(null);
            return true;
        }


    }
    public boolean validateState() {
        String emailInput = tiState.getText().toString().trim();
        if (emailInput.isEmpty()) {
            tiState.setError("Campo vacio");
            return false;
        } else {

            tiState.setError(null);
            return true;
        }


    }

    public boolean validateCity() {
        String emailInput = tiCity.getText().toString().trim();
        if (emailInput.isEmpty()) {
            tiCity.setError("Campo vacio");
            return false;
        } else {

            tiCity.setError(null);
            return true;
        }


    }
    public boolean validateTwoPass() {
        String pass1 = tiPass.getText().toString().trim();
        String pass2 = tiPass2.getText().toString().trim();

        if (!pass1.equals(pass2)) {
            tiPass.setError("Diferent Password");
            tiPass.setText("");
            tiPass2.setText("");
            return false;
        } else {

            tiPass.setError(null);
            return true;
        }


    }


    public String validateSpinner() {
    String item=spinner.getSelectedItem().toString();

return item;
    }






}//fin de la clase
