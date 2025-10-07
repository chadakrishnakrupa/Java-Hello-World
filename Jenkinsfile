pipeline{
    agent any

    tools {
         jdk 'java'
    }

    stages{
        stage('checkout'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github access', url: 'https://github.com/chadakrishnakrupa/Java-Hello-World.git']]])
            }
        }
        stage('build'){
            steps{
               bat 'javac helloWorld.java'
            }
        }
    }
}
