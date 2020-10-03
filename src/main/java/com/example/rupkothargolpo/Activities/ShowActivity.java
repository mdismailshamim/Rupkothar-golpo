package com.example.rupkothargolpo.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rupkothargolpo.Adapters.Paragraph;
import com.example.rupkothargolpo.R;

public class ShowActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView detailsTv,titleTv;
    private ImageView imageTv;
    public static final String EXTRA_SHOW_PAGE = "extra_page";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        imageTv = findViewById(R.id.imageTv);
        titleTv = findViewById(R.id.titleTv);
        detailsTv = findViewById(R.id.detailsTv);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            final Paragraph paragraph = (Paragraph) intent.getSerializableExtra(EXTRA_SHOW_PAGE);
            toolbar.setTitle(paragraph.getTitle());
            titleTv.setText(paragraph.getTitle());
            imageTv.setImageResource(paragraph.getImages());
            detailsTv.setText(paragraph.getDetails());
        }
    }
}