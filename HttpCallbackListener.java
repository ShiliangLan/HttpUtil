package com.example.lanshiliang.httputil;

/**
 * Created by lanshiliang on 2016/1/18.
 */
public interface HttpCallbackListener {
    // get the response of Http request
    void onFinish(String response);
    // do something if has error
    void onError(Exception e);
}
