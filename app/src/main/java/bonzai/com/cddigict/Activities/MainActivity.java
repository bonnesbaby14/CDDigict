package bonzai.com.cddigict.Activities;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import bonzai.com.cddigict.R;

public class MainActivity extends AppCompatActivity {
    TextInputEditText tiMail,tiPass;
    Button btnSingin, btnSingup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tiMail=findViewById(R.id.etMail);
        tiPass=findViewById(R.id.edPass);
        btnSingin=findViewById(R.id.btnSingin);
        btnSingup=findViewById(R.id.btnSingup);



        btnSingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(getApplicationContext(),Singup.class);
                startActivity(intent);
                finish();
            }
        });
        btnSingin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!validateMail()|| !validatePass()){
                    return;


                }
                Toast.makeText(getApplicationContext(),"listo",Toast.LENGTH_LONG).show();
                loginSuccesfully();


            }
        });

    }



    public boolean validateMail(){
String emailInput = tiMail.getText().toString().trim();
if(emailInput.isEmpty()){
    tiMail.setError("Campo vacio");
    return false;
}else {

    tiMail.setError(null);
    return true;
}

    }
    public boolean validatePass(){
        String emailInput = tiPass.getText().toString().trim();
        if(emailInput.isEmpty()){
            tiPass.setError("Campo vacio");
            return false;
        }else {

            tiPass.setError(null);
            return true;
        }

    }


    void loginSuccesfully(){
Intent intent= new Intent(getApplicationContext(),OneSystem.class);
startActivity(intent);
finish();




    }



}//end of class
