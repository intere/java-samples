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


## Work Log

### 7/15/2015
Greg dropped in and we worked on the MonthsOfTheYear code (``com.java.learning.greg.months`` package)
We took the code he had and went through how Enumerations work.  The assignment stated that he was supposed
to use switch statements to map the month number to month enum.  So we implemented it this way, but we also
implemented it using an alternative method (iterating over the ``values()`` method of the enum).  We setup
JUnit test fixtures to perform several assertions of the MonthsInYear code.  We then went back to the Driver
(MonthsOfTheYearDriver.java) and wired the MonthsInYear enum to the driver.

We talked about the following points:
* Encapsulation
    * Month Mapping logic lives in MonthsInYear.java, but Driver interacts with the user and delegates
* Unit Testing
* Best Practices
    * How to separate your code, and why.
