/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("weṭeṭṭi","red",R.drawable.color_red));
        words.add(new Word("chokokki","green",R.drawable.color_green));
        words.add(new Word("ṭakaakki","brown",R.drawable.color_brown));
        words.add(new Word("ṭopoppi","gray",R.drawable.color_gray));
        words.add(new Word("kululli","black",R.drawable.color_black));
        words.add(new Word("kelelli","white",R.drawable.color_white));
        words.add(new Word("ṭopiisә","dusty yellow",R.drawable.color_dusty_yellow));
        words.add(new Word("chiwiiṭә","mustard yellow",R.drawable.color_mustard_yellow));
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
