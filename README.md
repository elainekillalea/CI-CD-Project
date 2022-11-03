# CI-CD-Project

Jenkins
- Most companies use Jenkins
- divided into two parts
    - a control server 
    - an agent node
- Pipeline code can be stored in a versional control like GIT
- Thousand of pre-built plugins
- Can use foresight to debug failed test
- Two main Pipelines in Jenkins Scripted and Declarative
- Scripted 
  - Uses Groovy language 
    - making numerous API's available
  - scripted syntax is power but it makes the pipeline hard to read hence you must use API's

- Declarative 
  - follows a newer syntax
    - this narrows the cope of the pipeline
      - gives a defined "minimum necessary structure"
    - declarative syntax follows statement logic
      - which generates a series of stages 
  - Does not have access to API's but is much easier to read
  
- Stages
  -stages are sequential block of pipeline processes that are executed in order
  - each stage is a self-contained unit of work
  - they are chained together to form pipelines
  
- There are two stages for declarative pipelines
  - parallel stage and Sequential stage
    - parallel stage 
      - variable numbers of stages can be executed together
        - common and well known for unit build and tests for across multiply platforms
        - developers can abort parallel stages if if one causes a problem
    - Sequential stage
      - extends the capability of the parallel stage
        - allowing nesting of multiple stages withing each parallel branch 
        - Allows more visibility into the sequence of stages 
