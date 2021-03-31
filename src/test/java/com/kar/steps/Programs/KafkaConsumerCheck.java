package com.kar.steps.Programs;

import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import static org.awaitility.Awaitility.await;
// use apache kafka client consumer to check the consumed data from kakfka
public class KafkaConsumerCheck {
    public void checkMessageInKafka(String eventGUID) {


    }

    @Test
    public void testKafkaMessage() {
        String eventGUID = "234234234-dasfasdfads-3333";
        Pattern pattern = Pattern.compile("\"eventGUID\".*:.*\"" + eventGUID);
        await().atMost(120, TimeUnit.SECONDS).untilAsserted(()-> {
//            String message =
                })
        ;
//        checkMessageInKafka(String eventGUID);
    }

}
