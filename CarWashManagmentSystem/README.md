🚗 SharkTail Car Wash Management System
📌 Overview
SharkTail Car Wash is a Java console application that simulates a car wash management system.
Users can register cars, select a car to service, apply basic and extra services, view the service history of each car, and calculate the total cost of the visit.

This project demonstrates essential Object-Oriented Programming concepts:

Classes & objects

Interfaces

Composition

ArrayLists

Menu-driven interaction

Per-object history tracking

Input validation

🧱 Project Structure
1. Car
Represents a car registered in the system.

Fields:

name — the car brand/model

history — a list of all services applied to the car

Key Methods:

addToHistory(String entry) — adds a service entry

showHistory() — displays the car’s service history

getName() — returns the car’s name

2. CarArray
Manages all cars in the system.

Features:

Add a new car

Select a car from the list

Uses ArrayList<Car> internally.

3. Services & ExtraServices
Represent the available services.

Both implement the interface:

java
public interface CarUse {
    String getName();
    double getPrice();
}
Basic Services include:

Car Wash

Car Wax

Interior Cleaning

Extra Services include:

Window Cleaning

Perfume

Wheel Cleaning

Each service has a fixed name and price.

4. ServicesArray & ExtraServicesArray
Contain all available services and allow the user to select one.

5. FinalOrder
Stores the selected services for the current visit and calculates the total cost.

Key Methods:

chooseServices(Services s)

chooseExtraServices(ExtraServices e)

calculateTotal() — returns the total price

6. Main
The main menu that connects all components.

The user can:

Add a car

Select a car

Add a basic service

Add an extra service

View the car’s history

Calculate the total cost

Exit

🧩 How It Works
➤ Adding a Car
The user enters a car brand/model, which is stored in CarArray.

➤ Selecting a Car
The user chooses which car will receive services.
This car becomes the selectedCar.

➤ Adding a Basic Service
The user selects a service (wash, wax, interior cleaning)

The service is stored in FinalOrder

The service is added to the car’s history

➤ Adding an Extra Service
The user selects an extra service (windows, perfume, wheels)

The extra is stored in FinalOrder

The extra is added to the car’s history

➤ Viewing History
Displays all services the selected car has received.

➤ Calculating Total
Adds the prices of the selected basic and extra services.

🎯 Learning Outcomes
By completing this project, you practice:

Managing multiple objects per customer

Tracking history per object

Using ArrayLists effectively

Implementing interfaces

Building a menu-driven Java application

Connecting multiple classes into one functional system

🚀 Future Improvements 
Save cars and history to a file

Add timestamps to history entries

Allow multiple services per visit

Add car categories (SUV, sedan, etc.)

Add employee/worker management
