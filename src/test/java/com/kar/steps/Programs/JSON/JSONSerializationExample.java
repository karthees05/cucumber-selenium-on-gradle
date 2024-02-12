//package com.kar.steps.Programs.JSON;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
//
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//import static org.junit.Assert.assertEquals;
//
//public class JSONSerializationExample {
//
//    private ObjectMapper objectMapper;
//
//    @Before
//    public void init() {
//        JavaTimeModule module = new JavaTimeModule();
//        LocalDateTimeDeserializer localDateTimeDeserializer = new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
//        module.addDeserializer(LocalDateTime.class, localDateTimeDeserializer);
//        objectMapper = Jackson2ObjectMapperBuilder.json()
//                .modules(module)
//                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
//                .build();
//    }
//
//    @Test
//    public void test() throws IOException {
//        final String json = "{ \"date\": \"2016-11-08 12:00\" }";
//        final JsonType instance = objectMapper.readValue(json, JsonType.class);
//
//        assertEquals(LocalDateTime.parse("2016-11-08 12:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")), instance.getDate());
//    }
//}
//
//
//class JsonType {
//    private LocalDateTime date;
//
//    public LocalDateTime getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDateTime date) {
//        this.date = date;
//    }
//}
//
