The Pet Care Management System is a Java console application that allows users to manage pets and the services they receive at a pet care center.
Users can add pets, select services, apply extra services, view each pet’s visit history, and calculate the total cost of a visit.

This project demonstrates core Object-Oriented Programming concepts such as:

Classes & objects

Interfaces

Composition

ArrayLists

Menu-driven interaction

Per-object history tracking

🧱 Project Structure
1. Pet
Represents a pet registered in the system.

Fields:

name — the pet’s name

history — a list of all services the pet has received

Key Methods:

addToHistory(String entry) — adds a service entry to the pet’s history

showHistory() — displays the pet’s visit history

getName() — returns the pet’s name

2. PetArray
Manages all pets in the system.

Features:

Add a new pet

Select a pet from the list

Uses ArrayList<Pet> to store pets.

3. Services & ExtraServices
Represent the available services.

Both implement the interface:

java
public interface PetManagment {
    String getName();
    double getPrice();
}
Basic Services include:

Bath

Grooming

Training

Extra Services include:

Teeth cleaning

Nails done

Perfume

Each service has a name and a fixed price.

4. ServicesArray & ExtraServicesArray
Contain all available services and allow the user to select one.

5. FinalOrder
Stores the selected services for the current visit and calculates the total cost.

Key Methods:

chooseServices(Services s)

chooseExtraServices(ExtraServices e)

calculateTotal() — returns the total price of all selected services

6. Main
The main menu that connects all components.

The user can:

Add a pet

Select a pet

Choose a basic service

Choose an extra service

View the pet’s history

View the total cost

Exit

🧩 How It Works
➤ Adding a Pet
The user enters a name, and the pet is stored in PetArray.

➤ Selecting a Pet
The user chooses which pet will receive services.
This pet becomes the selectedPet.

➤ Choosing a Service
The user selects a basic service (bath, grooming, training)

The service is stored in FinalOrder

The service is added to the pet’s history

➤ Choosing an Extra Service
The user selects an extra service (nails, teeth cleaning, perfume)

The extra is stored in FinalOrder

The extra is added to the pet’s history

➤ Viewing History
Displays all services the selected pet has received.

➤ Total Cost
Calculates and displays the total price of all selected services.

🎯 Learning Outcomes
By completing this project, you practice:

Managing multiple objects per customer

Tracking history per object

Using ArrayLists effectively

Implementing interfaces

Building a menu-driven Java application

Combining multiple classes into one functional system

🚀 Future Improvements (Optional Ideas)
Save pets and history to a file

Add timestamps to history entries

Allow multiple services per visit

Add categories (dogs, cats, etc.)

Add employee/groomer management
