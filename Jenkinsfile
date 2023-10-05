pipeline {
  agent any
  triggers {
    pollSCM '*/5 * * * *'
  }
  tools {
    maven "Maven"
  }
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
        //sh 'mvn clean'// for mac
        bat 'mvn clean' // for windows
        echo 'Build step completed'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing..'
        sh 'mvn test'// for mac
        //bat 'mvn test' // for windows
        echo 'End Testing..'
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