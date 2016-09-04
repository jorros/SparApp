package de.sparapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import de.sparapp.R;

public class TutorialActivity extends Activity {
    int imageIds[] = { R.drawable.tutorial1, R.drawable.tutorial2, R.drawable.tutorial3, R.drawable.tutorial4, R.drawable.tutorial5};
    int messageCount=imageIds.length;
    int currentIndex = 0;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tutorial);

        final ImageSwitcher switcher = (ImageSwitcher)findViewById(R.id.imageSwitcher);
        Button nextBtn = (Button)findViewById(R.id.tutorialButton);

        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
                return imageView;
            }
        });

        Animation in = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        Animation out = AnimationUtils.loadAnimation(this, R.anim.slide_out_left);
        switcher.setInAnimation(in);
        switcher.setOutAnimation(out);

        switcher.setImageResource(imageIds[currentIndex]);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentIndex++;

                if(currentIndex == messageCount) {
                    Intent intent = new Intent(getBaseContext(), ProductListActivity.class);
                    startActivity(intent);
                } else {
                    switcher.setImageResource(imageIds[currentIndex]);

                }
            }
        });
    }
}
