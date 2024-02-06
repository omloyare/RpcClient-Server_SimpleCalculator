# Magical Remote Calculator

## Description
Imagine having a magical calculator that can solve math problems for you, even from a distance! With this Java project, you can create your own remote calculator service using Remote Method Invocation (RMI).

## How it Works
### 1. Setting Up the Calculator
- Define the operations the calculator can perform (addition, subtraction, multiplication, division) by creating the `Calculator` interface (`Calculator.java`) and its implementation `CalculatorImpl` (`CalculatorImpl.java`).

### 2. Making the Calculator Available
- Create a server (`RpcServer.java`) that hosts the calculator service.
- Register the calculator implementation with the RMI registry, making it accessible to remote clients.

### 3. Using the Calculator
- Connect to the server from anywhere using the client code (`RpcClient.java`).
- Input two numbers and select the desired operation.
- The server executes the operation and sends the result back to the client.

## Running the Code
1. Start the server (`RpcServer`) to make the calculator service available.
2. Run the client (`RpcClient`) to connect to the server and use the calculator remotely.

## Summary
This project enables you to create a magical calculator that can solve math problems for you remotely. It's like having a friend with a super-smart calculator that you can access from anywhere!
