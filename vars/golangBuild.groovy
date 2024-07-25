#!groovy

def call(){
  pipeline{
          agent any
          stages{
           stage('Build'){
            steps{
             script{
               go build .
          }
        }

      }
      stage('test'){
          steps{
            script{
              go test ./... -cover
            }
          }
        }
    }
  }
}
