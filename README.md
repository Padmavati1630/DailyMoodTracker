# Daily Mood Tracker 📝

## 📌 Overview

This is a *Spring Boot CRUD project* developed in *Eclipse IDE*.
The application helps users *track their daily moods* along with details like intensity, activities, and personal notes. It’s a simple yet effective way to monitor emotional well-being over time.

---

## 🚀 Features

* ➕ Add a new mood entry (date, mood, intensity, activity, notes, rating)
* ✏ Update existing mood entries
* ❌ Delete entries
* 📖 View all moods in a structured table
* 📊 Track mood trends over time

---

## 🛠 Tech Stack

* *Java 17* (or version you are using)
* *Spring Boot*
* *Spring Data JPA (Hibernate)*
* *MySQL* (or H2 for in-memory testing)
* *Thymeleaf* (for front-end templates)
* *Eclipse IDE*
* *Git + GitHub* for version control

---

## 📂 Project Structure


MoodTracker/
 ┣ src/main/java/com/assignment/Assignment
 ┃ ┣ controller/      # Handles web requests
 ┃ ┣ entity/          # Mood_tracker entity
 ┃ ┣ repository/      # JPA repository interface
 ┃ ┗ service/         # Business logic (if any)
 ┣ src/main/resources/
 ┃ ┣ templates/       # Thymeleaf HTML pages
 ┃ ┗ application.properties
 ┣ pom.xml            # Maven dependencies
 ┣ README.md          # Project documentation


---

## ⚡ Getting Started

### 1️⃣ Clone the repository

bash
git clone https://github.com/username/mood-tracker.git
cd mood-tracker


### 2️⃣ Configure Database

In src/main/resources/application.properties, update your DB settings:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/moodtracker
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


### 3️⃣ Run the Application

From Eclipse → Run as *Spring Boot App*
or from terminal:

bash
mvn spring-boot:run


### 4️⃣ Access in Browser

Open [http://localhost:8080](http://localhost:8080)

---

## ✨ Future Enhancements

* 📊 Add charts to visualize mood patterns
* 🔒 User authentication (login & signup)
* 📱 Responsive UI for mobile tracking

---

## 👩‍💻 Author

*Padmavati M Shivanagutti*
Developed as part of an academic project using *Spring Boot & Eclipse*.
