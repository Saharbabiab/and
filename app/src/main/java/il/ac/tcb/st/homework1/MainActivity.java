package il.ac.tcb.st.homework1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textViewLike;
    EditText editTextUsername;
    EditText editTextPassword;
    Button buttonLogin;
    CheckBox checkBoxRememberme;

    private int nTimesLiked=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textViewLike=findViewById(R.id.textViewLike);
        editTextUsername=findViewById(R.id.editTextUsername);
        editTextPassword=findViewById(R.id.editTextPassword);
        buttonLogin=findViewById(R.id.buttonLogin);
        checkBoxRememberme=findViewById(R.id.checkBoxRememberme);

        textViewLike.setOnClickListener(textViewLikeOnClickListener());
        buttonLogin.setOnClickListener(buttonLoginOnClickListener());
    }

    View.OnClickListener buttonLoginOnClickListener(){
        return v-> {
            ()
        };
    }

    View.OnClickListener textViewLikeOnClickListener(){
        return v->{
            nTimesLiked++;
        };
    }
}