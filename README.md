# Asynchronous banking System

## Overview
This project simulates a banking system, utilizing concepts of multithreading, network communication, and transaction processing. The simulation models the interactions between clients and a server through a simulated network. It manages transactions such as deposits, withdrawals, and balance queries across multiple accounts.

## System Components

### Accounts Class
Represents bank accounts with attributes like account number, type, holder's name, and balance.

### Transactions Class
Handles transaction details such as account number, transaction type, amount, balance after transaction, and transaction status.

### Client Class
Simulates the role of bank clients that send and receive transactions. Clients operate in two modes: sending transactions to the server and receiving processed transactions from the server.

### Server Class
Processes transactions received from clients. Supports operations like deposits, withdrawals, and balance inquiries. It ensures thread safety and manages concurrent access to account data.

### Network Class
Acts as the communication layer between clients and servers, managing the transmission of transactions. It uses semaphores to control access to network buffers and handle synchronization between threads.

## Key Features

- **Multithreading**: The server and network components run as separate threads, allowing for simultaneous processing of transactions and network operations.
- **Synchronization**: Utilizes semaphores to manage concurrent access to shared resources, preventing data inconsistencies during transaction processing.
- **Error Handling**: Implements robust error handling to manage input mismatches when reading transaction and account data.

## How to Run

1. **Compile the Java Code**: Ensure all Java files are compiled without errors using a Java compiler (JDK).
2. **Run the Driver**: Start the simulation by running the `Driver` class. This class initializes the network, server, and client threads.

## Configuration

- The system reads initial data from `account.txt` for account information and `transaction.txt` for transaction data. Ensure these files are correctly formatted and located in the application's running directory.
- Adjust `maxNbTransactions` and `maxNbAccounts` in the `Client` and `Server` classes respectively to change the limits on the number of transactions and accounts the simulation can handle.

## Output

- All output, including debugging information and the final results of transactions, are directed to a file named `Semaphore3test.txt`.

