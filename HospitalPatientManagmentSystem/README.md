# 🏥 Saint Mary Hospital Management System
A console-based Java application designed to simulate a simple hospital management workflow.  
The system allows staff to register patients, assign medical services, track extra services, update patient status, and maintain a full activity history.

This project demonstrates object‑oriented programming principles such as:
- Encapsulation
- Interfaces
- Enums
- ArrayLists
- Input validation
- Multi-class architecture

---

## 📌 Features

### 👤 Patient Management
- Add new patients with assigned **priority** and **status**
- Select an existing patient from the list
- Update a patient’s medical status
- View full history of actions for each patient

### 🧪 Medical Services
- Choose from predefined hospital services (Blood Test, MRI, X-Ray, Surgery)
- Automatically calculate service cost
- Add service entries to patient history

### ➕ Extra Services
- Select optional extra services (Anaesthesia, Fast Track, Private Room, Special Equipment)
- Add extra service entries to patient history

### 💰 Billing
- Combine selected services and extra services to compute total cost

---

## 🧱 Class Structure

### `Main`
Handles:
- Menu navigation
- User input
- Calling the appropriate methods from other classes
- Managing the selected patient

### `Patient`
Stores:
- Name
- Priority (enum)
- Status (enum)
- History (ArrayList<String>)

Provides:
- Setters for priority and status
- Method to add entries to history
- Method to display history

### `PatientArray`
Responsible for:
- Storing all patients
- Adding new patients
- Selecting a patient
- Changing patient status with validation

### `Services` & `ExtraServices`
Implement the `Hospital` interface.  
Store:
- Name
- Price

### `ServicesArray` & `ExtraServicesArray`
Contain predefined lists of available services.  
Allow the user to select a service safely with input validation.

### `FinalClass`
Stores the selected service and extra service for billing.  
Calculates the total cost.

---

## 🧩 Enums

### `Priority`
Represents the urgency level of a patient:

### `Status`
Represents the medical progress of a patient:

Enums ensure:
- No invalid values
- No spelling mistakes
- Clean and safe logic

---

## 🔄 How the System Works

1. **Add Patient**
    - Enter name
    - Choose priority
    - Choose status
    - Patient is stored in the system

2. **Select Patient**
    - Choose from the list
    - All future actions apply to this patient

3. **Choose Service / Extra Service**
    - Select from predefined lists
    - Service is added to patient history
    - Stored in `FinalClass` for billing

4. **Change Status**
    - Select patient
    - Choose new status
    - Status updated and logged in history

5. **Show History**
    - Displays all actions performed on the selected patient

6. **Exit**
    - Ends the program

---

## ▶️ Example Flow


---

## 🚀 Future Improvements

- Add multiple services per patient instead of only one
- Add date/time stamps to history entries
- Add doctor assignment
- Add room assignment
- Add full billing report per patient
- Save data to file (CSV/JSON)
- GUI version with JavaFX

---

## 📚 Technologies Used
- Java 17+
- OOP principles
- Console I/O
- ArrayList
- Enums
- Interfaces

---

## 👨‍💻 Author
Developed by **Angelos Chaliasis** as part of a Java OOP learning project.

