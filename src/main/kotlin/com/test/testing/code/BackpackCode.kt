package com.test.testing.code

import com.test.testing.dto.Items

class BackpackCode {
    fun runPackingSimulation(items: List<Items>, bagCapacities: List<Int>) {
        for (bagCapacity in bagCapacities) {
            println("Bag Capacity: $bagCapacity")
            val packedItems = optimizePackingUsingUnboundedKnapsack(items, bagCapacity)
            if (packedItems.isNotEmpty())
            {
                println("Potential Items:")
                packedItems.forEach { (itemName, itemCount) ->
                    println("Item: \"$itemName\", Count: $itemCount")
                }
            }
            println("----------------------------")
        }
    }

    private fun optimizePackingUsingUnboundedKnapsack(items: List<Items>, capacity: Int): Map<String, Int> {
        // one of each item is included first
        var baseWeight = 0
        val counts = LinkedHashMap<String, Int>() // Preserves insertion order

        for (item in items) {
            counts[item.name] = 1
            baseWeight += item.weight
        }

        if (baseWeight > capacity) {
            println("Capacity too small to fit one of each item.")
            return emptyMap()
        }

        val remaining = capacity - baseWeight
        if (remaining == 0) {
            return counts
        }

        // minimize item count for remaining capacity
        val dp = IntArray(remaining + 1) { Int.MAX_VALUE / 2 }
        val lastUsed = IntArray(remaining + 1) { -1 }
        dp[0] = 0

        for (i in 1..remaining) {
            for ((index, item) in items.withIndex()) {
                val weight = item.weight
                if (weight <= i && dp[i - weight] + 1 < dp[i]) {
                    dp[i] = dp[i - weight] + 1
                    lastUsed[i] = index
                }
            }
        }

        // Backtrack to determine items used
        if (dp[remaining] >= Int.MAX_VALUE / 2) {
            throw RuntimeException("Cannot fill backpack exactly with given weights.")
        }

        var current = remaining
        while (current > 0) {
            val idx = lastUsed[current]
            if (idx == -1) {
                break
            }
            val item = items[idx]
            counts[item.name] = counts[item.name]!! + 1
            current -= item.weight
        }

        return counts
    }
}