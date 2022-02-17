package com.ymh.kafka;

import java.time.LocalDateTime;

public record Message(String message, LocalDateTime created) {
}
