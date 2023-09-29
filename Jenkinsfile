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
        sh 'mvn clean install'
        echo 'Build step completed'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing..'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying....'
      }
    }
  }
}