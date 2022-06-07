pipeline {
    agent any
    stages {
        stage('Pull'){
            steps {
                git 'https://github.com/shubhamkalsait/studentapp-ui.git'
            }
        }
        stage('Build'){
            steps {
                echo 'Build Successful'
            }
        }
        stage('Test'){
            steps {
                echo 'Test Successful by Hitesh'
            }
        }
        stage('Deploy'){
            steps {
                echo 'Deploy Successful by Hitesh'
            }
        }
    }
}