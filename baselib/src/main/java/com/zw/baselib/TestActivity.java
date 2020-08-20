package com.zw.baselib;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

/**
 * @Description:
 * @Author: zw
 * @Email: 1062091703@qq.com
 * @Date: 2020/8/19 17:05
 */
public class TestActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
}
