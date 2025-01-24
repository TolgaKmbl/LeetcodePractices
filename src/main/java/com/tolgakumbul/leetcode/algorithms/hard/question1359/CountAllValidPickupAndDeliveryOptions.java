package com.tolgakumbul.leetcode.algorithms.hard.question1359;

import org.springframework.stereotype.Component;

/**
 * Given n orders,each order consists of a pickup and a delivery service.
 *
 * Count all valid pickup/delivery possible sequences such that delivery(i) is always after of pickup(i).
 *
 * Since the answer may be too large, return it modulo 10^9 + 7.
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: 1
 * Explanation: Unique order (P1, D1), Delivery 1 always is after of Pickup 1.
 * Example 2:
 *
 * Input: n = 2
 * Output: 6
 * Explanation: All possible orders:
 * (P1,P2,D1,D2), (P1,P2,D2,D1), (P1,D1,P2,D2), (P2,P1,D1,D2), (P2,P1,D2,D1) and (P2,D2,P1,D1).
 * This is an invalid order (P1,D2,P2,D1) because Pickup 2 is after of Delivery 2.
 * Example 3:
 *
 * Input: n = 3
 * Output: 90
 * https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/
 */
@Component(value = "Question-1359")
public class CountAllValidPickupAndDeliveryOptions {

    private static final int MOD = 1000000007;

    public int countOrders(int n) {
        long count = 1;
        for (int i = 2; i <= n; i++) {
            /**2i positions for i pickups and i deliveries
             * 2i - 1 position choices for Pickup-i, since you can put it anywhere except at the end.
             * For Delivery-i, you only have i choices, because it must come after Pickup-i.
             */
            count = (count * (2 * i - 1) * i) % MOD;
        }
        return (int) count;
    }

}
