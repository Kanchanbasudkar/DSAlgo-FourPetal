pipeline {
  agent any
  triggers {
    pollSCM '*/5 * * * *'
  }
  tools {
    maven "Maven 3.9.4"
  }
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
        sh 'mvn -D clean'
        echo 'Build step completed'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing..'
        sh 'mvn test'
        echo 'End Testing..'
      }
      post {
                      // If Maven was able to run the tests, even if some of the test
                      // failed, record the test results and archive the jar file.
                      success { allure([
                          includeProperties: false,
                          jdk: '',
                          properties: [],
                          reportBuildPolicy: 'ALWAYS',
                          results: [[path: 'target/allure-results']]
                      ])
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