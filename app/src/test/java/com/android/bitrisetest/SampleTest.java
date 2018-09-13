package com.android.bitrisetest;

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

@SmallTest
public class SampleTest {

    @Test
    public void this_will_fail(){

        assertEquals(true,true);
    }
}
