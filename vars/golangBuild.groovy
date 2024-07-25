def call() {
    pipeline {
        agent any
        tools {
            go 'go'
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
