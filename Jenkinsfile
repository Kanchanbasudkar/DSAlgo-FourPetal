pipeline {
  agent any
  triggers {
    pollSCM '*/5 * * * *'
  }
  tools {
    maven "Maven 3.9.4"
  }
  stages {
  stage('Check versions') {
        steps {
          echo 'Check versions maven..'
          bat 'mvn -version'
          echo 'Check versions java..'
          bat 'java -version'
          echo 'End Check versions..'
        }
      }
    stage('Build') {
      steps {
        echo 'Building..'
        bat 'mvn clean'
        echo 'Build step completed'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing..'
        bat 'mvn test'
      }
      post {
        success {
          allure([
            includeProperties: false,
            jdk: '',
            properties: [],
            reportBuildPolicy: 'ALWAYS',
            results: [
              [path: 'target/allure-results']
            ]
          ])
        }
      }
    }
    stage('Cucumber Reports') {
      steps {
        cucumber buildStatus: "UNSTABLE",
          fileIncludePattern: "**/cucumber.json",
          jsonReportDirectory: 'target'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying....'
      }
    }
  }
}