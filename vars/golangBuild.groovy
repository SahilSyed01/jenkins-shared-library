def call() {
    pipeline {
        agent any
        tools {
            go 'go1.22.5'
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
