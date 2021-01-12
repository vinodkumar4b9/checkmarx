pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
              
                 sh "echo vinodkumar"
                 sh "rmdir mahesh"
                 

                 
                 
               }
        
        }
        
    }
    
    post { 
        always { 
            sh "chmod +x ./post.sh"
            sh "./post.sh"
        }
    }
}
