package ba.unsa.etf.rma.VJ_17749;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText textField;
    private ListView listView;
    private MuzicarAdapter adapter;
    private ArrayList<Muzicar> unosi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        unosi=new ArrayList<Muzicar>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        textField = (EditText) findViewById(R.id.editText);
        listView = (ListView) findViewById(R.id.listView);
        setListData();
        Resources res=getResources();
        adapter = new MuzicarAdapter(this,unosi,res);
        listView.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                unosi.add(0,new Muzicar(textField.getText().toString(),"Rock","www.rock.ba","nista","rock"));
                adapter.notifyDataSetChanged();
                textField.setText("");
            }
        });
    }

    public void setListData()
    {

        for (int i = 0; i < 5; i++) {

             Muzicar sched = new Muzicar();

            /******* Firstly take data in model object ******/
            sched.setImePrezime("Muzicar "+i);
            if(i%2==0) {
                sched.setImage("rock.png");
                sched.setZanr("Rock");
                sched.setWebStranica("www.rock.com");
            }
            else{
                sched.setImage("violin.png");
                sched.setZanr("Classical");
                sched.setWebStranica("www.classical.com");
            }

            /******** Take Model Object in ArrayList **********/
            unosi.add( sched );
           // adapter.notifyDataSetChanged();
        }

    }

    public void onItemClick(int mPosition)
    {
        Muzicar tempValues = ( Muzicar ) unosi.get(mPosition);


        // SHOW ALERT

        Toast.makeText(this,""+tempValues.getImePrezime() +"Image:"+tempValues.getImage() +"Url:"+tempValues.getWebStranica(), Toast.LENGTH_LONG).show();
    }
}
