package com.example.pitchapp_withtabview;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TabFragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabFragment1 extends Fragment {

    @BindView(R.id.recyclerViewFeed)
    RecyclerView recyclerViewFeed;

    YoutubeRecyclerAdapter mRecyclerAdapter;

    public TabFragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind((Activity) getContext());

        // prepare data for list
        List<YoutubeVideo> youtubeVideos = prepareList();

        recyclerViewFeed = view.findViewById(R.id.recyclerViewFeed);

        mRecyclerAdapter = new YoutubeRecyclerAdapter(youtubeVideos);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerViewFeed.setLayoutManager(mLayoutManager);
        recyclerViewFeed.setItemAnimator(new DefaultItemAnimator());
        recyclerViewFeed.setAdapter(mRecyclerAdapter);
    }

    private List<YoutubeVideo> prepareList() {
        ArrayList<YoutubeVideo> videoArrayList=new ArrayList<>();
        // add first item
        YoutubeVideo video1 = new YoutubeVideo();
        video1.setId(1l);
        video1.setImageUrl("https://i.ytimg.com/vi/TOl1_W4cpc8/maxresdefault.jpg");
        video1.setTitle(
                "The Opportunity: iCapsulate" + "\n" + "The Ask: 50,000 USD" + "\n" + "Equity: 20%");
        video1.setVideoId("TOl1_W4cpc8");
        //videoArrayList.add(video1);
        // add second item
        YoutubeVideo video2 = new YoutubeVideo();
        video2.setId(2l);
        video2.setImageUrl("https://i.ytimg.com/vi/k3PY_p_M-8w/maxresdefault.jpg");
        video2.setTitle(
                "Opportunity: Scrub Daddy" + "\n" + "Ask: 50,000 USD" + "\n" + "Equity: 20%");
        video2.setVideoId("k3PY_p_M-8w");
        // add third item
        YoutubeVideo video3 = new YoutubeVideo();
        video3.setId(3l);
        video3.setImageUrl("https://i.ytimg.com/vi/YqQblsZgF8M/hqdefault.jpg");
        video3.setTitle("Opportunity: Doorbot" + "\n" + "Ask: 200,000 USD" + "\n" + "Equity: 5%");
        video3.setVideoId("YqQblsZgF8M");
        // add four item
        YoutubeVideo video4 = new YoutubeVideo();
        video4.setId(4l);
        video4.setImageUrl("https://i.ytimg.com/vi/fr54GKh7haM/maxresdefault.jpg");
        video4.setTitle("Opportunity: Tipsy Elves Sweaters" + "\n" + "Ask: 60,000 USD" + "\n" + "Equity: 20%");
        video4.setVideoId("fr54GKh7haM");
        // add four item
        YoutubeVideo video5 = new YoutubeVideo();
        video5.setId(5l);
        video5.setImageUrl("https://i.ytimg.com/vi/S84Fuo2rGoY/maxresdefault.jpg");
        video5.setTitle("What happened after Jauhar of Padmavati");
        video5.setVideoId("S84Fuo2rGoY");
        videoArrayList.add(video1);
        videoArrayList.add(video4);
        videoArrayList.add(video3);
        videoArrayList.add(video2);
        return videoArrayList;
    }
}
