# Declarative Pipeline Lab

A beginner-friendly lab exercise for learning Jenkins Declarative Pipelines with a real Java/Maven project.

## 📋 Quick Overview

This project demonstrates how to create a complete Jenkins declarative pipeline with:
- **Java 17** application with basic functionality
- **Maven 3.6.3** for build management
- **JUnit 5** for unit testing (10 comprehensive tests)
- **Jenkinsfile** with 7 pipeline stages
- **Complete documentation** for step-by-step execution

## 🎯 What You'll Learn

✓ Structure of a Jenkins declarative pipeline  
✓ Building and testing Java projects with Maven  
✓ Understanding pipeline stages and execution flow  
✓ Integration with version control (Git/GitHub)  
✓ Post-pipeline actions and artifact archiving  

## 📁 Project Structure

```
DeclarativePipelineLab/
├── src/
│   ├── main/java/com/example/
│   │   └── Sample.java              # Simple application class
│   └── test/java/com/example/
│       └── SampleTest.java          # 10 JUnit 5 tests
├── pom.xml                           # Maven configuration
├── Jenkinsfile                       # Jenkins declarative pipeline
└── README.md                         # This file
```

## 🔧 Prerequisites

- **OpenJDK 17** or later
- **Maven 3.6.3** or later
- **Jenkins** (latest LTS recommended)
- **Git** for version control
- **Ubuntu OS** (Linux)

## 🚀 Quick Start

### 1. Clone the Repository
```bash
git clone https://github.com/neerajk555/Declarative-Pipeline-Lab.git
cd Declarative-Pipeline-Lab
```

### 2. Build Locally
```bash
mvn clean package
```

### 3. Run Tests
```bash
mvn test
```

### 4. Set Up Jenkins Pipeline

Follow the **[DECLARATIVE_PIPELINE_GUIDE.md](../DECLARATIVE_PIPELINE_GUIDE.md)** for complete step-by-step instructions on:
- Installing and configuring Jenkins
- Creating a pipeline job
- Running your first declarative pipeline
- Understanding each pipeline stage

## 📖 Documentation

- **[DECLARATIVE_PIPELINE_GUIDE.md](../DECLARATIVE_PIPELINE_GUIDE.md)** - Complete lab exercise with detailed instructions
- **[pom.xml](./pom.xml)** - Maven configuration with Java 17 and JUnit 5
- **[Jenkinsfile](./Jenkinsfile)** - Declarative pipeline definition
- **[Sample.java](./src/main/java/com/example/Sample.java)** - Application source code
- **[SampleTest.java](./src/test/java/com/example/SampleTest.java)** - Unit tests

## 🔄 Pipeline Stages

The declarative pipeline includes 7 stages:

1. **Initialization** - Setup environment and display info
2. **Checkout** - Get source code from repository
3. **Build** - Compile with Maven
4. **Test** - Run JUnit tests (10 tests)
5. **Code Quality** - Analyze code metrics
6. **Package** - Create JAR artifact
7. **Archive** - Store build artifacts

## 📊 Sample Application Features

The `Sample` class includes:
- `add(a, b)` - Arithmetic addition
- `subtract(a, b)` - Arithmetic subtraction
- `multiply(a, b)` - Arithmetic multiplication
- `greet(name)` - String greeting method

All methods are thoroughly tested with 10 JUnit 5 test cases covering:
- Positive numbers
- Negative numbers
- Zero values
- Edge cases
- Null checks

## ✅ Expected Build Output

```
[INFO] BUILD SUCCESS
[INFO] Total time: 5.234 s
[INFO] Finished at: 2024-01-15T10:30:45+00:00

Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
```

## 🛠️ Common Commands

### Maven Commands
```bash
mvn clean              # Remove build artifacts
mvn compile            # Compile source code
mvn test               # Run tests
mvn package            # Create JAR
mvn clean package      # Clean and build
mvn help:describe      # Get plugin help
```

### Run the Application
```bash
# After building
java -jar target/declarative-pipeline-lab-1.0.0.jar

# Or run main class
mvn exec:java -Dexec.mainClass="com.example.Sample"
```

## 🐛 Troubleshooting

### Issue: mvn: command not found
```bash
# Install Maven
sudo apt install maven

# Or add to PATH
export PATH=/usr/share/maven/bin:$PATH
```

### Issue: JAVA_HOME not set
```bash
# Find Java path
which java

# Set JAVA_HOME
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64

# Verify
echo $JAVA_HOME
```

### Issue: Tests fail
- Ensure you have Java 17+ installed
- Run `mvn clean compile` first
- Check test file naming: must be `*Test.java`

For more detailed troubleshooting, see the [DECLARATIVE_PIPELINE_GUIDE.md](../DECLARATIVE_PIPELINE_GUIDE.md#troubleshooting).

## 📚 Learning Path

1. **Start here**: Read this README
2. **Then**: Follow [DECLARATIVE_PIPELINE_GUIDE.md](../DECLARATIVE_PIPELINE_GUIDE.md)
3. **Examine**: Review the Jenkinsfile for pipeline syntax
4. **Experiment**: Modify Sample.java and add tests
5. **Extend**: Add more pipeline stages

## 🎓 Key Concepts

### Declarative Pipeline
```groovy
pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
```

### Maven Lifecycle
1. **clean** - Remove previous builds
2. **compile** - Compile source code
3. **test** - Run tests
4. **package** - Create JAR/WAR
5. **install** - Add to local repository

### JUnit 5 Features
- `@Test` - Mark test methods
- `@DisplayName` - Human-readable test names
- `@BeforeEach` - Setup before each test
- `assertEquals()` - Assert equality
- `assertTrue()`, `assertFalse()` - Boolean assertions

## 📝 Java 17 Features Used

- Records (if applicable)
- Pattern matching (var statements)
- Text blocks (multi-line strings)
- Sealed classes support

## 🔐 Security Notes

- Never commit sensitive data
- Use environment variables for credentials
- Review Jenkinsfile before execution
- Keep dependencies updated

## 📞 Support & Resources

- **Jenkins Docs**: https://www.jenkins.io/doc/
- **Maven Docs**: https://maven.apache.org/
- **Java 17 Docs**: https://openjdk.org/projects/jdk/17/
- **JUnit 5 Guide**: https://junit.org/junit5/

## 🤝 Contributing

To extend this lab:
1. Add new methods to `Sample.java`
2. Write corresponding tests in `SampleTest.java`
3. Update the Jenkinsfile with new stages
4. Document your changes

## 📄 License

This lab exercise is provided for educational purposes.

## ✨ Next Steps After Completion

- Add integration tests
- Configure GitHub webhooks for automatic builds
- Set up email notifications
- Add SonarQube code quality analysis
- Implement automated deployment stages
- Create multi-branch pipeline
- Set up Docker containerization

---

**Ready to start?** Follow the [DECLARATIVE_PIPELINE_GUIDE.md](../DECLARATIVE_PIPELINE_GUIDE.md) for complete step-by-step instructions!

🚀 Happy Learning!
