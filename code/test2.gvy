pipeline {
    agent any
    stages{
        stage('CleanWorkspace'){
            steps {
                echo "test 2"
            }
        }
        stage('Checkout') {
            steps {  
                echo "test 2"    
            }
        }
    }
}
