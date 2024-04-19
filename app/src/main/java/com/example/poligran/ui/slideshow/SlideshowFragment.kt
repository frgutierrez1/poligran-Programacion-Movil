package com.example.poligran.ui.slideshow

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.example.poligran.R


class SlideshowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_slideshow, container, false)

        val videoView = rootView.findViewById<VideoView>(R.id.videoView)
        //videoView.setVideoPath("https://cdn.flowplayer.com/a30bd6bc-f98b-47bc-abf5-97633d4faea0/hls/de3f6ca7-2db3-4689-8160-0f574a5996ad/playlist.m3u8") // Set the URL or local path
        val videoPath = "android.resource://" + requireActivity().packageName + "/" + R.raw.variables
        videoView.setVideoPath(videoPath)

        val mediaController = MediaController(context)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.start() // Start playing

        return rootView

    }
}
