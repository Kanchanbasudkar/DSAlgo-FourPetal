pipeline {
  agent any
  triggers {
    pollSCM '*/5 * * * *'
  }
  tools {
    maven "Maven 3.23"
  }
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
        sh 'mvn clean'
        echo 'Build step completed'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing..'
        sh 'mvn test'
        echo 'End Testing..'
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