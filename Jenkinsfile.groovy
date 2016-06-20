node () {
    stage 'Run tests'
    git url: 'git@github.com:linesh-simplicity/smart-light-weight-javaweb-framework.git'
    checkout scm
    env.PATH = "${tool 'Maven 3'}/bin:${env.PATH}"
    sh 'mvn test'
}