package com.marcus.hello.apps;

import com.marcus.hello.inheritance.urlcheck.URLProcessorImpl;

import java.io.IOException;
import java.net.URL;

/**
 * @author marcus
 */
public class UrlProcessorApp {

    public static void main(String[] args) throws IOException {

        URLProcessorImpl urlProcessor = new URLProcessorImpl();
        urlProcessor.process(new URL("http://www.bbc.co.uk"));
    }
}
