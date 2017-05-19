package com.krzykrucz.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by hector on 19/05/2017.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeResponse {

    private LocalDateTime dateTime;

}
