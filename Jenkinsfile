pipeline {
   agent any
   stages{
     stage('Build'){
        steps{
          sh 'home/utility/maven-3.6.0/apache-maven-3.6.0/bin/mvn clean install'
        }
     }
     
      stage('Test'){
        steps{
          sh 'home/utility/maven-3.6.0/apache-maven-3.6.0/bin/mvn clean test'
        }
     }
   }
}
