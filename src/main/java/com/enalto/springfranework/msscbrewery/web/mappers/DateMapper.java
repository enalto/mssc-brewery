package com.enalto.springfranework.msscbrewery.web.mappers;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Component
public class DateMapper {

    public OffsetDateTime toOffsetDateTime(Timestamp timestamp) {
        LocalDateTime localDateTime = timestamp.toLocalDateTime();

        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth(),
                localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano(),
                ZoneOffset.UTC);
        return offsetDateTime;
    }

    public Timestamp toTimestamp(OffsetDateTime offsetDateTime) {
        LocalDateTime localDateTime = offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();

        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        return timestamp;
    }
}
