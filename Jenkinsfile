pipeline {

    agent any

    stages {

        stage('Clone') {

            steps {

                git branch: 'main',
                url: 'https://github.com/sarodesayali11/orangehrm-cucumber-framework.git'
            }
        }

        stage('Build') {

            steps {

                bat 'mvn clean test'
            }
        }
    }
}