def call() {
    pipeline {
        agent any
        tools {
            go 
        }
        stages {
            stage('Build') {
                steps {
                    script {
                        sh 'go build .'
                    }
                }
            }
        }
    }
}
