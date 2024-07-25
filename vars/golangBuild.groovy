def call() {
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    script {
                        go build .
                    }
                }
            }
            stage('Test') {
                steps {
                    script {
                        go test ./... -cover
                    }
                }
            }
        }
    }
}
