package com.tolgakumbul.leetcode.question1396;


import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * An underground railway system is keeping track of customer travel times between different stations. They are using this data to calculate the average time it takes to travel from one station to another.
 * <p>
 * Implement the UndergroundSystem class:
 * <p>
 * void checkIn(int id, string stationName, int t)
 * A customer with a card ID equal to id, checks in at the station stationName at time t.
 * A customer can only be checked into one place at a time.
 * <p>
 * void checkOut(int id, string stationName, int t)
 * A customer with a card ID equal to id, checks out from the station stationName at time t.
 * <p>
 * double getAverageTime(string startStation, string endStation)
 * Returns the average time it takes to travel from startStation to endStation.
 * The average time is computed from all the previous traveling times from startStation to endStation that happened directly,
 * meaning a check in at startStation followed by a check out from endStation.
 * <p>
 * The time it takes to travel from startStation to endStation may be different from the time it takes to travel from endStation to startStation.
 * There will be at least one customer that has traveled from startStation to endStation before getAverageTime is called.
 * <p>
 * You may assume all calls to the checkIn and checkOut methods are consistent.
 * If a customer checks in at time t1 then checks out at time t2, then t1 < t2. All events happen in chronological order.
 */

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
@Component(value = "Question-1396")
public class UndergroundSystem {

    private Map<Integer, TimeForStation> checkInTimes;
    private Map<String, List<Integer>> averageTimes;


    public UndergroundSystem() {
        checkInTimes = new HashMap();
        averageTimes = new HashMap();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInTimes.put(id, new TimeForStation(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        TimeForStation time = checkInTimes.get(id);
        List<Integer> collection = averageTimes.get(time.station + "To" + stationName);
        if (CollectionUtils.isEmpty(collection)) {
            collection = new ArrayList<>();
        }
        collection.add(t - time.time);
        averageTimes.put(time.station + "To" + stationName, collection);
    }

    public double getAverageTime(String startStation, String endStation) {
        return averageTimes.get(startStation + "To" + endStation).stream()
                .mapToDouble(a -> a)
                .average()
                .getAsDouble();
    }

    class TimeForStation {
        public String station;
        public int time;

        public TimeForStation(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

}
