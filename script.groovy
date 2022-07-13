node {  
    stage('Build') { 
        git 'https://github.com/komalgiradkar/new-ansible.git'
    }
    stage('Test') { 
        sh 'mkdir rupam'

    }
    stage('Deploy') { 
        sh 'echo \' welcome to katol\'  >> rushi.txt'
    }
}