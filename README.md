# Bounded Knapsack Problem

This project is a Spring Boot application that demonstrates the implementation of the Bounded Knapsack Problem using Maven as the build tool.

## Getting Started

## How to run the Application
**Prerequisites:**
- Java Development Kit (JDK) 11 or higher
- Maven 3.6 or higher
- An IDE such as IntelliJ IDEA or Eclipse (optional)

**Steps to run the application:**
- TestingApplication.kt contains a main method to run the application. It will execute the bounded knapsack algorithm with sample data.

## Project Structure 
1. **src/main/kotlin**: Contains the Java source code for the application.
2. **src/main/kotlin/Backpack.kt**: Contains the implementation of the UnBounded Knapsack Problem algorithm.
2. **src/main/resources**: Contains application configuration files.
3. **pom.xml**: Maven configuration file that manages project dependencies and build settings.
4. **README.md**: Project documentation.


### Sample Input and Output Explanation

Tested multiple bag capacities to make sure the packing logic works for all kinds of cases.
For normal capacities like 27, 38, and 15, I checked if the output matches the expected number of items.
For larger capacities such as 100, 1000, and 10,000, I wanted to see if the program can handle big numbers without any issues.
For edge values like 11, 12, and 14, I tested how the logic behaves when the bag capacity is just around the minimum needed.
Lastly, I used 5 as an invalid case to confirm that the code properly handles situations where not even one of each item can fit.