package ru.mike.diploma.util;

import ru.mike.diploma.util.exception.InvalidTimeException;

import java.time.LocalTime;

public class TimeUtil {
    private static final LocalTime STOP_VOTE_TIME = LocalTime.of(11, 00, 00);

    public TimeUtil() {
    }

    public static void chekVoteTime(LocalTime voteTime) {

        if (voteTime.isAfter(STOP_VOTE_TIME)) {
            throw new InvalidTimeException(" too late to vote, " + voteTime + ", try again tomorrow before 11:00 a.m.");
        }
    }
}
