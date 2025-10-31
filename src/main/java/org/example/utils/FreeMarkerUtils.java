package org.example.utils;

import java.util.List;

public class FreeMarkerUtils {

    public record Freemarker(String name, String value) {
        public String getFreeMarker() {
            return "${" + name + "}";
        }
    }

    public static String replace(String text, List<Freemarker> freeMarkers) {
        return freeMarkers.stream()
                .reduce(text,
                        (acc, freeMarker) -> {
                            return acc.replace(freeMarker.getFreeMarker(), freeMarker.value());
                        },
                        (a, b) -> "");
    }
}
