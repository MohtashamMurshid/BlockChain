# Blockchain Program

## Overview

This Java program demonstrates the basic concept of a blockchain by creating and managing a series of blocks in a chain. The program includes a `Block` class for defining individual blocks and a `BlockChainProgram` class for managing the blockchain and demonstrating its functionality.

## Features

- **Initial Blockchain Setup**: Initializes a blockchain with a starting block containing initial values.
- **Adding New Blocks**: Adds new blocks to the blockchain with transaction data and references to previous blocks.
- **Display Blockchain**: Prints the details of each block and the entire blockchain to the console.

## File Structure

- **`BlockChainProgram.java`**: The main class that demonstrates the creation and management of a blockchain.
- **`Block.java`**: Defines the structure and functionality of a block in the blockchain.

## Code Explanation

- **`BlockChainProgram.java`**:
  - **Initial Setup**: Creates the first block with initial transaction values and adds it to the blockchain.
  - **Adding New Blocks**: Creates a second block with additional transactions, referencing the hash of the previous block.
  - **Output**: Prints details of the blockchain to the console.

- **`Block.java`**:
  - Defines the properties and methods of a block, including transaction data, block hash, and previous block hash.

## Installation

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Clone the repository or download the source code.
3. Compile the Java files using your preferred IDE or command line:
   ```bash
   javac Block.java BlockChainProgram.java
   ```
4. Run the `BlockChainProgram` class:
   ```bash
   java BlockChainProgram
   ```

## Running the Program

1. Compile the Java files as described above.
2. Execute the `BlockChainProgram` class to see the demonstration of blockchain functionality.
3. The output will show the details of each block and the state of the blockchain in the console.

## Dependencies

- Java JDK

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or issues, please contact mohtashamuseless@gmail.com or open an issue on the project's repository.

---

