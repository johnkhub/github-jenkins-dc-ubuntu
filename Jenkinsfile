pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                
                sh 'docker-compose version'
                //sh 'sudo chmod a+rwx'
                sh 'sudo docker-compose up'
                // sh 'docker version'
            }
        }
    }
}
