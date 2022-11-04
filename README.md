# CI-CD-Project


TeamCity 
	-Set up CI/CD Tools & Configuration
		-TeamCity can help as it has many plugins out of the box e.g. Gradle, NodeJS, you don’t need to install and configure any of those plugins.

	-Configuration as Code
		-TeamCity offers two solutions for configuration, via the UI and via the code.
	
		-Easier for more complex projects which need lots of steps.
		-Configurations can be written in Kotlin DSL, Since Kotlin is a full-fledged programming language
		-It makes it easier for developers to script their CI/CD pipelines.
	
	-Build Chains a.k.a Pipelines
		-Create build chains with your builds by defining dependencies between them , whenever you build TC will check all the dependent builds and run the first incorrect order.
		-Pass artefacts or the outputs from one build to another.
		-Runs build in parallel, for example, run the same test in a different browser or different OS, etc.
	
	-Personal builds
		-You can run builds directly from your code editor.
		-Useful to test your changes before committing and integrating them into the existing codebase.
		-It is available on popular code editors, i.e: Intellij, VS Code, Eclipse.
	
	-TeamCity Architecture
		-TeamCity Server: 
		It provides the UI for managing build configurations.
		
		-Build Agents:
		Executes build configuration or build jobs
		Connect as many as you want
		They Can be installed anywhere from on-premise, cloud providers or docker containers
		Different tools can be installed on different agents, like node, Gradle, Docker, etc.
		TC automatically detects, which build agent can execute which build based on the build configuration. 
		
	It's automation server is easy to use, configure and set up the installation and integrating with the version control systems.

	It cannot build processes for multiple branches at a time.

	It is not widely used and has fewer users. It also has less documentation on its website than competitors.

	It has a security feature by default and password masking unlike its competitors.

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
