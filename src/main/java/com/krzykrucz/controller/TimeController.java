package com.krzykrucz.controller;

import com.krzykrucz.domain.TimeResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.stream.Stream;

/**
 * Created by hector on 19/05/2017.
 */

@RestController
@Slf4j
public class TimeController {

    @GetMapping(value = "/time", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<TimeResponse> getTimeStream() {
        final Flux<Long> interval = Flux.interval(Duration.ZERO, Duration.ofSeconds(1));
        final Flux<TimeResponse> timeResponse = Flux.fromStream(Stream.generate(() -> new TimeResponse(LocalDateTime.now())));

        return Flux.zip(timeResponse, interval).map(Tuple2::getT1);
    }
}
