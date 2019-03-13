pipeline {
    agent any
    stages{
        stage('CleanWorkspace'){
            steps {
                echo "test 1"
                echo "test 1.test1"
                echo "test1... test1"
            }
        }
        stage('Checkout') {
            steps {  
                echo "test 1"    
            }
        }
    }
}
