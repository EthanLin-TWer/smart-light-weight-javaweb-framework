node () {
    stage 'Run tests'
    def mavenHome = tool("M3")
    env.PATH = "${mavenHome}/bin:${env.PATH}"
    sh 'mvn test'
}