package org.example;

import org.jsoup.Jsoup;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsoupTextReorderTest {
    @Test
    public void foo() throws IOException {
        var jsoupDoc = Jsoup.parse(getClass().getResourceAsStream("/input.html"), null, "");
        var text = jsoupDoc.body().text();
        assertEquals("TEXT-AAA TEXT-BBB TEXT-CCC TEXT-DDD", text);
    }
}
