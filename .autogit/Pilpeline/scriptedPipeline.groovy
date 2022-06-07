node {  
    stage('Pull') { 
        git 'https://github.com/shubhamkalsait/studentapp-ui.git'
    }
    stage('Build') { 
        echo 'Buidl Successful'
    
    stage('Test') { 
        echo 'test successful' 
    }
    stage('Deploy') { 
        echo 'deploy successful'
    }
}
