node ('main') {

    stage 'Run tests'
    git([
        url: 'git@github.com:linesh-simplicity/smart-light-weight-javaweb-framework.git',
        branch: 'master'
    ])

    def mavenHome = tool("Maven 3")
    env.PATH = "${mavenHome}/bin:${env.PATH}"
    sh 'cd ./pure-servlet-demo'
    sh 'pwd'
    sh 'mvn test'
}