package com.test.testing

import com.test.testing.code.BackpackCode
import com.test.testing.dto.Items
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BackPackApplication

fun main(args: Array<String>) {
	val availableItems = listOf(
		Items("Bag of Apples", 5),
		Items("Bread", 1),
		Items("Peanut Butter", 2),
		Items("Trail Mix", 3)
	)
	val bagCapacities = listOf(27, 38, 15, 100, 1000, 11, 12, 14, 10_000, 5)
	BackpackCode().runPackingSimulation(availableItems, bagCapacities)
}
