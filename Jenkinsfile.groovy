node ('main') {

    stage 'Run tests'
    git([
        url: 'git@github.com:linesh-simplicity/smart-light-weight-javaweb-framework.git',
        branch: 'master'
    ])

    def mavenHome = tool("Maven 3")
    env.PATH = "${mavenHome}/bin:${env.PATH}"
    sh 'pwd'
    sh 'tree'
//    sh 'mvn test'
}