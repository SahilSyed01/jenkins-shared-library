#!groovy

def call(){
  pipeline{
  agent any
  stages{
    stage('Build'){
          steps{
            script{
              build()
            }
          }
    }
  }
}
}
