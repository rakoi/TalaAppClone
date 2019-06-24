package bpskenya.ke.co.talaclone;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.Toolbar;

import com.smarteist.autoimageslider.SliderView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class ReadMoreActivity extends AppCompatActivity {

    int images[]={R.drawable.img_story_food, R.drawable.img_story_naftaly,R.drawable.img_story_card_salon};

    CarouselView carouselView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_more);

        android.support.v7.widget.Toolbar successToolbar=(android.support.v7.widget.Toolbar)findViewById(R.id.successStoriesToolbar);

        successToolbar.setTitle("Success Stories");
        successToolbar.setNavigationIcon(R.drawable.home_icon);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(images.length);


        ImageListener imageListener = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(images[position]);
            }
        };
        carouselView.setImageListener(imageListener);
    }


}
