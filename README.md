# Queue Data Structures in Java

This repository contains implementations of essential Queue data structures in Java, including **Custom Queue**, **Circular Queue**, and **Dynamic Queue**. The implementations utilize **Generics** for type flexibility and include proper **exception handling** for robust and safe operations. These queues are fundamental concepts in Data Structures and Algorithms (DSA) and are used in various applications, including task scheduling, buffering, and more.

## Project Overview 📚

As part of my learning journey in DSA using Java, I implemented various Queue data structures, gaining knowledge through YouTube tutorials and putting it into practice using IntelliJ IDEA. The project includes:

### Custom Queue
- **Description:** A basic implementation of a Queue using an array, with enqueue and dequeue operations.
- **Exception Handling:** Handles underflow (dequeue from an empty queue) and overflow (enqueue to a full queue) scenarios.
- **Complexity:** O(1) for both enqueue and dequeue operations.

### Circular Queue
- **Description:** A more efficient queue implementation that reuses empty spaces after elements are dequeued, utilizing a circular array.
- **Exception Handling:** Proper handling of full and empty queue conditions.
- **Complexity:** O(1) for enqueue and dequeue operations.

### Dynamic Queue
- **Description:** An extension of the Circular Queue that automatically resizes itself when the capacity is reached, optimizing memory usage.
- **Generics:** Implemented using generics to support various data types.
- **Exception Handling:** Ensures safe operation even when the queue expands or shrinks dynamically.
- **Complexity:** O(1) for enqueue and dequeue operations, and O(n) when resizing.

## Get Started 🚀

To get started with this project, simply clone this repository and open the desired queue implementation file in your preferred Java IDE (e.g., IntelliJ IDEA). No additional setup is required!

```bash
git clone https://github.com/jawwadkhan777/Queue-Data-Structure.git
```

## Support and Feedback 📧

If you encounter any issues while using this repository or have any suggestions for improvement, please feel free to reach out to the developer, Muhammad Jawwad Khan, via [email](mailto:m.jawwadkhan777@gmail.com) or connect on [LinkedIn](https://www.linkedin.com/in/jawwadkhan777/).