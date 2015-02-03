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
