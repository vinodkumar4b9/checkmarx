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
            
            load './post.groovy'
        }
    }
}
