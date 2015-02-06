# Samples
So this is a repository to help you learn some java, and programming.

## Building / Running
This project is built with [Apache Maven](http://maven.apache.org/)

To build this project (after installing maven, and ensuring it's in your path, you can run the following command)
```bash
mvn clean install
```

Running the application
```bash
# Show me 5 primes:
mvn exec:java -Dexec.args=5

# Show me 5000 primes:
mvn exec:java -Dexec.args=5000
```

Greg and I worked on a heuristic that cuts down the number of computations needed to determine if a number is in-fact: Prime.  Here are the runt time results of calculating the first 5000 primes (on my [pretty speedy] iMac)
```
Method 1: 1.384s (no heuristic)
Method 2: 0.765s (with square root heuristic)
```
