package lyf.lyfglidedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView= findViewById(R.id.iv_1);

        String myUrl="https://www.baidu.com/img/bd_logo1.png";
        Glide.with(this).load(myUrl).into(imageView);





    }
}
