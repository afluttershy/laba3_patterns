package com.example.facade.facade;

import com.example.facade.library.AudioMixer;
import com.example.facade.library.BitrateReader;
import com.example.facade.library.Codec;
import com.example.facade.library.CodecFactory;
import com.example.facade.library.MPEG4Codec;
import com.example.facade.library.OggCodec;
import com.example.facade.library.VideoFile;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCodec();
        } else {
            destinationCodec = new MPEG4Codec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
