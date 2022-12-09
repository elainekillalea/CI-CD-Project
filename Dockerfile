FROM openjdk:17
COPY target/test-classes/ /tmp
WORKDIR /tmp
CMD java CalculatorMain