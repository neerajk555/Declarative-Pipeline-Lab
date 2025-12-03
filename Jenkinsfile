pipeline {
    agent any
    
    // Environment variables that will be available throughout the pipeline
    environment {
        JAVA_HOME = '/usr/lib/jvm/java-17-openjdk'  // Update this path for your Ubuntu system
        MAVEN_HOME = '/usr/share/maven'              // Update this path for your Maven installation
        PROJECT_NAME = 'Declarative Pipeline Lab'
        BUILD_TIMESTAMP = sh(script: "date '+%Y-%m-%d_%H:%M:%S'", returnStdout: true).trim()
    }

    options {
        // Keep last 10 builds
        buildDiscarder(logRotator(numToKeepStr: '10'))
        // Add timestamps to console output
        timestamps()
    }

    triggers {
        // Poll the repository every 15 minutes
        pollSCM('H/15 * * * *')
    }

    stages {
        stage('Initialization') {
            steps {
                script {
                    echo "╔══════════════════════════════════════════════════════╗"
                    echo "║     Welcome to Declarative Pipeline Lab!             ║"
                    echo "║     Project: ${PROJECT_NAME}                         ║"
                    echo "║     Build Timestamp: ${BUILD_TIMESTAMP}              ║"
                    echo "╚══════════════════════════════════════════════════════╝"
                }
                // Print environment details
                sh '''
                    echo "Java Version:"
                    java -version
                    echo "Maven Version:"
                    mvn -version
                    echo "Current Directory:"
                    pwd
                    echo "Directory Contents:"
                    ls -la
                '''
            }
        }

        stage('Checkout') {
            steps {
                echo "Checking out source code from Git repository..."
                // In a real scenario, this would clone from GitHub
                // For this lab, code is already present
                sh 'echo "Source code is ready for building"'
            }
        }

        stage('Build') {
            steps {
                echo "Building the Maven project..."
                sh '''
                    mvn clean package -DskipTests
                    echo "✓ Build completed successfully!"
                '''
            }
        }

        stage('Test') {
            steps {
                echo "Running unit tests..."
                sh '''
                    mvn test
                    echo "✓ All tests executed!"
                '''
            }
        }

        stage('Code Quality') {
            steps {
                echo "Performing code quality checks..."
                script {
                    // Count Java files
                    def javaFiles = sh(script: "find . -name '*.java' -type f | wc -l", returnStdout: true).trim()
                    echo "Found ${javaFiles} Java files"
                    
                    // Count lines of code
                    def linesOfCode = sh(script: "find ./src -name '*.java' -type f -exec wc -l {} + | tail -1 | awk '{print $1}'", returnStdout: true).trim()
                    echo "Total lines of code: ${linesOfCode}"
                }
                sh 'echo "✓ Code quality checks completed!"'
            }
        }

        stage('Package') {
            steps {
                echo "Packaging the application..."
                sh '''
                    # The JAR is already created by Maven, let's verify it
                    if [ -f target/declarative-pipeline-lab-1.0.0.jar ]; then
                        echo "✓ JAR file created successfully!"
                        ls -lh target/*.jar
                    else
                        echo "✗ JAR file not found!"
                        exit 1
                    fi
                '''
            }
        }

        stage('Archive') {
            steps {
                echo "Archiving build artifacts..."
                script {
                    // Archive the built artifacts
                    archiveArtifacts artifacts: 'target/**/*.jar', 
                                     allowEmptyArchive: false
                    echo "✓ Artifacts archived!"
                }
            }
        }
    }

    post {
        always {
            echo "═════════════════════════════════════════════════════════"
            echo "Pipeline execution completed!"
            echo "═════════════════════════════════════════════════════════"
            
            // Print test results summary
            junit testResults: 'target/surefire-reports/*.xml', 
                  allowEmptyResults: true
        }

        success {
            echo "✓ Pipeline completed successfully!"
            echo "Build artifacts are available in the 'target' directory"
        }

        failure {
            echo "✗ Pipeline failed! Check the logs above for errors."
        }

        unstable {
            echo "⚠ Pipeline is unstable. There may be test failures."
        }

        cleanup {
            echo "Cleaning up workspace..."
            deleteDir()
        }
    }
}
