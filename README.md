
# Smart Home System — Facade Pattern

## Project Description

This project demonstrates the Facade Design Pattern in Java.

The Smart Home System allows users to control multiple home subsystems
through one simple interface.

## Subsystems

- LightSystem — controls the lights.
- ClimateSystem — controls the air conditioner.
- SecuritySystem — activates and deactivates the alarm.
- DoorLockSystem — locks and unlocks the door.

## Facade

SmartHomeFacade coordinates all four subsystems.

It provides two simple methods:

- leaveHome() — turns off the lights and air conditioner,
  activates the alarm, and locks the door.
- arriveHome() — unlocks the door, deactivates the alarm,
  turns on the lights and air conditioner.

## Design Pattern

The Facade Pattern provides a simplified interface to a complex subsystem.

The client uses SmartHomeFacade instead of communicating
with each subsystem separately.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Open Main.java.
3. Run the main() method.

## Clean Code Principles

1. Meaningful Names — class and method names describe their purpose.
2. Single Responsibility Principle — each subsystem controls one part of the smart home.
3. Encapsulation — subsystem objects are private inside the facade.
4. Loose Coupling — Main depends on SmartHomeFacade rather than individual subsystems.
5. Small Methods — leaveHome() and arriveHome() represent focused operations.

## Technologies

- Java
- IntelliJ IDEA
- Facade Design Pattern
