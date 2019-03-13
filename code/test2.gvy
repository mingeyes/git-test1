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
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], 
                                            doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], 
                                            userRemoteConfigs: [[credentialsId: '28661b99-b4ec-4540-ad3d-9bef5c2e7562', 
                                            url: 'git@github.com:mingeyes/scm-sc2.git']]])
            }
        }
        stage('Build') {
            steps {
                sh 'sh $WORKSPACE/test2.sh'
            }
        }
    }
}
