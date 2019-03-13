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
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], 
                            doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], 
                            userRemoteConfigs: [[credentialsId: '28661b99-b4ec-4540-ad3d-9bef5c2e7562', 
                            url: 'git@github.com:mingeyes/scm-sc1.git']]])
            }
        }
        stage('Build') {
            steps {
                sh '$WORKSPACE/test1.sh'                
            }
        }
    }
}
