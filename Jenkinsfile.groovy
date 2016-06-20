node () {
    stage 'Run tests'
    def mavenHome = tool("Maven 3")
    env.PATH = "${mavenHome}/bin:${env.PATH}"
    sh 'mvn test'
}