pipeline {
    agent any
    stages{
        stage('CleanWorkspace'){
            steps {
                echo "test 1"
                echo "test 1..."
            }
        }
        stage('Checkout') {
            steps {  
                echo "test 1"    
            }
        }
    }
}
